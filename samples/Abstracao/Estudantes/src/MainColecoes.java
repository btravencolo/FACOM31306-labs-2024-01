import java.util.*;

public class MainColecoes {

    public static void main(String[] args) {

        /*
         * Coleções
         */

        //  Tipos primitivos
        int[] vetor = new int[6];
        vetor[0]=100; vetor[1]=200; vetor[2]=50; vetor[3]=30; vetor[4]=400; vetor[5]=100;

        System.out.println("===== Vetor tipos primitivos ====");
        for (int v : vetor){
            System.out.print(v + " ");
        }
        System.out.println();

        System.out.println("===== Primeiro ArrayList ====");

        // Coleções não aceitam tipos primitivos
        ArrayList lista_primitivos = new ArrayList();

        // copiando o vetor para a ArrayList
        for (int v : vetor)
            lista_primitivos.add(v);

        for (Object l :lista_primitivos ) {
            System.out.print(l + " ");
        }
        System.out.println();
        // observe o tipo de dados de cada objeto
        for (Object l :lista_primitivos ) {
            System.out.print(l + " (" + l.getClass()+") ");
        }
        System.out.println();


        // somando os valores da lista
        int soma = 0;
        for (Object l :lista_primitivos ) {
            // soma = soma + l;
            //
            // java: bad operand types for binary operator '+'
            // first type:  int
            // second type: java.lang.Object


            // convertendo de Object para int via cast
            soma = soma + (int)l;
        }
        System.out.println("Soma:" + soma);

        // utilizando o conceito de 'Generics' para eliminar a necessidade de cast
        // Primeiro teste: tentar com tipo primitivo
        //ArrayList<int> lista_primitivos2 = new ArrayList<int>();
        // java: unexpected type
        //  required: reference
        //  found:    int
        //

        System.out.println("\n=====  ArrayList com Generics ====");

        ArrayList<Integer> listaInteger = new ArrayList<Integer>();
        for (int v : vetor)
            listaInteger.add(v);
        // observe que no FOR abaixo foi usado o tipo não primitivo Integer;
        soma = 0;
        System.out.println("\n=====  For 'for-each' ====");
        for (Integer l : listaInteger ) {
            soma = soma + l;
        }
        System.out.println("Soma (com ArrayList de Integer e laço for :):" + soma);

        System.out.println("\n=====  For 'tradicional' ====");

        //usando o for tradicional
        soma = 0;
        for (int i =0; i< listaInteger.size(); i++ ) {
            int valor;
            valor = listaInteger.get(i); //retorna tipo Integer e convert para int
            soma = soma + valor;
        }
        System.out.println("Soma (com ArrayList de Integer e laço for i): " + soma);

        // Teste com outras classes. Vamos inicialmente cadastrar um Estudante de
        // doutorado. Serão criados três objetos
        EstudanteDoutorado est1 = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        EstudanteDoutorado est2 = new EstudanteDoutorado("Maria","Rua Verão",
                "Tecnologia","Processamento de Imagens","Casas Inteligentes");

        EstudanteDoutorado est3 = new EstudanteDoutorado("Ana","Rua Primavera",
                "Tecnologia","Processamento de Imagens","Cidades Inteligentes");

        // criando um ArrayList com os estudantes
        ArrayList<EstudanteDoutorado> doutorandos = new ArrayList<EstudanteDoutorado>();
        doutorandos.add(est1);
        doutorandos.add(est2);
        doutorandos.add(est3);

        System.out.println("\n=====  Estudantes de Doutorado ====");
        for (EstudanteDoutorado e : doutorandos){
            e.print();
        }

        // criando um estudante de mestrado e um de graduação
        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        EstudanteMestrado epm = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");

        // Inserindo na lista de doutorandos. Não é possivel
        // doutorandos.add(eg);
        // java: incompatible types: EstudanteGraduacao cannot be converted to EstudanteDoutorado

        // Podemos então criar uma lista com a superclasse comum dessas classes
        ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
        estudantes.add(est1); // aluno de doutorado
        estudantes.add(eg); // aluno de graduação
        estudantes.add(epm); // aluno de mestrado

        System.out.println("\n=====  Estudantes (grad/mest/dout)====");

        for (Estudante e : estudantes){
            e.print(); // print é método de estudante, sobrescrito em várias classes
        }


        ArrayList<EstudantePosGrad>  estudantes_pg = new ArrayList<EstudantePosGrad>();
        //mostrar_estudantes_pesquisadores(estudantes);
        ArrayList<EstudanteDoutorado>  estudantes_doutorado = new ArrayList<EstudanteDoutorado>();
        estudantes_doutorado.add(est1);
        estudantes_doutorado.add(est2);
        estudantes_doutorado.add(est3);
        mostrar_estudantes_pesquisadores(estudantes_doutorado);
        ArrayList<EstudanteMestrado>  estudantes_mestrado = new ArrayList<EstudanteMestrado>();
        estudantes_mestrado.add(epm);
        mostrar_estudantes_pesquisadores(estudantes_mestrado);

        // Interface MAP
        HashMap<Integer,Estudante> map_estudante = new HashMap<Integer,Estudante>();
        map_estudante.put(1,est1);
        map_estudante.put(2,est3);
        map_estudante.put(3,est2);

        System.out.println("\n============= MAP =============");

        Estudante e;
        e = map_estudante.get(1);
        e.print();

        e = map_estudante.get(2);
        e.print();

        e = map_estudante.get(20);
        if (e == null) {
            System.out.println("Não encontrado");
        }

        // Polimorfismo
        List<Estudante> estudante_array_list = new ArrayList<Estudante>();
        List<Estudante> estudante_linked_list = new LinkedList<Estudante>();
        Stack<Estudante> estudante_stack = new Stack<Estudante>();

        System.out.println("\n==== ARRAY LIST =====");
        estudante_array_list.add(est1);
        estudante_array_list.add(est2);
        mostrar_estudantes(estudante_array_list);

        System.out.println("\n==== LINKED LIST =====");
        estudante_linked_list.add(est1);
        estudante_linked_list.add(est2);
        mostrar_estudantes(estudante_linked_list);


        System.out.println("\n==== PILHA =====");
        estudante_stack.push(est1);
        estudante_stack.push(est2);
        mostrar_estudantes(estudante_stack);

        System.out.println("\n======= ITERATOR =======");
        Iterator<Estudante> ie = estudante_linked_list.iterator();
        while (ie.hasNext())
            ie.next().print();

        System.out.println("\n===== Collections =====");
        List<String> nomes = new ArrayList<String>();
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Ana");

        System.out.println("\n===== Antes de ordenar =====");
        for (String nome : nomes)
            System.out.println(nome);

        Collections.sort(nomes);

        System.out.println("\n===== Depois de ordenar =====");
        for (String nome : nomes)
            System.out.println(nome);

    }


    public static void mostrar_estudantes_pesquisadores(ArrayList<? extends EstudantePosGrad> lista){
        for (EstudantePosGrad e : lista){
            e.print();
        }
    }


    public static void mostrar_estudantes(List<Estudante> lista){
        for (Estudante e : lista){
            e.print();
        }
    }


}

/*



        //Estudante e = new Estudante("Carlos","Rua 1o de Abril");
        //     EstudantePosGrad ep = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia", "Banco de Dados");

      //  EstudantePosGrad ep = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia", "Banco de Dados");


        EstudanteDoutorado epd = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");



        eg.print();
        System.out.println("Título TCC: " + eg.getTituloTCC());


        epm.print();
        System.out.println("Título Dissertação: " + epm.getTituloDissertacao());

        epd.print();
        System.out.println("Título Tese: " + epd.getTituloTese());
    // casos com polimorfismo
    Estudante eg2 = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
    Estudante epm2 = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
            "Vacinas de RNA", "Anticorpos","academico");
    Estudante epd2 = new EstudanteDoutorado("Bruno","Rua Inverno",
            "Tecnologia","Processamento de Imagens","Carros Inteligentes");

*/