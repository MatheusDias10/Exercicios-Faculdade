package ProgramacaoAlgoritmo.Ado3;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    /*
     * Implementar um programa em Java para verificar se um aluno passou ou não,
     * baseado em 3 notas, considerando que a média mínima para passar é 6.
     */

        double nota1, nota2, nota3, media;

        System.out.println("Digite sua primeira nota:");
        nota1 = input.nextDouble();

        System.out.println("Digite sua segunda nota:");
        nota2 = input.nextDouble();

        System.out.println("Digite sua terceira nota:");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        boolean resultado = media >= 6;

        System.out.printf("Sua média é %.1f e se você passou de ano: %s", media, resultado);

        input.close();
    }
}

