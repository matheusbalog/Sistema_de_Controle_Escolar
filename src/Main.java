    class Main{
        public static void main(String[] args){
            //Instanciaçao do curso
            Curso curso = new Curso("Engenharia", 1);

            //Criação dos alunos
            Aluno aluno1 = new Aluno("Matheus",539, 19);
            Aluno aluno2 = new Aluno("Eduardo",539, 20);


            curso.addAluno(aluno1);
            curso.addAluno(aluno2);


        }
    }