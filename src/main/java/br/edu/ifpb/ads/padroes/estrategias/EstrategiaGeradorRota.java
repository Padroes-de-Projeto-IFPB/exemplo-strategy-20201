package br.edu.ifpb.ads.padroes.estrategias;

import br.edu.ifpb.ads.padroes.Ponto;
import br.edu.ifpb.ads.padroes.Rota;

public interface EstrategiaGeradorRota {
    Rota gerarRota(Ponto inicio, Ponto chegada);
}
