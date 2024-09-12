# Ex01 
As eleições municipais estão chegando. É necessário cadastrar os candidatos. São armazenadas as seguintes informações sobre os candidatos: Nome Completo, Data de Nascimento, Gênero, Total de Bens (em Reais), Candidato a reeleição (sim/não), número do partido, Cargo pretendido

Crie uma classe Candidato, que conterá todas as informações dos candidatos.

Em uma outra classe (outro código Java), instancie 3 objetos, com informações dos candidatos do município¹ de código que contenha os três últimos dígitos do seu número de matrícula² . Faça atribuição de valores no próprio código e mostre as informações na tela.

¹
https://divulgacandcontas.tse.jus.br/divulga/#/home


²
https://www.ibge.gov.br/explica/codigos-dos-municipios.php

Exemplo: Matrícula 1123BSI987
Código: 987
Município: São João da Fronteira 2209872


# Ex02
Crie um novo projeto, semelhante ao exercício anterior. Torne todas os atributos do exercício 1 privados (processo de encapsulmento por meio do modificador de acesso 'private'). Crie métodos para alterar os valores dos atributos e para mostrar os valores dos atributos na tela. Instancie os mesmos três candidatos (sem o uso de construtores).

# Ex03
Crie no programa principal um vetor de candidatos e instancie os candidatos. Mostre as informações de todos os candidatos. Utilize laços para manipulação do vetor.
> Verifique também como utilizar o enhanced-for em Java

# Ex04
Refaça o exercício 02 utilizando construtores para inicialização dos atributos dos objetos criados. 

# Ex05
Crie uma nova classe chamada Eleição (Eleicao - evitar acentuação e cedilha), que é composta pelo nome do município, o número de votantes, os candidatos, e outras informações que julgar pertinente. Instancie duas Eleições (busque por outro município). Inicialize os dados dos objetos por meio dos construtores. Mostre na tela todos os dados cadastrados.

# Ex06
Refaça o código do exercício anterior para que a Eleição em uma determinada cidade tenha 05 candidatos. *Após instanciar a eleição*, faça uma busca do candidato que possui o maior valor de bens. Mostre as informações desse candidato, indicando qual o percentual de bens ele possui em relação a todos os outros candidatos que estão concorrendo na eleição.

# Ex07
Implemente em Java o TADProduto que fizemos em C, utilizando as melhores práticas de encapsulmento.  Crie pelo menos dois construtores (pense quais seriam boas possibilidades). No programa principal instancie vários produtos utilizando vetores para armazenamento. No programa principal crie um método para ordenar o vetor pelo nome do produto (pode utilizar um Insertion/Selection Sort)


