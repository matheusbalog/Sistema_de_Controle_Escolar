package after;

public class Main {
    public static void main(String[] args) {
        Curso direito = new Curso("Direito", 2);

        Aluno aluno1 = new Aluno("Matheus", new Cpf("53712345678"), 19, new Nota(9));
        Aluno aluno2 = new Aluno("Eduardo", new Cpf("53912345678"), 20, new Nota(5));

        boolean adicionado = direito.addAluno(aluno2);
        System.out.println(adicionado ? "Aluno adicionado com sucesso" : "CPF duplicado");

        aluno2.setNome("Eduarda");

        direito.listarAlunos().forEach(a ->
                System.out.println(a.getNome() + " - " + a.getCpf() + " - " + a.getIdade())
        );

        aluno2.setNota(new Nota(2));
        System.out.println(aluno2.isAprovado() ? "Aprovado" : "Reprovado");
    }
}