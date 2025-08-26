import br.com.futigami.screenmatch.calculos.CalculadoraDeTempo;
import br.com.futigami.screenmatch.calculos.FiltroRecomendacao;
import br.com.futigami.screenmatch.model.Episodio;
import br.com.futigami.screenmatch.model.Filme;
import br.com.futigami.screenmatch.model.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão!");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoMinutos(180);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(4);
        System.out.println("Duracao do filme: " + meuFilme.getDuracaoMinutos());
        System.out.println(meuFilme.retornaMediaAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinPorEpisodio(50);
        System.out.println("Duracao para maratonar: " + lost.getDuracaoMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeErick = new Filme();
        filmeErick.setDuracaoMinutos(60);
        filmeErick.setNome("Instance");
        filmeErick.setAnoLancamento(2000);
        filmeErick.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeErick);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size()); //Mostra tamanho da lista
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).toString());
    }
}
