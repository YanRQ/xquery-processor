grammar XQuery;

// XQuery
/*
query
    : Var                                                   #xqvar
    | StringLiteral                                         #xqstring
    | ap                                                    #xqap
    | '(' query ')'                                         #xqparen
    | leftq=query ',' rightq=query                          #xqconcat
    | query '/' rp                                          #xqslash
    | query  '//' rp                                        #xqdoubleslash
    | '<' StringConstant '>' '{' query '}' '</' StringConstant '>'  #xqtag
    | forClause letClause? whereClause? returnClause                #xqclause
    | letClause query                                       #xqlet
;

forClause
    : 'for' Var 'in' query (',' Var 'in' query )*
;

letClause
    : 'let' Var ':=' query (',' Var ':=' query )
;

whereClause : 'where' cond;

returnClause
    : 'return' query
;
*/
ap
    : ('doc('|'document(') file=StringLiteral ')/'  rp #apslash
    | ('doc('|'document(') file=StringLiteral ')//' rp #apdoubleslash
;

rp
    : name=StringConstant       #rptag
    | '*'                       #rpchild
    | '.'                       #rpself
    | '..'                      #rpparent
    | 'text()'                  #rptext
    | '@' name=StringConstant   #rpattr
    | '(' rp ')'                #rpparen
    | leftrp=rp '/' rightrp=rp  #rpslash
    | leftrp=rp '//' rightrp=rp #rpdoubleslash
    | rp '['  f ']'             #rpfilter
    | leftrp=rp ',' rightrp=rp  #rpcancat
;

f
    : rp                                    #fltrp
    | leftrp=rp ('=' | 'eq') rightrp=rp     #fltrpvaleq
    | leftrp=rp ('==' | 'is') rightrp=rp    #fltrpeq
    | '(' f ')'                             #fltparen
    | leftf=f 'and' rightf=f                #fltand
    | leftf=f 'or' rightf=f                 #fltor
    | 'not' f                               #fltnot
;
/*
cond
    : leftq=query ('='|'eq') rightq=query           #condvaleq
    | leftq=query ('=='|'is') rightq=query          #condeq
    | 'empty(' query ')'                            #condempty
    | 'some' Var 'in' query (',' Var 'in' query)* 'satisfies' cond  #condexist
    | '(' cond ')'                                  #condparen
    | leftc=cond 'and' rightc=cond                  #condand
    | leftc=cond 'or' rightc=cond                   #condor
    | 'not' cond                                    #condnot
;
*/
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



