grammar XQuery;

// XQuery
query
    : Var
    | StringLiteral
    | ap
    | '(' query ')'
    | query ',' query
    | query '/' rp
    | query  '//' rp
    | '<' StringConstant '>' '{' query '}' '</' StringConstant '>'
    | forClause letClause? whereClause? returnClause
    | letClause query
;

forClause
    : 'for' Var 'in' query (',' Var 'in' query )*
;

letClause
    : 'let' Var ':=' query (',' Var ':=' query )
;

whereClause
    : 'where' cond
;

returnClause
    : 'return' query
;

ap
    : 'doc(' StringLiteral ')' slash=('/'|'//') rp
    | 'document(' StringLiteral ')' slash=('/'|'//') rp
;

rp
    : StringConstant
    | '*'
    | '.'
    | '..'
    | 'text()'
    | '@' StringConstant
    | '(' rp ')'
    | rp '/' rp
    | rp '//' rp
    | rp '['  f ']'
    | rp ',' rp
;

f
    : rp
    | rp ('=' | 'eq') rp
    | rp ('==' | 'is') rp
    | '(' f ')'
    | f 'and' f
    | f 'or' f
    | 'not' f
;

cond
    : query ('='|'eq') query
    | query ('=='|'is') query
    | 'empty(' query ')'
    | 'some' Var 'in' query (',' Var 'in' query)* 'satisfies' cond
    | '(' cond ')'
    | cond 'and' cond
    | cond 'or' cond
    | 'not' cond
;

fragment
Letter
    : [a-zA-Z_]
;
fragment
LetterOrDigit
    : [a-zA-Z0-9_-]
;

StringLiteral
    :'\"' ~[\"\\@]+? '\"'
;

StringConstant: Letter LetterOrDigit*;

Var: '$' StringConstant;

WS : [ \t\r\n]+ -> skip ;



