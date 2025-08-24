package br.com.futigami.screenmatch.calculos;

import br.com.futigami.screenmatch.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    //Metodo

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoMinutos();
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoMinutos();
//    }

    public void inclui(Titulo t){
        tempoTotal += t.getDuracaoMinutos();
    }

    //Getter Setter
    public int getTempoTotal() {
        return tempoTotal;
    }
}
