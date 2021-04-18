# ArquiteturaDeSoftware
Repositório referente ao projeto da aplicação para correção de solos

Link para mapeamento em documento online:
https://docs.google.com/document/d/1eFRnTIYEbemXXZAKOSA0JoskfUFjBbQsW7FRi7QUEX8/edit?usp=sharing

# Relatório de ajustes realizados - Atividade 3

## Código antes das mudanças

### Resultado do cloc
      18 text files.
      18 unique files.
      25 files ignored.

Language    | files | blank | comment | code
------------|-------|-------|---------|------
Java        | 10    |206    | 61      | 955
XML         | 4     |0      | 0       | 263
Maven       | 1     |1      | 0       | 52
**SUM**     | **15**    |**207**    | **61**      | **1270**

Estruturas condicionais: 12 condicionais

## Problemas identificados
- Classe não utilizada;
- Repetição de funções para cada valor presentes nos enums;
- Condicionais presentes para verificação simples (if e else);
- Complexidade de fórmulas;
- Não utilização de padronização.

## Soluções encontradas
- Exclusão de classe não utilizada;
- Melhor utilização de Enums, presente no link: https://www.javaprogressivo.net/2012/10/Como-usar-enumA-melhor-maneira-para-manusear-constantes-em-Java.html;
- Utilização de operador ternário, presente no link: https://www.devmedia.com.br/java-if-else-e-o-operador-ternario/38185;
- Simplificação das fórmulas;
- Utilização de padrão denominado de Template Method, presente no link: https://refactoring.guru/pt-br/design-patterns/template-method

## Implementação de soluções
- Alterações estrutura Enum e exclusão de classe não utilizada:
  * A solução possibilitou a diminuição de linhas de código e a diminuição de repetição de código para a mesma função. Consequentemente, obtém-se o ganho de diminuição de pontos de alteração;
  * A exclusão da classe, possibilitou o código mais limpo, já que tal classe não estava sendo utilizada.
- Utilização de operador ternário e diminuição de complexidade das fórmulas:
  * O operador ternário permite a diminuição de linhas de código para funções que dependiam de condições simples de if/else;
  * A simplificação das fórmulas permite deixar o código mais limpo, diminuindo a complexidade que havia na planilha para o código;
- Aplicação do padrão Template Method
  * Tal padrão foi adotado nas classes de correção, onde contém algoritmos quase idênticos com algumas diferenças menores, assim podemos estender apenas etapas particulares de um algoritmo, mas não todo o algoritmo e sua estrutura;
  * Outro ganho é a eliminação de duplicação de código, onde os códigos que estão presentes para ambas as classes, estão localizadas na classe pai, e podem ser herdadas.

## Código após mudanças
### Resultado do cloc
      18 text files.
      18 unique files.
      25 files ignored.

Language    | files | blank | comment | code
------------|-------|-------|---------|------
Java        | 10    |92     | 15      | 577
XML         | 4     |0      | 0       | 263
Maven       | 1     |1      | 0       | 52
**SUM**     | **15**    |**93**    | **15**      | **893**

Estruturas condicionais: 0 (if/else - switch);
Diminuição de 378 linhas de código, diminuição de pontos de alteração;
