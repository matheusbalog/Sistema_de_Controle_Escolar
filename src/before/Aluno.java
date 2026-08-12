package before;
public class Aluno {
    private String nome;
    // PROBLEMA 8: CPF como int e não cabe 11 dígitos
    private int cpf;
    private int idade;
    private Curso curso;
    //  // PROBLEMA 8: nota sem validação
    private int nota1;
    private int nota2;
    private int nota3;



    public Aluno(String nome, int cpf, int idade, int nota1, int nota2, int nota3){
        // PROBLEMA 9: Encapsulamento básico sem validação | Encapsulamento incorreto
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
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


    //SRP: ALTERA NOTA E IMPRIME
    public void alterarNota(int nota){
        setNota(nota);
        System.out.println("Nota alterada para: " + nota);
    }

    //SRP: ALuno deveria ser responsável por verificar se foi aprovado ou não? Misturado com regras de negócio
    public void setNota(int nota){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    //SRP e OB2
    public void verificarSituacao() {
        //Faz validaçao e printa
        if (((nota1 + nota2 + nota3)/3)< 7) {
            System.out.println("Reprovado");
            // PROBLEMA 7: uso de else
        } else {
            System.out.println("Aprovado");
        }
    }}



