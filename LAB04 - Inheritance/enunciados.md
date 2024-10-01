# Exercício de herança

# Ex01 

**não utilizar herança no ex01**

Relembre o exercício de uma prática anterior. Nele indicamos que os candidatos possuem seguintes informações: Nome Completo, Data de Nascimento, Gênero, Total de Bens (em Reais), Candidato a reeleição (sim/não), número do partido, Cargo pretendido

Assim, modifique o exercício de forma que sejam criadas duas classes. Uma chamada CandidatoPrefeito e outra CandidatoVereador. Essas classes devem possuir todos os atributos antes listados (exceto Cargo Pretendido) e mais alguns, específicos de cada uma. Para prefeito, o nome e partido do candidato a vice-prefeito. Para o vereador, o número de três dígitos (use string ao invés de tipos numéricos) e o bairro em que mora. Crie construtores que inicializam todos os atributos das classes. Crie também um método toString() para mostrar os dados dos candidatos.

Faça um programa principal que cria um candidato a prefeito e um a vereador, e mostre os dados criados.

# Ex02
O conceito de herança (inheritance) em POO é muito utilizado para reaproveitamento de código.

- Identifique no exercício anterior quais atributos em comum possuem os dois tipos de candidatos e crie uma classe chamada Candidato, transformando os atributos *private* para *protected*. Lembre de incluir na classe o método toString()
- Modifique as classes de Prefeito/Vereador, eliminando todos os atributos e métodos reduntantes de Candidato. Obtenha os valores desses atributos por herança utilizando a palavra chave *extends*, isto é: "public class CandidatoVereador extends Candidato {".
- Note que a herança irá trazer os atributos e os métodos para as classes de Prefeito/Vereador.
- Note que o método toString() deve continuar nas classes de Prefeito/Vereador, pois ele é diferente do método toString() da classe Candidato
- O construtor deve ser modificado, de forma a inicializar somente os atributos das classes de Prefeito/Vereador. Os atributos que são originais de classe Candidato (chamada de superclasse ou classe mãe/pai) deverão ser inicializados por meio da chamada do construtor original de Figurinha. Isso é feito usando a palavra reservada *super*

Faça um programa principal que cria um candidato a prefeito e um a vereador, e mostre os dados criados.

# Ex03
- Modifique a classe Candidato, transformando os atributos *protected* para *private*
- Entenda o erro que ocorre em toString() das subclasses com essa modificação
- Modifique o método toString() para ser possível vizualizar os atributos privados de ;Figurinha. Para isso use *super.toString()*
- Crie um novo construtor para Vereador, que terá como parâmetro um candidato (não sabemos ainda a que cargo) e os atributos adicionais de vereador. Esse construtor permitirá criar um novo objeto de Vereador a partir de um objeto já existente de Candidato (ou seja, um candidato a vereador a partir de um candidato que já foi criado - fazer tudo via cópia de valores, não por referência). 

Faça um programa principal que cria e mostre os dados das classes envolvidas

# Ex04
Teste de chamada de herança
 Faça um programa que contenha três classes: C1; C2; C3

- A classe C1 é base da Classe C2, que por sua vez é base da Classe C3
- Para cada classe, inclua um atributo público, protegido e privado (pode ser de qualquer tipo)
- Para cada classe, construa um construtor padrão sem parâmetros e um construtor com parâmetros
- Nos construtores de cada classe, inclua um comando que imprime uma mensagem indicando a passagem pelo contrutor. Por exemplo, para C1:
  "Classe C1: chamada do construtor padrao, sem parametros"
  "Classe C3: chamada do construtor com parametros"
- Na classe C3 inclua um construtor que use o "super" para chamar o construtor da classe C2 com parâmetro
- Em todas as classes, inclua um método que chama mostar_atributos, que mostra os valores de *todos* os atributos de um objeto (não utilizar *super*)
    - Lembre que as classes herdam os atributos, inclusive os privados - e esses também devem ser mostrados 
- Em todas as classes, inclua um método que chama mostar_atributos_super, que mostra os valores de *todos* os atributos de um objeto e que utilize *super*

# Ex05
Uma empresa tem quatro tipos de funcionários: chefes, vendedores, operários e horistas. Cada um desses funcionários ganha seus salários conforme regras distintas, apresentadas a seguir: 

Chefe: salário fixo e predefinido;
Vendedor: valor fixo + comissão * vendas;
Operario: valor por produção * quantidade produzida;
Horista: valor por hora * total de horas trabalhadas.


Crie as classes correspondentes, adicionando atributos e métodos que achar necessários. A classe *Funcionario* deve incluir os campos privados *nome*, *dataNascimento* e *salario*. Além disso, crie uma classe *Empresa*, que conterá o método *main()*. A empresa tem vários funcionários, logo crie um vetor (array) para cada tipo de funcionário, instancie no mínimo 2 exemplos de cada tipo de funcionário. Mostre uma chamada para cálculo do salário

# Ex06
Crie uma classe chamada {Ingresso}, que possui um valor e um método {escreveValor()}. Em seguida:

Crie uma classe {VIP}, que herda {Ingresso} e possui um valor adicional. Crie um método que retorne o valor do ingresso VIP (com o adicional incluído).
	
Crie uma classe {Normal}, que herda {Ingresso} e possui um método que imprime: "Ingresso Normal".
	
Crie uma classe {CamaroteInferior} (que possui a localização do ingresso e métodos para acessar e imprimir esta localização) e uma classe {CamaroteSuperior}, que é mais cara (possui valor adicional). Esta última possui um método para retornar o valor do ingresso. Ambas as classes herdam a classe {VIP}.
