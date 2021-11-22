grammar Calculator;
/*
 * Parser Rules
 */

line: (WHITESPACE* expression WHITESPACE* SEPARATOR*)+;

expression:
	NUMBER
	| expression WHITESPACE first_op WHITESPACE expression
	| expression WHITESPACE second_op WHITESPACE expression;

first_op: INTO | DIVIDE;
second_op: PLUS | MINUS;

/*
 * Lexer Rules
 */

fragment DIGIT: [0-9];
fragment D: ('D' | 'd');
fragment E: ('E' | 'e');
fragment I: ('I' | 'i');
fragment V: ('V' | 'v');
fragment N: ('N' | 'n');
fragment O: ('O' | 'o');
fragment T: ('T' | 't');
fragment M: ('M' | 'm');
fragment L: ('L' | 'l');
fragment S: ('S' | 's');
fragment U: ('U' | 'u');
fragment P: ('P' | 'p');

DIVIDE: D I V I D E;

INTO: I N T O;

MINUS: M I N U S;

PLUS: P L U S;

WHITESPACE: [ \t\r\n]+;

NUMBER: DIGIT+;

SEPARATOR: ';';