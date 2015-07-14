%{
/*
     This file is part of DUP.
     (C) 2008 The DUP team

     DUP is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published
     by the Free Software Foundation; either version 2, or (at your
     option) any later version.

     DUP is distributed in the hope that it will be useful, but
     WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
     General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with DUP; see the file COPYING.  If not, write to the
     Free Software Foundation, Inc., 59 Temple Place - Suite 330,
     Boston, MA 02111-1307, USA.
*/

/**
 * @file dup/dupparse.cc
 * @brief Generated parser code from flex and bison
 * @author Krista Grothoff
 */

#include <stdio.h>
#include "globals.h"
#include "process.h"
#include "edge.h"
#include "dupparse.h"
#include <vector>

using namespace std;

  vector<Process*> session_processes;
  Process* tmpproc;
  char* tmp_procid;
  int tmp_descnum;
  void yyerror(const char* s);
  extern "C"
     {
        int yyparse(void);
        extern int yylex (YYSTYPE * yylval_param );
        int yywrap()
           {
              return 1;
           }
     }
%}

%token <charptr> IDENTIFIER
%token <number> INTEGER
%token <charptr> PATH
%token <charptr> PIPE_OPERATOR
%token <charptr> REDIRECT_OPERATOR
%token <charptr> IPV6_ID
%token <charptr> DOT_ID
%token <charptr> COMMAND_TOK
%token <number> FINISHED
%token <character> DOLLAR
%token <character> LEFT_BRACKET
%token <character> RIGHT_BRACKET
%token <character> AT_SYMBOL
%token <character> COLON
%token <character> COMMA

%type <charptr> process_id
%type <edgenodeptr> proc_IO_id
%type <number> desc_number

%expect 2
%error-verbose
%pure-parser
%defines

%union 
{
  int number;
  char character;
  char* charptr;
  void* edgenodeptr;
}

%%

session: process_list;

process_list:	/* empty */
		| process
		| process_list process
	       	;

process:	process_id 
		{tmpproc = new Process(); tmpproc->process_id = $1;} 
		AT_SYMBOL host_info LEFT_BRACKET edge_list RIGHT_BRACKET 
		DOLLAR command argument_list
		{
		 session_processes.push_back(tmpproc);
		 tmpproc = NULL;
		}
		;

process_id:	IDENTIFIER
		{
		 $$ = $1;
		}
		;

host_info:	address COLON port
		| address
		;

port:		INTEGER
		{
		 tmpproc->portnum = $1;
		}
		;

address:	IPV6_ID 
		{
		 tmpproc->host_address = $1;
		}		
		| DOT_ID
		{
		 tmpproc->host_address = $1;
		}
		;

edge_list:	edge
		| edge_list COMMA edge
		;

edge:	proc_IO_id PIPE_OPERATOR proc_IO_id
    {
	    Edge* tmpnode = new Edge();
	    tmpnode->left = (EdgeNode*)($1);
	    tmpnode->right = (EdgeNode*)($3);
        tmpnode->op = DUP_PIPE;
        free($2); /* string is not kept/freed by proc data structure */
		tmpproc->add_edge(tmpnode);
		tmpnode = NULL;
        }
    | proc_IO_id REDIRECT_OPERATOR PATH
        {
    	Edge* tmpnode = new Edge();
		tmpnode->left = (EdgeNode*)($1);
		tmpnode->right = new EdgeNode($3);
		switch ($2[0]) {
		    case '<':
		       tmpnode->op = DUP_READ;
		       break;
		    case '>':
		       switch ($2[1]) {
			       case '\0':
			          tmpnode->op = DUP_WRITE;
			           break;
		           case '>':
			           if ($2[2] == '\0') {
			               tmpnode->op = DUP_APPEND;
			               break;
			           }
			       default:
			           /* fallthrough of '>' is intentional */
			           /* error */
			           break;
		       }
		       break;      
		    default:
		       /* error */
		       break;
		 }
		 free($2); /* string is not kept/freed by proc data structure */
		 tmpproc->add_edge(tmpnode);
		 tmpnode = NULL;
        }
        ;

proc_IO_id:		desc_number
		    {
            $$ = (void*)(new EdgeNode($1)); 
		    }
		    | remote_proc_info 
		    {
		    $$ = (void*)(new EdgeNode(tmp_procid, tmp_descnum)); 
		    tmp_procid = NULL;
		    tmp_descnum = -1;
		    }
            ;

desc_number:		INTEGER
			{
			 $$ = $1;
			}
			;

remote_proc_info:	process_id COLON desc_number
			{ 
			 tmp_procid = $1; tmp_descnum = $3; 
			}  	
			;
							       
command:	COMMAND_TOK 
		{
		 tmpproc->command_args.push_back($1);
		}
		;

argument_list:	/* empty */
		| argument
		| argument_list argument
	       	;

argument:       COMMAND_TOK 
		{
		 tmpproc->command_args.push_back($1);
		}
		;
%%

void yyerror (const char* s)
{
  fprintf (stderr, "%s\n", s);
}

