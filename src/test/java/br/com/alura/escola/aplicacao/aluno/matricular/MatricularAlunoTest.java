package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido(){
        RepositorioDeAlunosEmMemoria repo = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repo);

        MatricularAlunoDto dados = new MatricularAlunoDto("fulano","123.123.123-00", "fulano@email.com");
        useCase.executa(dados);

        Aluno encontrado = repo.buscarPorCPF(new CPF("123.123.123-00"));

        assertEquals("fulano", encontrado.getNome());
        assertEquals("123.123.123-00", encontrado.getCpf());
        assertEquals("fulano@email.com", encontrado.getEmail());
    }
}
