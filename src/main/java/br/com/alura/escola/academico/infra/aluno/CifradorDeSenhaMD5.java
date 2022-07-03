package br.com.alura.escola.academico.infra.aluno;

import br.com.alura.escola.academico.dominio.aluno.CifradorDeSenha;

public class CifradorDeSenhaMD5 implements CifradorDeSenha {
    @Override
    public String cifrarSenha(String senha) {
        return null;
    }

    @Override
    public boolean validarSenhaCifrada(String senhaCifrada, String senha) {
        return false;
    }
}
