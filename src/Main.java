import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        NumberFormat moeda =
                NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        final double VALOR_INGRESSO = 30.0;
        final String FILME = "Vingadores";

        int opcao;

        do {

            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "=== CINEMA ===\n\n" +
                                    "Filme: " + FILME + "\n" +
                                    "Valor do Ingresso: " + moeda.format(VALOR_INGRESSO) + "\n\n" +
                                    "1 - Ingresso Normal\n" +
                                    "2 - Meia Entrada\n" +
                                    "3 - Ingresso Família\n" +
                                    "0 - Sair"
                    )
            );

            switch (opcao) {

                case 1:

                    String idioma = JOptionPane.showInputDialog(
                            "Idioma (Dublado ou Legendado):"
                    );

                    Ingresso ingresso =
                            new Ingresso(
                                    VALOR_INGRESSO,
                                    FILME,
                                    idioma
                            );

                    JOptionPane.showMessageDialog(
                            null,
                            "FILME: " + FILME +
                                    "\nIDIOMA: " + idioma +
                                    "\nTIPO: Ingresso Normal" +
                                    "\nVALOR TOTAL: " +
                                    moeda.format(ingresso.getValorReal())
                    );

                    break;

                case 2:

                    idioma = JOptionPane.showInputDialog(
                            "Idioma (Dublado ou Legendado):"
                    );

                    MeiaEntrada meiaEntrada =
                            new MeiaEntrada(
                                    VALOR_INGRESSO,
                                    FILME,
                                    idioma
                            );

                    JOptionPane.showMessageDialog(
                            null,
                            "FILME: " + FILME +
                                    "\nIDIOMA: " + idioma +
                                    "\nTIPO: Meia Entrada" +
                                    "\nVALOR TOTAL: " +
                                    moeda.format(meiaEntrada.getValorReal())
                    );

                    break;

                case 3:

                    idioma = JOptionPane.showInputDialog(
                            "Idioma (Dublado ou Legendado):"
                    );

                    int quantidadePessoas = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Quantidade de Pessoas:"
                            )
                    );

                    IngressoFamilia familia =
                            new IngressoFamilia(
                                    VALOR_INGRESSO,
                                    FILME,
                                    idioma,
                                    quantidadePessoas
                            );

                    double valorSemDesconto =
                            VALOR_INGRESSO * quantidadePessoas;

                    double desconto = 0;

                    if (quantidadePessoas > 3) {
                        desconto = valorSemDesconto * 0.05;
                    }

                    JOptionPane.showMessageDialog(
                            null,
                            "FILME: " + FILME +
                                    "\nIDIOMA: " + idioma +
                                    "\nTIPO: Ingresso Família" +
                                    "\nPESSOAS: " + quantidadePessoas +
                                    "\nVALOR SEM DESCONTO: " +
                                    moeda.format(valorSemDesconto) +
                                    "\nDESCONTO: " +
                                    moeda.format(desconto) +
                                    "\nVALOR TOTAL: " +
                                    moeda.format(familia.getValorReal())
                    );

                    break;

                case 0:

                    JOptionPane.showMessageDialog(
                            null,
                            "Obrigado por utilizar o sistema!"
                    );

                    break;

                default:

                    JOptionPane.showMessageDialog(
                            null,
                            "Opção inválida!"
                    );
            }

        } while (opcao != 0);
    }
}