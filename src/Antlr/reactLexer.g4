lexer grammar reactLexer;

// Tokens
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
COMMA: ',';
SEMICOLON: ';';
DOT: '.';
COLON: ':';
QUOTE:'\'';
EQUAL:'=';
BACK_SLASH:'\\';
ARROW:'=>';
OPENTAG:'<';
CLOSETAG:'>';
SLASH:'/';
OPERATOR:'+' | '-' | '*';
DOLLAR:'$';
LOGICAL_AND:'&';



// Keywords
CLASS: 'class';
FUNCTION: 'function';
IMPORT: 'import';
FROM: 'from';
EXPORT: 'export';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
DO: 'do';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';
TRUE: 'true';
FALSE: 'false';
NULLL: 'nulll';
UNDEFINED: 'undefined';
CONST: 'const';
LET: 'let';
VAR: 'var';
HTTPS:'https';
DIV:'div';
SPAN:'span';
A:'a';
PARAG:'p';
HEAD2:'h2';
CLASSNAME:'className';
KEY:'key';
IMG:'img';
SRC:'src';
ALT:'alt';
BUTTON:'button';
ONCLICK:'onClick';
SHOWDETAILS:'Show Details';

// Identifiers
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

// Numbers
DECIMAL_INTEGER_LITERAL: [1-9][0-9]* | '0';
HEX_INTEGER_LITERAL: '0x'[0-9a-fA-F]+;
OCTAL_INTEGER_LITERAL: '0'[0-7]+;
BINARY_INTEGER_LITERAL: '0b'[01]+;
FLOAT_LITERAL: [0-9]+'.'[0-9]+;

// Strings
STRING_LITERAL: '"' (ESC | ~["\\])* '"';
TEMPLATE_LITERAL: '`' (ESC | ~[`\\])* '`';

// Comments
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Whitespace
WS: [ \t\r\n]+ -> skip;

// Escape sequences
fragment ESC: '\\' [btnfr"'\\`];
