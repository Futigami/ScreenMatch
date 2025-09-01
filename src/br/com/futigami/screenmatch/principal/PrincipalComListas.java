package br.com.futigami.screenmatch.principal;

import br.com.futigami.screenmatch.model.Filme;
import br.com.futigami.screenmatch.model.Serie;
import br.com.futigami.screenmatch.model.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeErick = new Filme("Deu a louca", 2000);
        filmeErick.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeErick);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo titulo : lista){ // ou list.forEach(System.out::println);
            System.out.println(titulo);
            if(titulo instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificacao " + filme.getClassificacao());
            }
        }

//        ArrayList<String> buscaPorArtista = new ArrayList<>();
//        buscaPorArtista.add("Adam Sandler");
//        buscaPorArtista.add("Paulo");
//        buscaPorArtista.add("Erick");
//        buscaPorArtista.add("Joao");
//        buscaPorArtista.add("Thay");
//        System.out.println(buscaPorArtista);
//
//        Collections.sort(buscaPorArtista);
//        System.out.println("Depois da ordenacao!!!");
//        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados por nome!");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("Lista de titulos ordenados por ano de lancamento!");
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(lista);
    }
}
