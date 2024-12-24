// Define a grammar called Hello

grammar Expr;

@header {
package antlr.my.gen;
}

prog:	(expr ';' NEWLINE?)* ;

//# 값에 따라 BaseVisitor에 메소스가 생성된다.
expr:	expr op=('*' | '/') expr                # infixExpr
    |	expr op=('+' | '-') expr                # infixExpr
    |   expr op=('>' | '>=' | '<' | '<=') expr  # relationExpr
    |   expr op=('==' | '!=') expr              # equalExpr
    |   expr '&&' expr                          # andExpr
    |   expr '||' expr                          # orExpr
    |   customFunction                          # customFunctionExpr
    |   expr '.'  FUNCTION '(' expr ')'         # containsExpr
    |   '(' expr ')'                            # parensExpr
    |   expr '?' expr ':' expr                  # ternaryExpr
    |	atom                                    # atomExpr
    |   array                                   # arrayExpr
    ;

array:  '[' ( expr ( ',' expr )* )? ']'
    ;

customFunction: CUSTOM_FUNCTION '(' ( expr ( ',' expr )* )? ')'
    ;

atom:   INT
    |   DOUBLE
    |   BOOLEAN
    |   STRING
    |   VARIABLE
    ;

fragment DIGIT: [0-9];
fragment FUNCTION: [a-zA-Z가-힣_][a-zA-Z_가-힣0-9]*;
fragment CUSTOM_FUNCTION: ('myName' | 'myAge');
fragment INT: DIGIT+;
fragment DOUBLE: DIGIT+ ('.' DIGIT)*;
fragment BOOLEAN: ('true' | 'fase');
fragment STRING : ('"' ( ~ '"' )* '"' | '\'' ( ~ '\'' )* '\'') ;
fragment VARIABLE: [a-zA-Z가-힣_][a-zA-Z_가-힣0-9]*;
fragment WS: [ \t\r\n]+ -> skip ;
fragment NEWLINE : [\r\n]+ -> skip;