package after;

public class Aluno {
    private String nome;
    private int cpf;
    private int idade;
    private Curso curso;
    private Nota nota;

    public Aluno(String nome, int cpf, int idade, Nota nota){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.nota = nota;

    }


    //GETTERS
    public String getNome(){
        return nome;
    }
    public  int getCpf(){
        return cpf;
    }
    public  int getIdade(){
        return idade;
    }

    //SETTERS
    public void setCurso(Curso curso){
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(int nota){
        this.nota = nota;
    }

    public boolean isAprovado(){
        return nota.isAprovado()
    }

    }
