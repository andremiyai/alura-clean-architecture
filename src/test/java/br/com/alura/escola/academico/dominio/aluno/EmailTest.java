package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.academico.dominio.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailinvalido"));
    }

    @Test
    void deveriaCriarEmailComEnderecoValido(){
        assertNotNull(new Email("abc@abc.com.br"));
    }
}
