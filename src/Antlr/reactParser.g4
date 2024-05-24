parser grammar reactParser;
options{tokenVocab=reactLexer;}
start_compiler: react_import*  products+ main_component ( exportation |EOF );
react_import:IMPORT IDENTIFIER COMMA OPEN_BRACE IDENTIFIER CLOSE_BRACE FROM QUOTE IDENTIFIER QUOTE SEMICOLON ;
products:(CONST|LET|VAR)? IDENTIFIER EQUAL OPEN_BRACKET (OPEN_BRACE  name  COMMA description COMMA image COMMA CLOSE_BRACE COMMA)+CLOSE_BRACKET SEMICOLON;
//id: IDENTIFIER COLON DECIMAL_INTEGER_LITERAL;
name: IDENTIFIER COLON STRING_LITERAL;
//price:IDENTIFIER COLON FLOAT_LITERAL ;
description:IDENTIFIER COLON STRING_LITERAL ;
image:IDENTIFIER COLON STRING_LITERAL ;
main_component: (CONST|LET|VAR)? IDENTIFIER EQUAL OPEN_PAREN CLOSE_PAREN ARROW OPEN_BRACE body return CLOSE_BRACE SEMICOLON  ;
body: equaletion* statement* branch_component1;
equaletion:  equal1
            |equal2    ;

equal1:(CONST|LET|VAR)+ IDENTIFIER  EQUAL (STRING_LITERAL|DECIMAL_INTEGER_LITERAL|FLOAT_LITERAL) SEMICOLON ;
equal2: (CONST|LET|VAR)+ OPEN_BRACKET   IDENTIFIER     COMMA    IDENTIFIER   CLOSE_BRACKET EQUAL function_call SEMICOLON;
function_call: IDENTIFIER OPEN_PAREN  parameterList ?  CLOSE_PAREN  ;
function: FUNCTION  IDENTIFIER OPEN_PAREN parameterList ?  CLOSE_PAREN OPEN_BRACE function_body CLOSE_BRACE  SEMICOLON   ;
parameterList: parameter (COMMA parameter)*;
parameter
    : IDENTIFIER                   #IdentefierParameter
    | NULLL                       #NullParameter
    | DECIMAL_INTEGER_LITERAL     #DecemalParameter
    ;
function_body:statement*;
statement :  exprStmt
           | returnStmt
           | ifStmt
           | block       ;

exprStmt: expression SEMICOLON;
returnStmt: RETURN expression SEMICOLON;
expression: IDENTIFIER                                      #IDENTIFIER_expression
            | DECIMAL_INTEGER_LITERAL                       #DECIMAL_expression
            |NULLL                                          #Null_expression
            | expression operator expression                #OPERATOR_expression
            | IDENTIFIER OPEN_PAREN args CLOSE_PAREN        #ARGS_expression
            ;
args: expression (COMMA expression)*;
operator: OPERATOR;
ifStmt: IF OPEN_PAREN expression CLOSE_PAREN statement (ELSE statement)?;
block: OPEN_BRACE statement* CLOSE_BRACE;
branch_component1: function+ ;
return: RETURN OPEN_PAREN jsxElement CLOSE_PAREN SEMICOLON;

jsxElement: jsxSelfClosing+   ;
jsxSelfClosing: OPENTAG jsxElementName jsxAttributes? SLASH? CLOSETAG?(jsxElementChildren ? ) jsxSelfClosing* closeingt?  ;
closeingt:OPENTAG SLASH jsxElementName CLOSETAG;
jsxElementChildren: jsx11*  sss+    ;
jsx11:  OPEN_BRACE IDENTIFIER DOT IDENTIFIER OPEN_PAREN aninnumos_function? CLOSE_PAREN CLOSE_BRACE    ;
aninnumos_function: OPEN_PAREN (parameterList ?) CLOSE_PAREN ARROW OPEN_BRACE (jsxElement?) (function_call?) CLOSE_BRACE;
jsxElementName
    : DIV
    | SPAN
    | A
    | HEAD2
    | PARAG
    | IMG
    | BUTTON
    ;
jsxElementevents:ONCLICK? ;
jsxAttributes: jsxAttribute*;
jsxAttribute: (CLASSNAME EQUAL STRING_LITERAL )                                                                                                                # ATRIBUTE_CLASS
              | jsxAttribute (KEY EQUAL OPEN_BRACE  IDENTIFIER DOT IDENTIFIER  CLOSE_BRACE)                                                                    # ATRIBUTE_key
              |  (SRC EQUAL OPEN_BRACE  IDENTIFIER DOT IDENTIFIER  CLOSE_BRACE  ALT  EQUAL OPEN_BRACE IDENTIFIER DOT IDENTIFIER  CLOSE_BRACE )                 # ATRIBUTE_IMG
              |  jsxAttribute  CLOSETAG? (IDENTIFIER? COLON? DOLLAR? OPEN_BRACE  IDENTIFIER DOT IDENTIFIER  CLOSE_BRACE) OPENTAG SLASH jsxElementName CLOSETAG # ATRIBUTE_DOLLAR
              |   CLOSETAG? (IDENTIFIER? COLON? DOLLAR? OPEN_BRACE  IDENTIFIER DOT IDENTIFIER  CLOSE_BRACE) OPENTAG SLASH jsxElementName CLOSETAG              # ELEMENT
              |  jsxAttribute jsxElementevents EQUAL OPEN_BRACE aninnumos_function?  CLOSE_BRACE  CLOSETAG SHOWDETAILS                                         # FUNC_ELEMNT
              |  jsxAttribute jsxElementevents EQUAL OPEN_BRACE  IDENTIFIER   CLOSE_BRACE CLOSETAG LOGICAL_AND IDENTIFIER SEMICOLON                            # LOGICAL_ELMNT ;

sss: OPEN_BRACE IDENTIFIER LOGICAL_AND LOGICAL_AND OPEN_PAREN  jsxSelfClosing  CLOSE_PAREN CLOSE_BRACE;
exportation:EXPORT DEFAULT IDENTIFIER SEMICOLON;




