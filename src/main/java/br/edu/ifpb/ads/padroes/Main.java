package br.edu.ifpb.ads.padroes;

import br.edu.ifpb.ads.padroes.estrategias.EstrategiaTransportePublico;

public class Main {
    public static void main(String[] args) {
        GeradorRota geradorRota = new GeradorRota(new EstrategiaTransportePublico());
        Ponto partida = new Ponto(2332L, 2322L);
        Ponto chegada = new Ponto(2322L, 2313L);
        geradorRota.gerarRota(partida, chegada);
    }
}
