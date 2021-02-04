grammar List;
programa : comando+ EOF;
comando : NOME '=' exp  # expresion
  | 'print' exp         # show
  ;

exp : exp '.' exp       # expNested
  | exp '+' exp         # expSum
  | NOME                # name
  | lista               # collection
  | INT                 # int
  | 'false'             # false
  | 'true'              # true
  ;

lista : '[' exp (',' exp) * ']' ;

NOME : [a-zA-Z]+ ;

INT : [0-9]+ ;

WS : [ \t\r\n]+ -> skip ;