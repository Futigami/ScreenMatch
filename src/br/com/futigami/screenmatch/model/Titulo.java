package br.com.futigami.screenmatch.model;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        this.anoLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano do lancamento: " + getAnoLancamento());
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double retornaMediaAvaliacoes(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "Nome: '" + nome + '\'' +
                ", Ano de Lancamento: " + anoLancamento + ", " +
                "Duracao: " + duracaoMinutos +
                '}';
    }
}
