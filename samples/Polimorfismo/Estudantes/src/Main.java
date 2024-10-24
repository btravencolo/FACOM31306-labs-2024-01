public class Main {

    public static void main(String[] args) {

        Estudante e = new Estudante("Carlos","Rua 1o de Abril");

        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        EstudantePosGrad ep = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        EstudanteMestrado epm = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        EstudanteDoutorado epd = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");
/*
        e.print();


        eg.print();
        System.out.println("Título TCC: " + eg.getTituloTCC());

        ep.print();
        System.out.println("Formação prévia: " + ep.getFormacao());

        epm.print();
        System.out.println("Título Dissertação: " + epm.getTituloDissertacao());

        epd.print();
        System.out.println("Título Tese: " + epd.getTituloTese());


*/
        // casos com polimorfismo

        Estudante e2 = new Estudante("Carlos","Rua 1o de Abril");
        Estudante eg2 = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        Estudante ep2 = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        Estudante epm2 = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "Anticorpos","academico");
        Estudante epd2 = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        // exemplo de uso com vetor e com CAST

//        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
/*



        e2.print();

        eg2.print();
        epm2.print();
        ep2.print();
        epd2.print();
*/
     //   EstudanteDoutorado epd3;
      //  epd3 = (EstudanteDoutorado)epd2;
       // System.out.println(epd3.getTituloTese());
       // System.out.println(((EstudanteDoutorado)epd2).getTituloTese());

      //  Estudante eg2 = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");


        eg.getTituloTCC();
     /* //  esses casos temos erro pois as variáveis terminando em 2
         //são do tipo Estudante
        eg2.print();
        System.out.println(eg2.getTituloTCC());

        ep2.print();
        System.out.println(ep2.getFormacao());

        epm2.print();
        System.out.println(epm2.getTituloDissertacao());

   */
       //resolvendo com CAST
        eg2.print();
        System.out.println( ((EstudanteGraduacao) eg2).getTituloTCC());
       System.out.println( ((EstudanteGraduacao) e2).getTituloTCC());
        Estudante[] ev = new Estudante[4];
        ev[0] = eg;
        ev[1] = epd2;
        ev[2] = epm2;
        ev[3] = e;
        for (Estudante i : ev){
            i.print();

            if (i instanceof EstudanteGraduacao){
                System.out.println("\n");
                ((EstudanteGraduacao) i).getTituloTCC();
            }
        }

        //System.out.println(epd2.getTituloTese());


        /*
        Estudante e2 = new Estudante();
        Estudante eg2 = new EstudanteGraduacao();
        Estudante ep2 = new EstudantePosGrad();
        Estudante epm2 = new EstudanteMestrado();
        Estudante epd2 = new EstudanteDoutorado();

        //EstudantePosGrad e3 = new Estudante();
        //EstudantePosGrad eg3 = new EstudanteGraduacao();
        */

        // polimorfismo com pós-graduação
        // construtor incompleto
        /*
        EstudantePosGrad ep3 = new EstudantePosGrad();
        EstudantePosGrad epm3 = new EstudanteMestrado();
        EstudantePosGrad epd3 = new EstudanteDoutorado();
        */



    }
}
