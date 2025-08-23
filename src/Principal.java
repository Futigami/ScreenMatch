public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O poderoso chefão!");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoMinutos(180);

        System.out.println(meuFilme.getNome());
        System.out.println(meuFilme.getAnoLancamento());
    }
}
