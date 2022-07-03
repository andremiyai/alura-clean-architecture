package br.com.alura.escola.shared.dominio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {

    @Test
    void naoDeveriaCriarCPFsComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("12344.12.11234-1234"));
    }

    @Test
    void deveriaCriarCPFComNumeroValido(){
        assertNotNull(new CPF("123.123.123-12"));
    }
}
