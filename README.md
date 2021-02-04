# dsl-list
DSL List - Projeto para a disciplina PPGTI1007 - LINGUAGENS DE DOMÍNIO ESPECIFICO - UFRN

Para gerar os arquivos java com a estrutura do parser executar: `antlr4 List.g4`
Para compilar os arquivos java executar: `javac *.java`
Para testar a sintaxe da linguagem executar: `grun List programa -tokens < test.prog`, onde `test.prog` é um arquivo com um exemplo de um programa escrito na linguagem List.