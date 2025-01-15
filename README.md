# antlr 문법 예제
grammar JavaParser;

@header {
    package sample;
}

prog:	(expression ';'? NEWLINE?)* ;

expression
    : variableExpression ';'?
    | methodExpression ';'?
    | classMethodExpression
    | expression op=('==' | '!=' | '&&' | '||') expression
    | expression op=('*' | '/' | '+' | '-' | '^' | '%') expression
    | expression op=('>' | '>=' | '<' | '<=' ) expression
    | expression '?' expression ':' expression
    | spreadExpression
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

spreadExpression
    : ('>' | '>=' | '<' | '<=') expression
    | (INT_TYPE | LONG_TYPE | DOUBLE_TYPE | userCode) '~' (INT_TYPE | LONG_TYPE | DOUBLE_TYPE | userCode )
    | userCode
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

userCode
    : USERCODE_NAME
    ;

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
    | 'for' '(' expression ':' VARIABLE_NAME ')' block?
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
WS: [ \r\n\u000C]+ -> skip;
//WS: [ \t\r\n\u000C]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
//NEWLINE : [\r\n]+ -> skip;가
USERCODE_NAME: '{' [a-zA-Z가-힣_ ?'";:!@#$%^&*{}()][a-zA-Z_가-힣0-9 ?'";:!@#$%^&*{}()]* '}';

# gradle 셋팅
plugins {
    id 'java'
    id 'maven-publish'
    id 'antlr'
}

group = 'sample'
version = '1.0.0-SNAPSHOT'
sourceCompatibility = 1.8
targetCompatibility = 1.8

ext {
    buildEnv = System.getenv("BUILD_ENV") ?: "local" // 기본값은 "local"
    nexusPublicUrl = buildEnv == "jenkins" ? nexusPublicUrlAp : nexusPublicUrlWeb
}

repositories {
    mavenCentral()

}

dependencies {
    antlr "org.antlr:antlr4:4.7.2"

    implementation('org.slf4j:slf4j-api:1.7.36')

    implementation('org.apache.commons:commons-lang3:3.12.0')

    implementation 'org.projectlombok:lombok:1.18.26'
    annotationProcessor 'org.projectlombok:lombok:1.18.26'

    implementation 'org.antlr:antlr4-runtime:4.7.2'

    //test
    testImplementation platform('org.junit:junit-bom:5.9.2')
    testImplementation 'org.junit.jupiter:junit-jupiter'
    testCompileOnly 'org.projectlombok:lombok:1.18.26' // 테스트 의존성 추가
    testAnnotationProcessor 'org.projectlombok:lombok:1.18.26' // 테스트 의존성 추가


    testImplementation('org.slf4j:slf4j-api:1.7.36')
    testImplementation('ch.qos.logback:logback-classic:1.2.11')
    testImplementation('ch.qos.logback:logback-core:1.2.11')


}

test {
    useJUnitPlatform()
}

generateGrammarSource {
    maxHeapSize = "64m"
    arguments += ["-visitor", "-long-messages"]
    outputDirectory = file("${projectDir}/src/main/java/gen/antlr header package 추가")
}

//sourceSets {
//    generated {
//        java {
//            srcDir "src/main/java/wne/rule/hrs/jci/generator/parser/gen"
//        }
//    }
//}

clean {
    delete file("${projectDir}/src/main/java/wne/rule/hrs/jci/generator/converter/gen")
}


// 배포 시 사용


test {
    //skip testcase
    exclude('**/**')
}

// 의존성 오류 방지
publishMavenPublicationToMavenRepository.dependsOn(jar)

