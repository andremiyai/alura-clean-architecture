package br.com.alura.escola.gameficacao.infra.selo;

import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.gameficacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gameficacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    List<Selo> listaSelos = new ArrayList<>();

    @Override
    public void adicionar(Selo selo) {
        listaSelos.add(selo);
    }

    @Override
    public List<Selo> selosDoAlunoDeCPF(CPF cpf) {
        return listaSelos.stream().filter(
                selo -> selo.getCpfDoAluno().getNumero().equals(cpf.getNumero())).collect(Collectors.toList());
    }
}
