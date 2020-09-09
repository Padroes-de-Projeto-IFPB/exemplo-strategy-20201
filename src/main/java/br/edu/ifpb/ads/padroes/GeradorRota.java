package br.edu.ifpb.ads.padroes;

import br.edu.ifpb.ads.padroes.estrategias.EstrategiaGeradorRota;

public class GeradorRota {

    public EstrategiaGeradorRota estrategiaGeradorRota;

    public Rota gerarRota(Ponto inicio, Ponto chegada) {
        return estrategiaGeradorRota.gerarRota(inicio, chegada);
    }

}
