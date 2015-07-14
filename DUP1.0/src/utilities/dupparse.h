
/* A Bison parser, made by GNU Bison 2.4.1.  */

/* Skeleton interface for Bison's Yacc-like parsers in C
   
      Copyright (C) 1984, 1989, 1990, 2000, 2001, 2002, 2003, 2004, 2005, 2006
   Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */


/* Tokens.  */
#ifndef YYTOKENTYPE
# define YYTOKENTYPE
   /* Put the tokens into the symbol table, so that GDB and other debuggers
      know about them.  */
   enum yytokentype {
     IDENTIFIER = 258,
     INTEGER = 259,
     PATH = 260,
     PIPE_OPERATOR = 261,
     REDIRECT_OPERATOR = 262,
     IPV6_ID = 263,
     DOT_ID = 264,
     COMMAND_TOK = 265,
     FINISHED = 266,
     DOLLAR = 267,
     LEFT_BRACKET = 268,
     RIGHT_BRACKET = 269,
     AT_SYMBOL = 270,
     COLON = 271,
     COMMA = 272
   };
#endif
/* Tokens.  */
#define IDENTIFIER 258
#define INTEGER 259
#define PATH 260
#define PIPE_OPERATOR 261
#define REDIRECT_OPERATOR 262
#define IPV6_ID 263
#define DOT_ID 264
#define COMMAND_TOK 265
#define FINISHED 266
#define DOLLAR 267
#define LEFT_BRACKET 268
#define RIGHT_BRACKET 269
#define AT_SYMBOL 270
#define COLON 271
#define COMMA 272




#if ! defined YYSTYPE && ! defined YYSTYPE_IS_DECLARED
typedef union YYSTYPE
{

/* Line 1676 of yacc.c  */
#line 79 "dupparse.yy"

  int number;
  char character;
  char* charptr;
  void* edgenodeptr;



/* Line 1676 of yacc.c  */
#line 95 "dupparse.h"
} YYSTYPE;
# define YYSTYPE_IS_TRIVIAL 1
# define yystype YYSTYPE /* obsolescent; will be withdrawn */
# define YYSTYPE_IS_DECLARED 1
#endif




