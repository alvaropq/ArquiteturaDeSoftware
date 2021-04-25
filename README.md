# ArquiteturaDeSoftware
Repositório referente ao projeto da aplicação para correção de solos

Link para mapeamento em documento online:
https://docs.google.com/document/d/1eFRnTIYEbemXXZAKOSA0JoskfUFjBbQsW7FRi7QUEX8/edit?usp=sharing

# Relatório de ajustes realizados - Atividade 3

## Código antes das mudanças

### Resultado do cloc
       7 text files.
       7 unique files.
       1 file ignored.

Language    | files | blank | comment | code
------------|-------|-------|---------|------
**Java**        | **7**    | **176**    | **49**      | **659**

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
- Utilização de herança;
- Junção de Enums em um único;

## Implementação de soluções
- Alterações estrutura Enum e exclusão de classe não utilizada:
  * A solução possibilitou a diminuição de linhas de código e a diminuição de repetição de código para a mesma função. Consequentemente, obtém-se o ganho de diminuição de pontos de alteração;
  * A exclusão da classe, possibilitou o código mais limpo, já que tal classe não estava sendo utilizada.
- Utilização de operador ternário e diminuição de complexidade das fórmulas:
  * O operador ternário permite a diminuição de linhas de código para funções que dependiam de condições simples de if/else;
  * A simplificação das fórmulas permite deixar o código mais limpo, diminuindo a complexidade que havia na planilha para o código;
- Aplicação de herança:
  * A utilização de herança foi adotada nas classes de correção, onde contém algoritmos quase idênticos com algumas diferenças menores, assim podemos estender apenas etapas particulares de um algoritmo, mas não todo o algoritmo e sua estrutura;
  * Outro ganho é a eliminação de duplicação de código, onde os códigos que estão presentes para ambas as classes, estão localizadas na classe pai, e podem ser herdadas.
- Junção de Enums de fonte em um único Enum:
  * Como os Enums de fontes possuíam os mesmos atributos e métodos, esses foram incorporados em um mesmo Enum, evitando replicação de código, além de possibilitar a utilização do método que utiliza essas informações na classe de correções pai e consequentemente as classes filhas herdarem;

## Código após mudanças
### Resultado do cloc
       6 text files.
       6 unique files.
       1 file ignored.

Language    | files | blank | comment | code
------------|-------|-------|---------|------
**Java**        | **6**    | **52**     | **3**      | **228**

Estruturas condicionais: 0 (if/else - switch);
Diminuição de 431 linhas de código, diminuição de pontos de alteração;
