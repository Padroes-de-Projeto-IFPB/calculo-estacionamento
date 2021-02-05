package br.edu.ifpb.padroes;

import static br.edu.ifpb.padroes.util.DateConstants.*;

public class CalculoPasseio implements CalculoValor {

    @Override
    public double calcular(long periodo) {
        if (periodo < 12 * HORA) {
            return 2.0 * Math.ceil(periodo / HORA);
        } else if (periodo > 12 * HORA && periodo < 15 * DIA) {
            return 26.0 * Math.ceil(periodo / DIA);
        } else {
            return 300.0 * Math.ceil(periodo / MES);
        }
    }
}
