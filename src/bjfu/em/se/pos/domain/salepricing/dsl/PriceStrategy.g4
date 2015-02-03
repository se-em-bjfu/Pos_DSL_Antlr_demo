grammar PriceStrategy;

script: ( stat '\n')* (stat '\n'*) ;

stat: '如果' boolexpr '那么' strategy    #IfStat
     | strategy                           #NormalStat
     |                                     #EmptyStat
     ;

boolexpr: boolexpr ('并且') boolexpr          #AndBoolExpr
    | boolexpr ('或者') boolexpr               #OrBoolExpr
    | expr '不' op=(GT | LT | EQ | GTE | LTE ) expr                   #CompareNotBoolExpr
    | expr op=(GT | LT | EQ | GTE | LTE ) expr                         #CompareBoolExpr
    | '(' boolexpr ')'                          #ParentheseBoolExpr
    ;
expr: expr op=('*'|'/') expr          #MulExpr
    | expr op=('+'|'-') expr          #AddExpr
    | '(' expr ')'                 #ParentheseExpr
    | (INT | REAL)                           #NumExpr
    | VAR                           #VarExpr
    ;
strategy: '打' discount=INT '折'      #DiscountStrategy
          | '满' threshold=INT '减' value=INT  #MinusStrategy
          | '满' threshold=INT '减' value=INT '不累计' #AbsoluteMinusStrategy
          | '不打折'                 #NoDiscountStrategy 
            ;


VAR: '折前总额' | '折前金额' ;

INT:[1-9] [0-9]+
  | [0-9]
  ;
REAL: INT '.' [0-9]+;

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';

GT: '大于';
LT: '小于';
EQ: '等于';
GTE: '大于等于';
LTE: '小于等于';

WS: (' '| '　' | '\t' | '\r' )+ -> skip;
COMMENT: '#' ~[\r\n]* '\r'? ->skip;