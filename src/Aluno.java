public class Aluno {
    private String nome;
    private int cpf;
    private int idade;
    private Curso curso;


    public Aluno(String nome, int cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;

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
    public void setCurso(Curso curso){
        this.curso = curso;
    }
}
