public class IngressoFamilia extends Ingresso {

    private int quantidadePessoas;

    public IngressoFamilia(double valor, String nomeFilme, String idioma, int quantidadePessoas) {
        super(valor, nomeFilme, idioma);
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double getValorReal() {

        double total = valor * quantidadePessoas;

        if (quantidadePessoas > 3) {
            total = total * 0.95;
        }

        return total;
    }
}