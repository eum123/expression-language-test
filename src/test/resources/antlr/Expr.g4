// Define a grammar called Hello

grammar Expr;

prog:	(expr ';' NEWLINE?)* ;

//# 값에 따라 BaseVisitor에 메소스가 생성된다.
expr:	expr op=('*' | '/') expr                # infixExpr
    |	expr op=('+' | '-') expr                # infixExpr
    |   expr op=('>' | '>=' | '<' | '<=') expr  # relationExpr
    |   expr op=('==' | '!=') expr              # equalExpr
    |   expr '&&' expr                          # andExpr
    |   expr '||' expr                          # orExpr
    |   expr '.' CONTAINS '(' expr ')'          # containsExpr
    |   '(' expr ')'                            # parensExpr
    |	atom                                    # atomExpr
    |   array                                   # arrayExpr
    ;

array:  '[' ( expr ( ',' expr )* )? ']'
    ;


atom:   INT
    |   DOUBLE
    |   BOOLEAN
    |   STRING
    |   VARIABLE
    ;

fragment DIGIT: [0-9];
CONTAINS: 'contains';
INT: DIGIT+;
DOUBLE: DIGIT+ ('.' DIGIT)*;
BOOLEAN: ('true' | 'fase');
STRING : '"' ( ~ '"' )* '"' ;
VARIABLE: [a-zA-Z가-힣_][a-zA-Z_가-힣0-9]*;
WS: [ \t\r\n]+ -> skip ;
NEWLINE : [\r\n]+ -> skip;