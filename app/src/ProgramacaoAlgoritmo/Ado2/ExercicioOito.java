import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implementar um programa em Java para calcular o total de uma venda de açaí a
         * partir das quantidades compradas para cada tamanho: pequeno, médio e grande,
         * sabendo que o valor do açaí é R$ 13,50, R$ 15,00 e R$ 17,50 respectivamente.
         */

        int contadorPequeno = 0;
        int contadorMedio = 0;
        int contadorGrande = 0;

        System.out.println("Qual tamanho você deseja, pequeno, médio ou grande:");
        String valor1 = input.nextLine();

        if (valor1.equalsIgnoreCase("pequeno")) {
            contadorPequeno++;
        } else if (valor1.equalsIgnoreCase("medio")) {
            contadorMedio++;
        } else if (valor1.equalsIgnoreCase("grande")) {
            contadorGrande++;
        } else {
            System.out.println("Algo de errado não está certo...");
        }

        System.out.println("Qual tamanho você deseja, pequeno, médio ou grande:");
        String valor2 = input.nextLine();

        if (valor2.equalsIgnoreCase("pequeno")) {
            contadorPequeno++;
        } else if (valor2.equalsIgnoreCase("medio")) {
            contadorMedio++;
        } else if (valor2.equalsIgnoreCase("grande")) {
            contadorGrande++;
        } else {
            System.out.println("Algo de errado não está certo...");
        }

        System.out.println("Qual tamanho você deseja, pequeno, médio ou grande:");
        String valor3 = input.nextLine();

        if (valor3.equalsIgnoreCase("pequeno")) {
            contadorPequeno++;
        } else if (valor3.equalsIgnoreCase("medio")) {
            contadorMedio++;
        } else if (valor3.equalsIgnoreCase("grande")) {
            contadorGrande++;
        } else {
            System.out.println("Algo de errado não está certo...");
        }

        double somaPequeno = contadorPequeno * 13.50;
        double somaMedio = contadorMedio * 15.00;
        double somaGrande = contadorGrande * 17.50;

        double somaTotal = somaPequeno + somaMedio + somaGrande;

        System.out.printf("Total à pagar é R$ %.2f", somaTotal);

        input.close();
    }
}
