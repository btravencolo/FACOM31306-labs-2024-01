// Pode-se perceber que Produto Perecível compartilha muitos atributos com Produto
// Dessa forma, vamos retirar de ProdutoPerecivel os atributos que são comuns entre
// Produto e ProdutoPerecível - e vamos retirar seus respectivos Set/Get

import java.time.LocalDate;

public class ProdutoPerecivel_v2 extends  Produto_v2 {
    // private int codigo;            :>> atributo herdado
    // private String nome;           :>> atributo herdado
    // private String fabricante;     :>> atributo herdado
    // private double preco;          :>> atributo herdado
    private LocalDate dataValidade;   // atributo exclusivo de Produto Perecível

    public ProdutoPerecivel_v2(int codigo, String nome, String fabricante, long dias) {

        //this.codigo = codigo; //  a linha tem que ser retirada, pois ao compilar o seguinte erro aparece
                              // java: cannot find symbol
                              // symbol: variable codigo
                              // o mesmo vale para os demais
        //this.nome = nome;
        //this.fabricante = fabricante;
        super(codigo, nome, fabricante); // Somos obrigados a chamar o construtor da superclasse
        LocalDate d = LocalDate.now();
        this.dataValidade = d.plusDays(dias);

    }
/*
    // ---------
    // Retirando Set/Get de atributos herdados, pois esses métodos já estão disponíveis em Produto
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
*/

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(long dias) {
        LocalDate d = LocalDate.now();
        this.dataValidade = d.plusDays(dias);
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel_v1{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", fabricante='" + getFabricante() + '\'' +
                ", preco=" + getPreco() +
                ", dataValidade=" + dataValidade +
                '}';
    }
}
