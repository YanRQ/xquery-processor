grammar XQuery;

// XQuery
query
    : Var                                       #xqvar
    | StringLiteral                             #xqstring
    | ap                                        #xqap
    | '(' query ')'                             #xqparen
    | query ',' query                           #xqconcat
    | query '/' rp                              #xqslash
    | query  '//' rp                            #xqdoubleslash
    | '<' StringConstant '>' '{' query '}' '</' StringConstant '>'  #xqtag
    | forClause letClause? whereClause? returnClause                #xqclause
    | letClause query                           #xqlet
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
    : ('doc('|'document(') StringLiteral ')/'  rp #apslash
    | ('doc('|'document(') StringLiteral ')//' rp #apdoubleslash
;

rp
    : StringConstant        #rpstring
    | '*'                   #rpchild
    | '.'                   #rpself
    | '..'                  #rpparent
    | 'text()'              #rptext
    | '@' StringConstant    #rpattr
    | '(' rp ')'            #rpparen
    | rp '/' rp             #rpslash
    | rp '//' rp            #rpdoubleslash
    | rp '['  f ']'         #rpfilter
    | rp ',' rp             #rpcancat
;

f
    : rp                    #fltrp
    | rp ('=' | 'eq') rp    #fltrpvaleq
    | rp ('==' | 'is') rp   #fltrpeq
    | '(' f ')'             #fltparen
    | f 'and' f             #fltand
    | f 'or' f              #fltor
    | 'not' f               #fltnot
;

cond
    : query ('='|'eq') query        #condvaleq
    | query ('=='|'is') query       #condeq
    | 'empty(' query ')'            #condempty
    | 'some' Var 'in' query (',' Var 'in' query)* 'satisfies' cond  #condexist
    | '(' cond ')'                  #condparen
    | cond 'and' cond               #condand
    | cond 'or' cond                #condor
    | 'not' cond                    #condnot
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



