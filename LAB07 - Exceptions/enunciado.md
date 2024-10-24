# Ex01 
Crie uma classe funcionário, com os campos CPF, Nome e Salário. Faça todos os métodos esperados para tratar desses atributos.

Adicionalmente

- Acrescente um novo atributo privado em Funcionário que armazene o teto salarial. Por padrão, todos os objetos da classe Funcionário são inicializados com o teto de R$ 40 mil. Permita ao usuário da classe atribuir e consultar os valores desse novo atributo. 

- Crie um método para aumentar o salário, passando como parâmetro um valor percentual.

- Note que o método pode gerar valores inválidos. É possível que o salário fique negativo ou que atinja um valor acima do teto. Não deixe que isso ocorra. Para retornar o erro, *crie uma classe de exceção* que herde a classe IllegalArgumentException (essa classe, por sua vez, herda RuntimeException). 

- Caso o erro seja de valor negativo, mostrar a mensagem "Valor inválido de salário";

- Caso o erro seja de valor maior que o teto, mostrar a mensagem "Valor ultrapassa o teto";

- Na classe principal inclua um código que chama um dos métodos que pode acionar a exceção criada e nesse caso mostre na tela a mensagem do erro emitida pela exceção.

- Independentemente de a exceção ser ou não acionada, mostrar ao final da chamada do método qual o valor do salário atual


# Ex02

**Enunciado do Problema: Divisão Segura com Tratamento de Exceções** - 

Você está desenvolvendo um sistema que precisa realizar operações matemáticas básicas. Em particular, você deve implementar uma operação de divisão, mas precisa garantir que a divisão por zero não ocorra, pois isso geraria um erro. Crie uma classe de exceção chamada `DivisaoPorZeroException`, que estenda a classe `Exception`. Esta exceção deve ser lançada quando uma tentativa de divisão por zero for detectada.

Implemente uma classe chamada `Operacao` que contenha os seguintes métodos:
   - **`iniciarOperacao(int numerador, int denominador)`**: Este método deve iniciar o processo de divisão. Ele deve chamar outro método para realizar o cálculo e tratar qualquer exceção que possa ser lançada.
   - **`calcular(int numerador, int denominador)`**: Este método deve ser responsável por chamar um método que realiza a divisão.
   - **`dividir(int numerador, int denominador)`**: Este método deve executar a operação de divisão. Se o denominador for zero, ele deve lançar a exceção;

No `main`, crie uma instância da classe `Operacao` e teste as operações de divisão com um caso que funcione corretamente e outro que cause a exceção de divisão por zero. As mensagens de erro devem ser claras e informativas.


# Ex03
 
- Qual a diferença entre o throw e throws ? Justifique explicado o que cada comando faz

- Indique a diferença entre checked e uncheked exceptions
