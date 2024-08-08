public class EstudantePosGrad extends Estudante {
    private String formacao; // curso  de graduação que o estudante formou
    private String linhaDePesquisa;

    public EstudantePosGrad(String nome, String endereco, String formacao, String linhaDePesquisa) {
        super(nome, endereco);
        this.formacao = formacao;
        this.linhaDePesquisa = linhaDePesquisa;
    }


    public void print() {
        super.print();
        System.out.println("EstudantePosGrad{" +
                "formacao='" + formacao + '\'' +
                ", linhadDePesquisa='" + linhaDePesquisa + '\'' +
                '}');
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getLinhaDePesquisa() {
        return linhaDePesquisa;
    }

    public void setLinhaDePesquisa(String linhaDePesquisa) {
        this.linhaDePesquisa = linhaDePesquisa;
    }
}
