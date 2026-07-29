package after;

class Main{
        public static void main(String[] args) {
            //Instanciaçao do curso
            Curso engenharia = new Curso("Engenharia", 1);
            Curso direito = new Curso("Direito", 2);

            //Criação dos alunos
            Aluno aluno1 = new Aluno("Matheus", 537, 19, 9);
            Aluno aluno2 = new Aluno("Eduardo", 539, 20, 5);


            direito.addAluno(aluno2);
            aluno2.setNome("Eduarda");
            direito.removerAluno(539);
            aluno2.alterarNota(2);
            aluno2.verificarSituacao();


            // Problema: Responsabilidade de gerenciamento geral colocada em uma classe específica.
            // Curso deve gerenciar apenas seus próprios alunos,
            // enquanto uma classe Escola deve gerenciar os cursos e buscas globais.
        }
    }