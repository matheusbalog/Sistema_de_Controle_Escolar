package before;
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
    // PROBLEMA 1: adiciona E imprime no mesmo metodo (viola SRP)
    // PROBLEMA 5: valida duplicidade e decide a mensagem para o usuário
    public void addAluno(Aluno aluno){
        for (Aluno aluno1: alunos) {
            if (aluno1.getCpf() == aluno.getCpf()) {
                System.out.println("CPF duplicado"); // PROBLEMA 4: acoplado ao console
                return;
            }
        }
        alunos.add(aluno);
        // PROBLEMA 3: 4 métodos diferentes
        System.out.println("NOME: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("IDADE: " + aluno.getIdade());
        System.out.println( "Aluno adicionado com sucesso");
        //Matrícula mudar e impressão mudar: 2 motivos
        System.out.println();


    }




    // PROBLEMA 2: remove E imprime no mesmo metodo (viola SRP)
    // PROBLEMA 6: recebe cpf (int) mas o Aluno inteiro é percorrido para achar - referência completa do aluno para achar
    // PROBLEMA 3: 4 métodos diferentes
    public void removerAluno(int cpf) {
        for (Aluno aluno : alunos) {
            if (aluno.getCpf() == cpf){
                alunos.remove(aluno);
                System.out.println("NOME: " + aluno.getNome());
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("IDADE: " + aluno.getIdade());
                System.out.println("Aluno removido por CPF");
                return;
            }
        }
        System.out.println("Aluno Não removido");
    }


    public void listarAlunos(){
        for (Aluno aluno: alunos){
            // PROBLEMA 3: 4 métodos diferentes
            System.out.println("LISTA DE ALUNOS DE UM CURSO: ");
            System.out.println("NOME: " + aluno.getNome());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("IDADE: " + aluno.getIdade());
            System.out.println();
        }
}

    // PROBLEMA 3: 4 métodos diferentes
    public Aluno buscarAlunoporCpf(int cpf) {
        for (Aluno aluno : alunos) {
            // PROBLEMA 3: 4 métodos diferentes
            if (aluno.getCpf() == cpf) {
                System.out.println("Aluno encontrado");
                System.out.println(aluno.getNome());
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("IDADE: " + aluno.getIdade());
                System.out.println();
                return aluno;
            }
        }
        System.out.println("Aluno não encontrado no curso");
        return null;}

    public Aluno buscarAlunoporNome(String nome) {
        for (Aluno aluno : alunos) {
            // PROBLEMA 3: 4 métodos diferentes
            if (aluno.getNome().equals(nome)) {
                System.out.println("Aluno encontrado");
                System.out.println(aluno.getNome());
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("IDADE: " + aluno.getIdade());
                System.out.println();
                return aluno;
            }
        }
        System.out.println("Aluno não encontrado no curso");
        return null;}
}




