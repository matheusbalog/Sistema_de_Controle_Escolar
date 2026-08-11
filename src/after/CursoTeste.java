package after;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;
import  java.util.List;

class CursoTest {

    @Test
    void deveAdicionarAlunoComSucesso() {
        Curso curso = new Curso("Direito", 1);
        Aluno aluno = new Aluno("Matheus", new Cpf("53712345678"), 19, new Nota(9, 5, 10));

        boolean resultado = curso.addAluno(aluno);

        assertTrue(resultado);
    }

    @Test
    void deveEncontrarAlunoPorNome() {
        Curso curso = new Curso("Direito", 1);
        curso.addAluno(new Aluno("Matheus", new Cpf("53712345678"), 19, new Nota(9, 10, 8)));

        Optional<Aluno> encontrado = curso.buscarPorNome("Matheus");

        assertTrue(encontrado.isPresent());
    }

    @Test
    void naoDeveEncontrarAlunoInexistente() {
        Curso curso = new Curso("Direito", 1);
        curso.addAluno(new Aluno("Eduardo", new Cpf("53712345678"), 19, new Nota(9, 10, 10)));

        Optional<Aluno> encontrado = curso.buscarPorNome("Matheus");

        assertFalse(encontrado.isPresent());
    }

    @Test
    void listarAlunosDeveRetornarListaComTamanhoCorreto() {
        Curso curso = new Curso("Direito", 1);
        curso.addAluno(new Aluno("Matheus", new Cpf("53712345678"), 19, new Nota(9, 10, 5)));
        curso.addAluno(new Aluno("Eduardo", new Cpf("53912345678"), 20, new Nota(5, 10, 8)));

        assertEquals(2, curso.listarAlunos().size());
    }

    @Test
    void doisCpfsComMesmoNumeroDevemSerIguais() {
        Cpf cpf1 = new Cpf("53712345678");
        Cpf cpf2 = new Cpf("537.123.456-78");

        assertEquals(cpf1, cpf2);
    }
    @Test
        void deveAprovarAlunoComNotaMaiorOuIgualA7() {
            assertTrue(new Nota(8, 8, 8).isAprovado());
        }

    @Test
        void deveReprovarAlunoComNotaMenorQue7() {
            assertFalse(new Nota(6, 4, 2).isAprovado());
        }

    @Test
        void naoDeveAceitarNotaForaDoIntervalo() {
            assertThrows(IllegalArgumentException.class, () -> new Nota(-1, 100, 40));
        }

    @Test
        void naoDeveAceitarCpfComTamanhoInvalido() {
            assertThrows(IllegalArgumentException.class, () -> new Cpf("123"));
        }

    @Test
        void naoDevePermitirDoisAlunosComMesmoCpf() {
            Curso curso = new Curso("Direito", 1);
            Cpf cpf = new Cpf("53712345678");
            curso.addAluno(new Aluno("A", cpf, 20, new Nota(8, 8, 10)));

            boolean resultado = curso.addAluno(new Aluno("B", cpf, 21, new Nota(7, 10, 10)));

            assertFalse(resultado);
        }

        @Test
        void deveRemoverAlunoPeloCpf() {
            Curso curso = new Curso("Direito", 1);
            Cpf cpf = new Cpf("53712345678");
            curso.addAluno(new Aluno("A", cpf, 20, new Nota(8, 6, 5)));

            assertTrue(curso.removerAluno(cpf));
        }
    }





