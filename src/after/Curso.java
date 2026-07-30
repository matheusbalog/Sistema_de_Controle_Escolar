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
// Resolve PROBLEMA 1, 4 e 5: sem printar, sem acoplamento a console, sem validação+mensagem juntas
    public boolean addAluno(Aluno aluno) {
        if (buscarPorCpf(aluno.getCpf()).isPresent()) {
            return false;
        }
        alunos.add(aluno);
        return true;
    }
    // Resolve PROBLEMA 2 e 6: recebe Cpf (o identificador), e não o Aluno inteiro
    public boolean removerAluno(Cpf cpf) {
        return alunos.removeIf(a -> a.getCpf().equals(cpf));
    }

    //Resolve PROBLEMA 3: Coleção protegida, não tem mais como imprimir nada então não dá para  duplicar
    public List<Aluno> listarAlunos() {
        return Collections.unmodifiableList(alunos);
    }

    //Obrigado a tratar o caso de "Nao encontrado" (.isPresent()), se esquecer de checar
    public Optional<Aluno> buscarPorCpf(Cpf cpf) {
        return alunos.stream().filter(a -> a.getCpf().equals(cpf)).findFirst();
    }

    public Optional<Aluno> buscarPorNome(String nome) {
        return alunos.stream().filter(a -> a.getNome().equalsIgnoreCase(nome)).findFirst();
    }
}