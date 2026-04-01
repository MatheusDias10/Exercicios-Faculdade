package ProgramacaoAlgoritmo.Ado6;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/*        Implemente um programa que simule uma calculadora simples, permitindo
        ao usuário escolher entre as quatro operações básicas:adição, subtração,
                multiplicação e divisão.*/

        int opcao;
        do {
            System.out.println("""
                    \n1. Somar
                    2. Subtrair
                    3. Multiplicar
                    4. Dividir
                    0. Sair
                    """);
            opcao = input.nextInt();

            if (opcao == 0){
                break;
            }

            System.out.println("Digite o primeiro número:");
            double n1 = input.nextInt();

            System.out.println("Digite o segundo número:");
            double n2 = input.nextInt();

            double calculoSoma = n1 + n2;
            double calculoSubtracao = n1 - n2;
            double calculoMult = n1 * n2;
            double calculoDiv = n1 / n2;

            if (opcao == 1) {
                System.out.printf("%.1f + %.1f = %.1f", n1, n2, calculoSoma);
            }
            else if (opcao == 2) {
                System.out.printf("%.1f - %.1f = %.1f", n1, n2, calculoSubtracao);
            }
            else if (opcao == 3) {
                System.out.printf("%.1f * %.1f = %.1f", n1, n2, calculoMult);
            }
            else if (opcao == 4) {
                if (n2 == 0){
                    System.out.println("Divisão por zero não permitida.");
                } else {System.out.printf("%.1f / %.1f = %.1f", n1, n2, calculoDiv);}
            }
            else {
                String resultado = "Opção Inválida.";
            }
        }

        while (opcao != 0);
        input.close();
    }
}
