package br.com.futigami.screenmatch.model;

public class Serie extends Titulo{
    private int temporadas;
    private int episodioPorTemporada;
    private boolean ativo;
    private int minPorEpisodio;

    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getMinPorEpisodio() {
        return minPorEpisodio;
    }

    public void setMinPorEpisodio(int minPorEpisodio) {
        this.minPorEpisodio = minPorEpisodio;
    }

    @Override
    public int getDuracaoMinutos() {
        return temporadas * episodioPorTemporada * minPorEpisodio;
    }
}
