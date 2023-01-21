package S04;

public class Mentor extends Pessoa
{
    String liguagemDeProgramacao;

    public Mentor() {
    }

    public Mentor(String liguagemDeProgramacao) {
        this.liguagemDeProgramacao = liguagemDeProgramacao;
    }

    public String getLiguagemDeProgramacao() {
        return liguagemDeProgramacao;
    }

    public void setLiguagemDeProgramacao(String liguagemDeProgramacao) {
        this.liguagemDeProgramacao = liguagemDeProgramacao;
    }
}
