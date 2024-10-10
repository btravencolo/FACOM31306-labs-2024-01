# Ex 01
Uma empresa tem quatro tipos de funcionários: chefes, vendedores, operários e horistas. Cada um desses funcionários ganha seus salários conforme regras distintas, apresentadas a seguir: 

Chefe: salário fixo e predefinido;
Vendedor: valor fixo + comissão X vendas;
Operario: valor por produção X quantidade produzida;
Horista: valor por hora X total de horas trabalhadas.


Crie as classes correspondentes, adicionando atributos e métodos que achar necessário. A classe *Funcionario* deve incluir os campos privados *nome*, *dataNascimento* e *salario*. Além disso, crie uma classe *Empresa*, que conterá o método *main()*. A empresa tem vários funcionários, logo crie um vetor (array)  de *funcionários*. Adicione a ele ao menos um tipo de cada funcionário definido anteriormente. Criar também uma classe {FolhaPagamento}, que lê dados referentes ao conjunto de empregados de uma empresa e mostra a folha de pagamento da empresa.

* Criar o vetor utilizando variáveis do tipo Funcionário, mas instancie os objetos com elementos das subclasses de Funcionario (polimorfismo) *

# Ex 02

Verificar o enunciado no arquivo PDF na pasta correspondente

# Ex 03

Copie o exemplo Estudante disponível na pasta 'samples/polimorfismo'. Crie uma classe Universidade, que tem como propriedade o nome da Universidade e a data de Fundação. A universidade possui no máximo 100 alunos, que podem ser de graduação e pós-graduação. 

(a) Crie um método que mostra quantos estudantes de graduação, mestrado e doutorado a Universidade possui (para facilitar, é permitido instanciar os alunos no próprio código)

(b) Mostre as informações do nome de todos os alunos e, no caso de aluno de doutorado, mostrar adicionalmente o título da tese a linha de pesquisa

(c) Crie um novo vetor e copie para ele todos os alunos de pós-graduação (somente a cópia da referência do objeto - não há necessidade de duplicar o objeto na memória). Percorra o vetor e mostre as informações completas dos alunos.

(d) Faça, para as classes de estudante de graduação, estudante de mestrado e estudante de doutorado, uma *sobrecarga* do método print(), fazendo receber como parâmetro um valor booleano que indica se o print será na mesma linha ou em várias linhas. No caso da mesma linha, são mostrados todos os atributos da classe separados por ponto e vírgula. No caso de várias linhas, cada atributo é exibido em uma linha diferente.

(e)  Referente ao exercício anterior, é possível utilizar o recém criado método print(boolean) em um polimorfismo tendo como base um vetor da classe Estudante? Justifique. Caso não seja possível, altere somente o código da classe Estudante para que passe a ser possível. O que ocorre neste caso com a classe Estudante de Pós-gradução?

