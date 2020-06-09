/*
 * Gramatica da Linguagem YURI
 */

grammar Yuri;

// Programa

include
	:	IMPORT LT LIB GT
	;

programName
	:	INIT MAIN OPENPAR CLOSEPAR
	;

stmtList 
	:	stmt stmtList 
		| 
	;

stmt 
	:	assignStmt 
	|	ifStmt 
	| 	whileStmt 
	| 	forStmt 
	| 	switchStmt
	;

// Declaracao de variaveis
assignStmt
	:	varType NAME EQ expr DOT
	|	varType GLOBAL NAME EQ expr DOT
	|	NAME EQ expr DOT
	;
	
declareStmt
	:	varType NAME DOT
	;

varType
	:	INT 
	|	FLOAT 
	|	CHAR 
	|	STRING
	;
	
// Expressoes
expr
	:	arithExpr
	|	callExpr
	;

callExpr 
	:	NAME OPENPAR exprList CLOSEPAR
	;

arithExpr
	:	NAME arithSymbols arithExpr
	|	NAME arithSymbols NAME
	;

exprCond
	:	expr compareSymbols exprCond
	|	(AND | OR) OPENPAR? exprCond CLOSEPAR?
	|	NOT OPENPAR exprCond CLOSEPAR
	|	expr compareSymbols expr
	;

exprList 
	:	expr exprListEnd 
	| 
	;

exprListEnd 
	:	COMMA expr exprListEnd 
	| 
	;

// Se
ifStmt
	:	IFINIT OPENPAR exprCond CLOSEPAR THEN stmtList elseStmt IFEND
	;

elseStmt
	:	ELSE stmtList
	;

// Enquanto
whileStmt
	:	WHILEINIT OPENPAR exprCond CLOSEPAR stmtList WHILEEND
	;
	
// Seja
switchStmt
	:	SWITCHINIT OPENPAR assignStmt CLOSEPAR switchBody SWITCHEND
	;
	
switchBody
	:	CASE exprCond COLON stmtList switchBody
	|	DEFAULT COLON stmtList
	;
	
// Para
forStmt
	:	FORINIT OPENPAR assignStmt COMMA exprCond COMMA DIG CLOSEPAR stmtList FOREND
	;

compareSymbols
	:	LT |
		GT |
		EQ |
		NE |
		LE |
		GE |
	; 

arithSymbols
	:	PLUS |
		MINUS |
		STAR |
		DIV |
		MOD
	;

// Constantes para tipos de dados
INT :	'Inteiro';
FLOAT : 'Real';
CHAR:	'Caractere';
STRING: 'Cadeia';
GLOBAL :	'Global';


// Constantes para operacoes aritmeticas
PLUS :	'+';
MINUS :	'-';
STAR :	'*';
DIV :	'/';
MOD :	'%';

// Constantes para operadores logicos
AND :	'E' | 'e';
OR :	'OU' | 'ou';
NOT :	'NAO' | 'nao';	

// Outras constantes
INIT :	'Inicio';
END :	'Fim';
MAIN :	'Principal';
IMPORT:	'Importar';
OPENPAR :	'(';
CLOSEPAR :	')';
DOT :	'.';
COLON :	':';
COMMA :	',';

// Constantes de comparacao
LT :	'<';
GT :	'>';
EQ :	'=';
NE :	'!=';
LE :	'<=';
GE :	'>=';

// Constantes de fluxo e repeticao
IFINIT :	'Se';
IFEND :	'FimSe';
THEN :	'entao' | 'Entao';
ELSE :	'senao' | 'Senao';
WHILEINIT :	'Enquanto';
WHILEEND :	'FimEnquanto';
FORINIT :	'Para';
FOREND :	'FimPara';
SWITCHINIT :	'Seja';
SWITCHEND :	'FimSeja';
CASE :	'Caso';
DEFAULT :	'Caso Nenhum' | 'Caso nenhum';


DIG
	:	[0-9]+
	;

/*
 * NAME representa um nome de variavel ou um nome de metodo.
 * Deve começar com uma letra maiuscula ou minuscula seguido de uma cadeia de letras ou numeros, sem acentos ou caracteres especiais.
 */
NAME
    :	[a-zA-Z][a-zA-Z0-9]*
    ;

// DIRECTIVE representa uma biblioteca a ser incluida
LIB
	:	NAME + '.yuri'
	;

// WS representa um whitespace, que é ignorado.
WHITESPACE
    :   [ \t]+
        -> skip
    ;

// Line break é ignorado.
NEWLINE
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;
     
COMMENT
    :   '//' ~[\r\n]*
        -> skip
    ;