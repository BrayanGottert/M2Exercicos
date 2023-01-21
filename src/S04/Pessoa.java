package S04;

public class Pessoa {
    String nome;
    int idade;
    public void apresentarPessoa(){
        System.out.println("Este é " + nome + " de " + idade + " anos de idade.");
    }

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
