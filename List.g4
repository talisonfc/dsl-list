grammar List;
programa : comando+ ;
comando : NOME '=' exp | 'print' exp ;
exp : exp '.' exp | exp '+' exp | NOME | lista | INT | 'false' |  'true' ;
lista : '[' exp (',' exp) * ']';
NOME : [a-zA-Z]+ ;
INT : [0−9]+;
WS : [ \t\r\n]+ -> skip ;