public class Aluno {
    private String nome;
    private int cpf;
    private int idade;
    private Curso curso;
    private int nota;



    public Aluno(String nome, int cpf, int idade, int nota){
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
    public void setCurso(Curso curso){
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void alterarNota(int nota){
        setNota(nota);
        System.out.println("Nota alterada para: " + nota);
    }

    public void setNota(int nota){
        this.nota = nota;
    }

    public void verificarSituacao() {
        if (nota < 7) {
            //Sem return: object calisthenics, uso de else
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
    }}
