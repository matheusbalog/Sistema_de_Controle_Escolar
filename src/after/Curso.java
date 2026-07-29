package after;

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
        for (Aluno aluno1: alunos) {
            if (aluno1.getCpf() == aluno.getCpf()) {
                System.out.println("CPF duplicado");
                return;
                //PROBLEMA: Object calisthenics - COLOCAR ELSE
            }
        }
        alunos.add(aluno);
        System.out.println("NOME: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("IDADE: " + aluno.getIdade());
        System.out.println( "Aluno adicionado com sucesso");
        System.out.println();


    }




    //Problema: Metodo remove e imprime aluno ao mesmo tempo
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
            System.out.println("LISTA DE ALUNOS DE UM CURSO: ");
            System.out.println("NOME: " + aluno.getNome());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("IDADE: " + aluno.getIdade());
            System.out.println();
            return;
        }
        System.out.println("Não foi possível listar alunos - nenhum matriculado");

}

    public Aluno buscarAlunoporCpf(int cpf) {
        for (Aluno aluno : alunos) {
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




