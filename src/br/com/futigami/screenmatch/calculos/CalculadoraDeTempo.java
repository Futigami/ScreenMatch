package br.com.futigami.screenmatch.calculos;

import br.com.futigami.screenmatch.model.Filme;
import br.com.futigami.screenmatch.model.Serie;

public class CalculadoraDeTempo {
    private int tempoTotal;

    //Metodo
    public void inclui(Filme f){
        tempoTotal += f.getDuracaoMinutos();
    }

    public void inclui(Serie s){
        tempoTotal += s.getDuracaoMinutos();
    }

    //Getter Setter
    public int getTempoTotal() {
        return tempoTotal;
    }
}
