import br.com.futigami.screenmatch.model.Filme;
import br.com.futigami.screenmatch.model.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Serie lost = new Serie();

        meuFilme.setNome("O poderoso chefão!");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(4);
        System.out.println("Duracao do filme: " + meuFilme.getDuracaoMinutos());
        System.out.println(meuFilme.retornaMediaAvaliacoes());

        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinPorEpisodio(50);
        System.out.println("Duracao para maratonar: " + lost.getDuracaoMinutos());
    }
}
