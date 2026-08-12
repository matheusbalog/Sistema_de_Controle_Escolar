package after;

public class Main {
    public static void main(String[] args) {
        Curso direito = new Curso("Direito", 2);
        Curso engenharia = new Curso("Engenharia", 1);

        Aluno aluno1 = new Aluno("Matheus", new Cpf("53712345678"), 19, new Nota(9, 10, 10));
        Aluno aluno2 = new Aluno("Eduardo", new Cpf("53912345678"), 20, new Nota(5, 5, 5));
        Aluno aluno3 = new Aluno("Maria Eduarda", new Cpf("07639835780"), 17, new Nota(10, 10, 10));

        boolean adicionado = direito.addAluno(aluno2);
        System.out.println(adicionado ? "Aluno adicionado com sucesso" : "CPF duplicado");

        boolean adicionado3 = engenharia.addAluno(aluno3);
        System.out.println(adicionado ? "Aluno adicionado com sucesso" : "CPF duplicado");

        aluno2.setNome("Eduarda");


        direito.listarAlunos().forEach(a ->
                System.out.println(a.getNome() + " - " + a.getCpf() + " - " + a.getIdade())
        );
        engenharia.listarAlunos().forEach(a ->
                System.out.println(a.getNome() + " - " + a.getCpf() + " - " + a.getIdade())
        );

        aluno2.setNota(new Nota(2, 2, 2));
        System.out.println(aluno2.isAprovado() ? "Aprovado" : "Reprovado");
        System.out.println(aluno3.isAprovado() ? "Aprovado" : "Reprovado");
    }
}