public class Produto_v2 {
    private int codigo;
    private String nome;
    private String fabricante;
    private double preco;

    public Produto_v2(int codigo, String nome, String fabricante) {
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = 0;
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

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", preco=" + preco +
                '}';
    }

}
