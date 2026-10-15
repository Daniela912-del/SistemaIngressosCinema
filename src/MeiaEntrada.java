public class MeiaEntrada extends Ingresso {
/* Construtor

 */
    public MeiaEntrada(double valor, String nomeFilme, String idioma) {
        super(valor, nomeFilme, idioma);
    }

    @Override
    public double getValorReal() {
        return valor / 2;
    }
}