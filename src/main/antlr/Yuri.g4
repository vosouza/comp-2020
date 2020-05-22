grammar Yuri;

/*
 * Regras
 */
 
assignmentOperator
    :   '='
    ;
    

// Constantes para tipos de dados
Int : 'Inteiro';
Float : 'Real';
Char: 'Caractere';
String: 'Cadeia';


// Constantes para operacoes aritmeticas
Plus : '+';
Minus : '-';
Star : '*';
Div : '/';
Mod : '%';

DIG
	: [0-9]+
	;

/*
 * NAME representa um nome de variavel ou um nome de metodo.
 * Deve começar com uma letra maiuscula ou minuscula seguido de uma cadeia de letras ou numeros, sem acentos ou caracteres especiais.
 */
NAME
    : [a-zA-Z][a-zA-Z0-9]*
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