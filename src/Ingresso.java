public class Ingresso {

    protected double valor;
    protected String nomeFilme;
    protected String idioma;

    public Ingresso(double valor, String nomeFilme, String idioma) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.idioma = idioma;
    }

    public double getValorReal() {
        return valor;
    }
}