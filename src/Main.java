    class Main{
        public static void main(String[] args) {
            //Instanciaçao do curso
            Curso engenharia = new Curso("Engenharia", 1);
            Curso direito = new Curso("Direito", 2);

            //Criação dos alunos
            Aluno aluno1 = new Aluno("Matheus", 537, 19);
            Aluno aluno2 = new Aluno("Eduardo", 539, 20);


            direito.addAluno(aluno1);
            direito.addAluno(aluno2);


            // Problema: Responsabilidade de gerenciamento geral colocada em uma classe específica.
            // Curso deve gerenciar apenas seus próprios alunos,
            // enquanto uma classe Escola deve gerenciar os cursos e buscas globais.
            direito.listarAlunos();
//            direito.buscarAlunoporCpf(539);
        }
    }