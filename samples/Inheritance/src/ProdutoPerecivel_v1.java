import java.time.LocalDate;


public class ProdutoPerecivel_v1 {
    private int codigo;
    private String nome;
    private String fabricante;
    private double preco;
    private LocalDate dataValidade;

    public ProdutoPerecivel_v1(int codigo, String nome, String fabricante, long dias) {
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        LocalDate d = LocalDate.now();
        this.dataValidade = d.plusDays(dias);

    }

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
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", preco=" + preco +
                ", dataValidade=" + dataValidade +
                '}';
    }
}
