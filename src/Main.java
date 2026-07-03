import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        System.out.println("-------------");
        System.out.println("DIA DA SEMANA");
        System.out.println("-------------\n");

        System.out.println("Escolha uma das duas opções:\n\n" +
                "1 - Receber o dia da semana associado ao número \n" +
                "2 - Receber o número associado ao dia da semana \n");
        int opcao = entrada.nextInt();
        System.out.println();

        if (opcao == 1) {

            System.out.println("Digite um número no intervalo de 1 - 7 \n");
            int dia = entrada.nextInt();
            System.out.println();

            if (dia == 1) System.out.println("Domingo");
            else if (dia == 2) System.out.println("Segunda");
            else if (dia == 3) System.out.println("Terça");
            else if (dia == 4) System.out.println("Quarta");
            else if (dia == 5) System.out.println("Quinta");
            else if (dia == 6) System.out.println("Sexta");
            else if (dia == 7) System.out.println("Sábado");
            else System.out.println("Entrada inválida!");

        }
        else if (opcao == 2) {

            System.out.println("Digite algum dia da semana: \n");
            String dia = entrada.next();
            System.out.println();

            if (dia.equalsIgnoreCase("domingo")) {
                System.out.println("1");
            }
            else if ("segunda".equalsIgnoreCase(dia)) {
                System.out.println("2");
            }
            else if (dia.equalsIgnoreCase("terça")) {
                System.out.println("3");
            }
            else if ("quarta".equalsIgnoreCase(dia)) {
                System.out.println("4");
            }
            else if (dia.equalsIgnoreCase("quinta")) {
                System.out.println("5");
            }
            else if ("sexta".equalsIgnoreCase(dia)) {
                System.out.println("6");
            }
            else if (dia.equalsIgnoreCase("sabado")) {
                System.out.println("7");
            }
            else {
                System.out.println("Entrada inválida!");
            }

        }
        else System.out.println("Opção inválida!");

        entrada.close();

    }

}
