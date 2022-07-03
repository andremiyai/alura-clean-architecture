package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.CPF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    public void popularAluno(){
        aluno = new Aluno(new CPF("123.123.123-00"), "Fulano da Silva", new Email("fulano@gmail.com"));
    }

    @Test
    public void deveriaAdicionarUmTelefone(){
        aluno.adicionarTelefone("11", "12341234");
        Assertions.assertEquals(1,aluno.getTelefones().size());
    }

    @Test
    public void deveriaPermitirAdicionarDoisTelefone(){
        aluno.adicionarTelefone("11", "12341234");
        aluno.adicionarTelefone("11", "12341235");
        Assertions.assertEquals(2,aluno.getTelefones().size());
    }

    @Test
    public void naoDeveriaPermitirAdicionarTresTelefones(){
        aluno.adicionarTelefone("11", "12341234");
        aluno.adicionarTelefone("11", "12341235");
        Assertions.assertThrows(IllegalArgumentException.class,() -> aluno.adicionarTelefone("11", "12341236"));
    }
}

