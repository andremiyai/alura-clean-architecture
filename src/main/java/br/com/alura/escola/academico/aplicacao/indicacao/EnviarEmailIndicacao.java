package br.com.alura.escola.academico.aplicacao.indicacao;

import br.com.alura.escola.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarEmail(Aluno indicado);
}
