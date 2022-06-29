package br.com.alura.escola.infra.aluno;

import br.com.alura.escola.dominio.aluno.CPF;

public class AlunoNaoEncontradoException extends RuntimeException {
    public AlunoNaoEncontradoException(CPF cpf) {
        super("Aluno nao encontrado com CPF: "+cpf.getNumero());
    }
}
