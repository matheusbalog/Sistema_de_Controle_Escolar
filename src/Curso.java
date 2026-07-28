import  java.util.ArrayList;
public class Curso {
    private String nome;
    private int codigo;
    private ArrayList<Aluno> alunos;

    public Curso(String nome, int codigo){
        alunos = new ArrayList<>();
        this.codigo = codigo;
        this.nome = nome;
    }
    //Problema: Metodo adiciona e imprimi aluno ao mesmo tempo
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("NOME: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("IDADE: " + aluno.getIdade());
        System.out.println( "Aluno adicionado com sucesso");
        System.out.println();
    }

    public void listarAlunos(){
        for (Aluno aluno: alunos){
            System.out.println("NOME: " + aluno.getNome());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("IDADE: " + aluno.getIdade());
            System.out.println();
        }
    }
    //Problema: Metodo remove e imprimi aluno ao mesmo tempo
    public void removerAluno(Aluno aluno){
        if (alunos.contains(aluno)){
            System.out.println("NOME: " + aluno.getNome());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("IDADE: " + aluno.getIdade());
            System.out.println("ALuno removido com Sucesso");
            System.out.println();
        }

        else{
            System.out.println("Não é possível remover - ALUNO NÃO MATRICULADO");
        }
    }
}
