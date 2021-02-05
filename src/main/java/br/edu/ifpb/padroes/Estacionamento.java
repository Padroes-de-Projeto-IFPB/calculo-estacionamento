package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.veiculo.Passeio;
import br.edu.ifpb.padroes.veiculo.Veiculo;

import static br.edu.ifpb.padroes.util.DateConstants.*;

public class Estacionamento {

    public static void main(String[] args) {

        Veiculo veiculo = new Passeio();
        veiculo.setPlaca("ABC-1234");

        long inicio = System.currentTimeMillis() - (1 * HORA);

        ContaEstacionamento conta = new ContaEstacionamento(veiculo, inicio, 0, new CalculoPasseio());

        System.out.println("Valor total = "+conta.valorConta());

    }

}
