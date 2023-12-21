// Define a grammar called Hello

grammar Sample;

r  : (expr ';' NEWLINE?)*;          // match keyword hello followed by an identifier

expr:
	ID PLUSPLUS                      	   #plusplusExpr
	| ID MINMIN                      	   #minminExpr
	| MINUS expr                       	   #minusExpr
 	| NOT expr                             #notExpr
	| expr op=(MUL | DIV | MOD) expr       #mulExpr
	| expr op=(PLUS | MINUS) expr          #addExpr
	| expr op=(LIEQ | RIEQ | LI | RI) expr #relationExpr
	| expr op=(EQ | NEQ) expr              #equalExpr
	| expr AND expr                        #andExpr
	| expr OR expr                         #orExpr
	| array                                #arrayExpr
	| java_variable                        #javaVariableExpr
	| function                             #functionExpr
	| atom								   #atomExpr
;

array
 : '[' ( expr ( ',' expr )* )? ']'
;

java_variable
 : VARIABLE '.' VARIABLE
;

function
 : VARIABLE '(' arguments ')' | (atom | array) '.' VARIABLE '(' arguments ')' ;

arguments
 : expr ( ',' expr )*
;



atom:
	OP expr CP       #exprAtom
	| INT            #intAtom
	| DOUBLE         #doubleAtom
	| ID             #idAtom
	| STRING_VALUE   #stringAtom
	| VARIABLE       # variableAtom
;



// lexer rules
NEWLINE: [\r\n]+ ;
INT:	([1-9][0-9]* | '0');
DOUBLE : ([1-9][0-9]* | '0')('.'[0-9]*)?;
OP:	'(';
CP:	')';
OB:	'{';
CB:	'}';
COMMA: ',';
REF:	'&';

PLUSPLUS :'++' ;
MINMIN : '--';
OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
LI : '>';
RI : '<';
LIEQ : '>=';
RIEQ : '<=';
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
MOD : '%';
NOT : '!';
ASSIGN:	'=';
SEMICOLON:	';';
VARIABLE: [a-zA-Z가-힣_][a-zA-Z_가-힣0-9];
STRING_VALUE : '"' ( ~ '"' )* '"' ;
WS: [ \t\r\n]+ -> skip ;