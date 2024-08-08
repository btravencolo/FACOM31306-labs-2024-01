
import java.time.LocalDate;

public class ProdutoPerecivel_v4 extends  Produto_v3 {
    private LocalDate dataValidade;
    private double preco;


    public ProdutoPerecivel_v4(int codigo, String nome, String fabricante, long dias) {
        super(codigo, nome, fabricante);
        LocalDate d = LocalDate.now();
        this.dataValidade = d.plusDays(dias);
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
        this.preco = super.preco*1.1;
    }


    @Override
    public String getNome() {
        return nome + " (perecível)";
    }



    public void produtoVencendo() {
        if (dataValidade.equals(LocalDate.now())) {
            preco = preco*0.5;
        }
    }


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
                "codigo=" + codigo +   //protect - com acesso direto
                ", nome='" + nome  + '\'' + // public - com acesso direto
                ", fabricante='" + getFabricante() + '\'' + // privado - acesso via get
                ", preco=" + preco +  //protect - com acesso direto
                ", dataValidade=" + dataValidade +
                '}';
    }
}
