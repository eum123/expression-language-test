# ANTLR 예제 : java 문장 parsing
```
// 문자열 비교 == 를 equals 로 변경하기 위해 parsing

grammar JavaParser;

@header {
    package wne.rule.hrs.parser;
}

prog:	(expression ';'? NEWLINE?)* ;

expression
    : variableExpression ';'?
    | methodExpression ';'?
    | classMethodExpression
    | expression op=('==' | '!=' | '&&' | '||') expression
    | expression op=('*' | '/' | '+' | '-' | '^' | '%') expression
    | expression op=('>' | '>=' | '<' | '<=') expression
    | expression '?' expression ':' expression
    | ('>' | '>=' | '<' | '<=') expression
    | ('-') expression
    | ('!') expression
    | ('++'|'--') expression
    | expression ('++'|'--')
    | '(' expression ')'
    | arrayExpression
    | arrayValueExpression
    | ifExpression
    | forExpression
    | atom
    ;

variableExpression
    : declareType VARIABLE_NAME
    | declareType? VARIABLE_NAME '=' (expression | block)
    ;

arrayExpression
    : VARIABLE_NAME '[' expression ']'
    | VARIABLE_NAME '[' expression? ']' '=' expression
    ;

methodExpression
    : VARIABLE_NAME '(' ')'
    | VARIABLE_NAME '(' expression (',' expression)* ')'
    ;

classMethodExpression
    : VARIABLE_NAME '.' VARIABLE_NAME
    | VARIABLE_NAME '.' VARIABLE_NAME '(' expression (',' expression)* ')'
    | VARIABLE_NAME '.' VARIABLE_NAME '(' ')'
    ;

arrayValueExpression
    : '[' expression (',' expression)* ']'
    ;


declareType
    : numericType
    | numericType '[' ']'
    ;
numericType
    : integralType
    | floatingPointType
    ;

//userCode은 치환 후 parsing  한다.
//userCode
//    : '{' .* '}'
//    ;

block
    : '{' expression? (',' expression)* '}'
    ;

ifExpression
    : 'if' expression block?
    | 'if' expression block? 'else' block?
    | 'if' expression block? 'else' 'if' block?
    ;


forExpression
    : 'for' '(' expression (',' expression)* ';' expression ';' expression ')' block?
    ;

integralType
    : 'byte'
    | 'short'
    | 'int'
    | 'long'
    | 'char'
    ;

floatingPointType
    : 'float'
    | 'double'
    ;

atom:   INT_TYPE
    |   LONG_TYPE
    |   DOUBLE_TYPE
    |   BOOLEAN_TYPE
    |   STRING_TYPE
    |   VARIABLE_NAME
    ;

fragment
DIGIT_TYPE: [0-9];
INT_TYPE: DIGIT_TYPE+;
LONG_TYPE: DIGIT_TYPE+ 'L';
DOUBLE_TYPE: DIGIT_TYPE+ ('.' DIGIT_TYPE)*;
BOOLEAN_TYPE: ('true' | 'fase');
STRING_TYPE : ('"' ( ~ '"' )* '"' | '\'' ( ~ '\'' )* '\'') ;
VARIABLE_NAME: [a-zA-Z가-힣_][a-zA-Z_가-힣0-9]*;
WS: [ \t\r\n\u000C]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
NEWLINE : [\r\n]+ -> skip;
```
