grammar Calculator;
/*
 * Parser Rules
 */

start: line+;

line: (WHITESPACE* expression WHITESPACE* SEPARATOR*);

expression:
	NUMBER																			# Number
    | PARENTHESIS_L expression PARENTHESIS_R										# GroupingOp																				
	| operator=second_op WHITESPACE number=expression								# UnaryOps
	| first=expression WHITESPACE operator=first_op WHITESPACE second=expression	# FirstOrderOps
	| first=expression WHITESPACE operator=second_op WHITESPACE second=expression	# SecondOrderOps;

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

PARENTHESIS_R: ')';

PARENTHESIS_L: '(';