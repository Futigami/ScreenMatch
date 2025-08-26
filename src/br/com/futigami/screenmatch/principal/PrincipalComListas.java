package br.com.futigami.screenmatch.principal;

import br.com.futigami.screenmatch.model.Filme;
import br.com.futigami.screenmatch.model.Serie;
import br.com.futigami.screenmatch.model.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão!",1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeErick = new Filme("Deu a louca", 2000);
        filmeErick.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeErick);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo titulo : lista){ // ou list.forEach(System.out::println);
            System.out.println(titulo);
            Filme filme = (Filme) titulo;
            System.out.println("Classificacao " + filme.getClassificacao());
        }
    }
}
