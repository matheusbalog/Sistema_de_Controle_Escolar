package before;
public class Aluno {
    private String nome;
    // PROBLEMA 8: CPF como int e não cabe 11 dígitos |
    private int cpf;
    private int idade;
    private Curso curso;
    //  // PROBLEMA 8: nota sem validação
    private int nota;



    public Aluno(String nome, int cpf, int idade, int nota){
        // PROBLEMA 9: Encapsulamento básico sem validação
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

    //SRP: ALuno deveria ser responsável por verificar se foi aprovado ou não? Misturado com regras de negocio
    public void setNota(int nota){
        this.nota = nota;
    }

    public void verificarSituacao() {
        if (nota < 7) {
            //Sem return: object calisthenics, uso de else
            System.out.println("Reprovado");
            // PROBLEMA 7: uso de else (Regra 2 Object Calisthenics)
        } else {
            System.out.println("Aprovado");
        }
    }}

