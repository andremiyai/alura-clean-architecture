package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido(){
        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogDeAlunoMatriculado());

        RepositorioDeAlunosEmMemoria repo = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repo,publicador);

        MatricularAlunoDto dados = new MatricularAlunoDto("fulano","123.123.123-00", "fulano@email.com");
        useCase.executa(dados);

        Aluno encontrado = repo.buscarPorCPF(new CPF("123.123.123-00"));

        assertEquals("fulano", encontrado.getNome());
        assertEquals("123.123.123-00", encontrado.getCpf());
        assertEquals("fulano@email.com", encontrado.getEmail());
    }
}
