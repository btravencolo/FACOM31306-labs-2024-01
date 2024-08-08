public class Main {

    public static void main(String[] args) {

 //Estudante e = new Estudante("Carlos","Rua 1o de Abril");
   //     EstudantePosGrad ep = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia", "Banco de Dados");
/*        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
      //  EstudantePosGrad ep = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia", "Banco de Dados");
        EstudanteMestrado epm = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        EstudanteDoutorado epd = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");



        eg.print();
        System.out.println("Título TCC: " + eg.getTituloTCC());


        epm.print();
        System.out.println("Título Dissertação: " + epm.getTituloDissertacao());

        epd.print();
        System.out.println("Título Tese: " + epd.getTituloTese());
*/


        // casos com polimorfismo
        Estudante eg2 = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        Estudante epm2 = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "Anticorpos","academico");
        Estudante epd2 = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");


        try {

    epm2.calc_cr(false);
    epd2.calc_cr(false);
} catch (Exception e){
    System.out.println(e.getMessage());
}
        Estudante[] e = new Estudante[3];
        e[0] = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        e[1] = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "Anticorpos","academico");
        e[2] = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");
try{
        for (Estudante ei : e){
            ei.calc_cr(true);
        }

        for (int i =0; i < e.length; i++){
            e[i].calc_cr(false);
        }


    } catch (Exception ee){
        System.out.println(ee.getMessage());
    }
   /*
        e2.print();
        epd2.print();
        ep2.print();
        epd2.print();
        EstudanteDoutorado epd3;
        epd3 = (EstudanteDoutorado)epd2;
        System.out.println(epd3.getTituloTese());
        System.out.println(((EstudanteDoutorado)epd2).getTituloTese());
*/
/*
        eg2.print();
        System.out.println(eg2.getTituloTCC());

        ep2.print();
        System.out.println(ep2.getFormacao());

        epm2.print();
        System.out.println(epm2.getTituloDissertacao());

*/
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
