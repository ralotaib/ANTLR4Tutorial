grammar ExpressionGrammar ;

@header {
package edu.ucsd.CSE232B.parsers;
}

/*Rules*/
prog :	(exp)+  EOF;
exp:	exp OP exp      #Expr_Binary
    |	number          #Expr_Number
    |   variable        #Expr_Variable
    |	LPR exp RPR     #Expr_Parentheses
    ;
number:
 NUM
;
variable:
ID
;

/*Tokens*/
LPR: '(';
RPR: ')';
OP : ('*'|'/' | '+');
ID : [a-zA-Z][a-zA-Z_0-9]*;
NUM :  '0' | '-'?[1-9][0-9]* ;
WS: [ \t\n\r]+ -> skip;