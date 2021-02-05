package br.edu.ifpb.padroes.veiculo;

public class Carga extends Veiculo {

    private int eixos;

    private long valorCarga;

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public long getValorCarga() {
        return valorCarga;
    }

    public void setValorCarga(long valorCarga) {
        this.valorCarga = valorCarga;
    }
}
