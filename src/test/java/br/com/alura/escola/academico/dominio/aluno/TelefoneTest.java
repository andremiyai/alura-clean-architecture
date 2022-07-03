package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.academico.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "123456789"));
    }

    @Test
    void deveriaCriarTelefoneComDDDsValidos(){
        assertNotNull(new Telefone("11","123412341"));
    }
}
