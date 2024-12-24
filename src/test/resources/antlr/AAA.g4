parser grammar AAA;

options {
    //tokenVocab = JavaLexer;
}

expression
    : primary                                                       #PrimaryExpression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression #BinaryOperatorExpression
    | <assoc = right> expression bop = '?' expression ':' expression #TernaryExpression
    ;

primary
    : '(' expression ')'
//    | literal
//    | identifier
//    | typeTypeOrVoid '.' CLASS
//    | nonWildcardTypeArguments (explicitGenericInvocationSuffix | THIS arguments)
    ;

//literal
//    : integerLiteral
//    | floatLiteral
//    | CHAR_LITERAL
//    | STRING_LITERAL
//    | BOOL_LITERAL
//    | NULL_LITERAL
//    ;
//
//integerLiteral
//    : DECIMAL_LITERAL
//    | HEX_LITERAL
//    | OCT_LITERAL
//    | BINARY_LITERAL
//    ;
//
//floatLiteral
//    : FLOAT_LITERAL
//    | HEX_FLOAT_LITERAL
//    ;

identifier
    : Letter LetterOrDigit*
    ;

// Identifiers
//IDENTIFIER: Letter LetterOrDigit*;


// Fragment rules
fragment LetterOrDigit: Letter | [0-9];

fragment Letter:
    ([a-zA-Z$_] | ~[\u0000-\u007F\uD800-\uDBFF] | [\uD800-\uDBFF] [\uDC00-\uDFFF])
;