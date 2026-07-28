import  java.util.ArrayList;
public class Curso {

    private ArrayList<Aluno> alunos;

    public Curso(String nome, int codigo){
        alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("NOME: " + aluno.getAluno());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("IDADE: " + aluno.getIdade());
        System.out.println( "Aluno adicionado com sucesso");
        System.out.println();
    }

    public void listarAlunos(){
        for (Aluno aluno: alunos){
            System.out.println("NOME: " + aluno.getAluno());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("IDADE: " + aluno.getIdade());
            System.out.println();
        }
    }
}
