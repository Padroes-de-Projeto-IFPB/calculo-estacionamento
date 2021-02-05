package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.veiculo.Carga;
import br.edu.ifpb.padroes.veiculo.Passeio;
import br.edu.ifpb.padroes.veiculo.Veiculo;

import static br.edu.ifpb.padroes.util.DateConstants.*;

public class ContaEstacionamento {

    public ContaEstacionamento(Veiculo veiculo, long inicio, long fim, CalculoValor calculoValor) {
        this.veiculo = veiculo;
        this.inicio = inicio;
        this.fim = fim;
        this.calculoValor = calculoValor;
    }

    private Veiculo veiculo;
    private long inicio, fim;
    private CalculoValor calculoValor;

    public double valorConta() {
        long atual = (fim == 0) ? System.currentTimeMillis() : fim;
        long periodo = atual - inicio;
        return calculoValor.calcular(periodo);
    }

}
