package br.com.futigami.screenmatch.model;

public class Filme {
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    //Metodos
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

    //Getter and Setter
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


}
