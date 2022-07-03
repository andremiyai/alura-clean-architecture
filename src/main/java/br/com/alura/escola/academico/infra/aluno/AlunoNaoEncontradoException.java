package br.com.alura.escola.academico.infra.aluno;

import br.com.alura.escola.shared.dominio.CPF;

public class AlunoNaoEncontradoException extends RuntimeException {
    public AlunoNaoEncontradoException(CPF cpf) {
        super("Aluno nao encontrado com CPF: "+cpf.getNumero());
    }
}
