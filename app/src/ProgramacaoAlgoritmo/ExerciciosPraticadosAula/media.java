package ProgramacaoAlgoritmo.ExerciciosPraticadosAula;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==PROGRAMA PASSOU DE ANO== ");

        double nota1, nota2, nota3, media;

        System.out.println("Digite sua primeira nota:");
        nota1 = input.nextDouble();

        System.out.println("Digite sua segunda nota:");
        nota2 = input.nextDouble();

        System.out.println("Digite sua terceira nota:");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        boolean resultado = media >= 7;

        System.out.printf("Sua média é %.1f e se você passou de ano: %s", media, resultado);

        input.close();
    }
    
}
