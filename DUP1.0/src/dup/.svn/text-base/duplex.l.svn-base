/*** DEFINITION SECTION ***/

%top{
#include "DUP_config.h"
#define YY_NO_INPUT 1


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
 * @file dup/duplex.c
 * @brief Generated lexer from flex
 * @author Krista Grothoff
 */

}

%{
/* C CODE TO BE COPIED VERBATIM */
#include <stdio.h>
#include <string.h>
#include "globals.h"
#include "dupparse.h"
#include "strnfuncs.h"
/* need to define ECHO, otherwise we get some
   garbage printed to stdout */
#define ECHO
char command_buffer[MAX_COMMAND_BUFFER_LENGTH + 1];
int cur_buflen;

void add_char_to_buf(char c);
void add_text_to_buf();
void reset_command_buf();
char* set_return_buf();
#define YYDEBUG 0
%}

%x DUPSTART
%x ADDRESS_STATE
%x IPV6_STATE
%x COMMAND_STATE
%x ESCAPE_STATE
%x SINGLE_QUOTE_STATE
%x DOUBLE_QUOTE_STATE
%x DQ_ESCAPE_STATE
%x PATH_STATE
%x EOL_STATE

%option noyywrap
%option bison-bridge 
%option nounput
%%

[\n]    { /* default - do nothing, ever. */
          /* Overruled by "all but these excluded guys" patterns, i.e. [^x]* will accept \n */ }

<INITIAL,DUPSTART>[A-Za-z][A-Za-z0-9_]*	        { BEGIN DUPSTART; 
					  yylval->charptr = strndup(yytext,
								   MAX_COMMAND_BUFFER_LENGTH);
					  return IDENTIFIER ; }
<INITIAL,DUPSTART>^#.*                  { /* do nothing */ }
<DUPSTART>[0-9]+		        { yylval->number = atoi(yytext); 
					  return INTEGER; }
<DUPSTART>\|				{ yylval->charptr = strdup(yytext);
					  return PIPE_OPERATOR; }
<DUPSTART>(\<)|(\>(\>)?)		{ BEGIN PATH_STATE;
					  yylval->charptr = strdup(yytext);
					  return REDIRECT_OPERATOR; }
<DUPSTART>@				{ BEGIN ADDRESS_STATE; 
					  yylval->character = '@';
					  return AT_SYMBOL; }
<DUPSTART>\$				{ BEGIN COMMAND_STATE; 
					  reset_command_buf();
					  yylval->character = '$';
                                          return DOLLAR; }
<DUPSTART>:				{ yylval->character = ':';
					  return COLON; }
<DUPSTART>\[				{ yylval->character = '[';
					  return LEFT_BRACKET; }
<DUPSTART>\]				{ yylval->character = ']';
					  return RIGHT_BRACKET; }
<DUPSTART>,				{ yylval->character = ',';
					  return COMMA; }
<PATH_STATE>[^ \t\n,\]:<>|]*	{ BEGIN DUPSTART;
					  yylval->charptr = strndup(yytext,
								   MAX_COMMAND_BUFFER_LENGTH);
					  return PATH; }
<PATH_STATE>\]				{ BEGIN DUPSTART;
					  yylval->character = '[';
					  return RIGHT_BRACKET; }
<PATH_STATE>,				{ BEGIN DUPSTART;
					  yylval->character = ',';
					  return COMMA; }
<ADDRESS_STATE>[A-Za-z0-9]+[.A-Za-z0-9]*	{ BEGIN DUPSTART;
					  yylval->charptr = strndup(yytext,
								   MAX_COMMAND_BUFFER_LENGTH);  
					  return DOT_ID; }
<ADDRESS_STATE>\[			{ BEGIN IPV6_STATE; }
<ADDRESS_STATE>\]			{ BEGIN DUPSTART; }
<IPV6_STATE>(:|[0-9]|[a-fA-F])+		{ BEGIN ADDRESS_STATE; 		
					  yylval->charptr = strndup(yytext,
								   MAX_COMMAND_BUFFER_LENGTH);
					  return IPV6_ID; }
<COMMAND_STATE>\\			{ BEGIN ESCAPE_STATE; }
<COMMAND_STATE>;			{ /* BEGIN DUPSTART; */ 
                                          /* put semi-colon back for scanning in
                                             DUPSTART */ 
					  /* yyless(1); */ 
					  BEGIN DUPSTART;
					  if (cur_buflen != 0) {
						yylval->charptr = set_return_buf();		
						return COMMAND_TOK;
					  }
					}
<COMMAND_STATE>[ \t]*			{ 
					  if (cur_buflen != 0) {
						yylval->charptr = set_return_buf();		
						return COMMAND_TOK;
					  }
					}
<COMMAND_STATE>[^ \n\t\\;'"]*		{ add_text_to_buf(); }
<COMMAND_STATE>'			{ BEGIN SINGLE_QUOTE_STATE; }
<COMMAND_STATE>\"			{ BEGIN DOUBLE_QUOTE_STATE; }
<ESCAPE_STATE>.				{ BEGIN COMMAND_STATE; 
					  add_char_to_buf(yytext[0]); }
<SINGLE_QUOTE_STATE>[^']*		{ add_text_to_buf(); }
<SINGLE_QUOTE_STATE>'			{ BEGIN COMMAND_STATE;
					  if (cur_buflen != 0) {
						yylval->charptr = set_return_buf();		
						return COMMAND_TOK;
					  } 
					}
<DOUBLE_QUOTE_STATE>[^\\"]*		{ add_text_to_buf(); /* FIXME */ }
<DOUBLE_QUOTE_STATE>\\                  { BEGIN DQ_ESCAPE_STATE; }	
<DOUBLE_QUOTE_STATE>\"                  { BEGIN COMMAND_STATE;
					  if (cur_buflen != 0) {
						yylval->charptr = set_return_buf();		
						return COMMAND_TOK;
					  }
					}
<DQ_ESCAPE_STATE>.                      { add_char_to_buf(yytext[0]); 
					  BEGIN DOUBLE_QUOTE_STATE; }
%%

/*** C CODE SECTION ***/

void add_char_to_buf(char c) {
	if (cur_buflen < (MAX_COMMAND_BUFFER_LENGTH - 2)) {
		command_buffer[cur_buflen++] = c;
		command_buffer[cur_buflen] = '\0';
	}
	/* else error */
}

void add_text_to_buf() {
	int str_len;

	str_len = strnlen(yytext, MAX_COMMAND_BUFFER_LENGTH);
	if ((MAX_COMMAND_BUFFER_LENGTH - cur_buflen) > str_len) {
		strncat(command_buffer, yytext, str_len);
		cur_buflen += str_len;
	}
	/* else error */
}

void reset_command_buf() {
	command_buffer[0] = '\0'; 
	cur_buflen = 0;
}

char* set_return_buf() {
	char* tempptr = strndup(command_buffer,
				 cur_buflen);
	reset_command_buf();
	return tempptr;
}
