package S04;

public class Aluno extends Pessoa {
    static String curso;
    static int matricula;
    public void identificarAluno(){
        System.out.println("Este é " + nome + " de " + idade + " anos de idade.");
        System.out.println("Aluno do curso de " + curso + " com matricula " + matricula);
    }

    public Aluno(String nome, int idade, String curso, int matricula) {
        super(nome, idade);
        Aluno.curso = curso;
        Aluno.matricula = matricula;
    }

    public Aluno() {
    }

    public static String getCurso() {
        return curso;
    }

    public static void setCurso(String curso) {
        Aluno.curso = curso;
    }

    public static int getMatricula() {
        return matricula;
    }

    public static void setMatricula(int matricula) {
        Aluno.matricula = matricula;
    }
}
