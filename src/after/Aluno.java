package after;

public class Aluno {
    //Aluno só tem dados
    private String nome;
    private final Cpf cpf;
    private final int idade;
    private Curso curso;
    private Nota nota;

    public Aluno(String nome, Cpf cpf, int idade, Nota nota) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.nota = nota;
    }

    public String getNome() { return nome; }
    public Cpf getCpf() { return cpf; }
    public int getIdade() { return idade; }
    public Nota getNota() { return nota; }

    public void setNome(String nome) { this.nome = nome; }
    public void setNota(Nota nota) { this.nota = nota; }
    public void setCurso(Curso curso) { this.curso = curso; }
//Só existe 1 único metodo de consulta
    public boolean isAprovado() {
        return nota.isAprovado();
    }
}