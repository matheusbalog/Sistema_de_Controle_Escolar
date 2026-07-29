package after;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Curso {
    private final String nome;
    private final int codigo;
    private final List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public boolean addAluno(Aluno aluno) {
        if (buscarPorCpf(aluno.getCpf()).isPresent()) {
            return false;
        }
        alunos.add(aluno);
        return true;
    }

    public boolean removerAluno(Cpf cpf) {
        return alunos.removeIf(a -> a.getCpf().equals(cpf));
    }

    public List<Aluno> listarAlunos() {
        return Collections.unmodifiableList(alunos);
    }

    public Optional<Aluno> buscarPorCpf(Cpf cpf) {
        return alunos.stream().filter(a -> a.getCpf().equals(cpf)).findFirst();
    }

    public Optional<Aluno> buscarPorNome(String nome) {
        return alunos.stream().filter(a -> a.getNome().equalsIgnoreCase(nome)).findFirst();
    }
}