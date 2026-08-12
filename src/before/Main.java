package before;
class Main{
        public static void main(String[] args) {
            //Instanciaçao do curso
            Curso engenharia = new Curso("Engenharia", 1);
            Curso direito = new Curso("Direito", 2);

            //Criação dos alunos
            Aluno aluno1 = new Aluno("Matheus", 537, 19, 9, 9, 9);
            Aluno aluno2 = new Aluno("Eduardo", 539, 20, 5, 5, 5);


            direito.addAluno(aluno2);
            engenharia.addAluno(aluno1);
            direito.listarAlunos();
            engenharia.listarAlunos();
            aluno2.verificarSituacao();
            aluno1.verificarSituacao();
            direito.removerAluno(539);
            engenharia.removerAluno(537);
        }
    }