public class Main {
    public static void main(String[] args) {
        System.out.println("Cadastro de Produtos - v1");

        Produto_v1 produto1 = new Produto_v1(1,"Bicicleta", "Caloi");
        produto1.setPreco(400);
        System.out.println(produto1);

        ProdutoPerecivel_v1 perecivel1 = new ProdutoPerecivel_v1(2, "Queijo","Laticinio Scala", 30);
        System.out.println(perecivel1);

        System.out.println("Cadastro de Produtos - v2");
        Produto_v2 produto2 = new Produto_v2(1,"Bicicleta", "Caloi");
        // A classe Produto não tem acesso aos métodos da ProdutoPerecivel
        produto2.setPreco(400);
        System.out.println(produto2);

        ProdutoPerecivel_v2 perecivel2 = new ProdutoPerecivel_v2(2, "Queijo","Laticinio Scala", 30);
        // posso chamar as funções escritas na classe Produto
        perecivel2.setPreco(200);
        // posso chamar as funções escritas na classe ProdutoPerecivel
        perecivel2.setDataValidade(45);

        System.out.println(perecivel2);

        System.out.println("Cadastro de Produtos - v3");

        Produto_v3 produto3 = new Produto_v3(1,"Bicicleta", "Caloi");
        produto3.setPreco(400);
        System.out.println(produto3);
        System.out.println("Nome:" + produto3.getNome());

        ProdutoPerecivel_v3 perecivel3 = new ProdutoPerecivel_v3(3, "Leite","Laticinio Scala", 90);
        perecivel3.setPreco(200);
        System.out.println(perecivel3);
        perecivel3.setDataValidade(0);
        perecivel3.produtoVencendo();
        System.out.println(perecivel3);
        System.out.println("Nome:" + perecivel3.getNome());



    }
}