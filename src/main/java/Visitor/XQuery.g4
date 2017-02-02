grammar XQuery;


xq
:
   Var
   | FileName
   | ap
   | '(' ap ')'
   | xq ',' xq
   | xq '/' rp
   | xq '//' rp
   | '<' TagName '>' '{' xq '}' '</'TagName'>'
   | forClause letClause? whereClause? returnClause
   | letClause xq
;


ap
:
   ('doc('| 'document(') FileName ')' '/' rp
   | ('doc('| 'document(') FileName ')' '//' rp
;

rp
:
     TagName
     | '*'
     | '.'
     | '..'
     | 'text()'
     | '@' TagName
     | '(' rp ')'
     | rp '/' rp
     | rp '//' rp
     | rp '[' f ']'
     | rp ',' rp
;

f
:
     rp
     | rp ('=' | 'eq') rp
     | rp ('==' | 'is') rp
     | '(' f ')'
     | f 'and' f
     | f 'or' f
     | 'not' f
;


forClause
:
     'for' Var 'in' xq (',' Var 'in' xq)*
;

letClause
:
     'let' Var ':=' xq (',' Var ':=' xq)*
;

whereClause
:
     'where' cond
;

returnClause
:
     'return' xq
;

cond
:
     xq ('='|'eq') xq
     | xq ('==' | 'is') xq
     | 'empty(' xq ')'
     | 'some' Var 'in' xq (',' Var 'in' xq)* 'satisfies' cond
     | '(' cond ')'
     | cond 'and' cond
     | cond 'or' cond
     | 'not' cond
;

Var
:
   '$' TagName
;

TagName
:
   [a-zA-Z_] [a-zA-Z_0-9]*
;

FileName
:
      '\"' ~[\"\\@]+? '\"'
;


WS
:
    [ \t\r\n]+ -> skip
;