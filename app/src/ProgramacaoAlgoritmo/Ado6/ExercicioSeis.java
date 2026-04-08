package ProgramacaoAlgoritmo.Ado6;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número para calcular o fatorial: ");
        int numeroInformado = input.nextInt();

        if (numeroInformado <= 0) {
            System.out.println("Parâmetro inválido.");
        }
        else {
            int fatorialAcumulado = 1;

            for (int i = numeroInformado; i >= 1; i--) {
                fatorialAcumulado *= i;
            }

            System.out.printf("O fatorial de %d é %d.", numeroInformado, fatorialAcumulado);
        }

        input.close();
    }
}