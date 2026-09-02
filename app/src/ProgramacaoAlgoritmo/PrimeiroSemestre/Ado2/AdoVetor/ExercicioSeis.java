package ProgramacaoAlgoritmo.PrimeiroSemestre.Ado2.AdoVetor;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantidade de dias monitorados: ");
        int dias = input.nextInt();

        double[] pesos = new double[dias];

        for (int i = 0; i < pesos.length; i++) {
            System.out.printf("Peso do dia %d: ", i + 1);
            pesos[i] = input.nextDouble();
        }

        System.out.print("\nPesos informados: ");
        for (int i = 0; i < pesos.length; i++) {
            System.out.print(pesos[i] + (i == pesos.length - 1 ? "" : ", "));
        }

        double maiorPeso = pesos[0];
        int diaMaior = 1;
        double menorPeso = pesos[0];
        int diaMenor = 1;

        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] > maiorPeso) {
                maiorPeso = pesos[i];
                diaMaior = i + 1;
            }
            if (pesos[i] < menorPeso) {
                menorPeso = pesos[i];
                diaMenor = i + 1;
            }
        }

        System.out.printf("\nMaior peso: %.1f kg (Dia %d)", maiorPeso, diaMaior);
        System.out.printf("\nMenor peso: %.1f kg (Dia %d)\n", menorPeso, diaMenor);

        for (int i = 0; i < pesos.length; i++) {
            System.out.printf("Dia %d | ", i + 1);

            int quantidadeBarras = (int) (pesos[i] / 5);

            for (int j = 0; j < quantidadeBarras; j++) {
                System.out.print("█");
            }

            System.out.println(" " + pesos[i]);
        }
    }
}