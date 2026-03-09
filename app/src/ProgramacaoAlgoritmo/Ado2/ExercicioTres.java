import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Implementar um programa em Java para converter kilos para gramas. */

        System.out.println("Digite um valor em kilos:");
        double valorKilo = input.nextDouble();

        double valorGrama = valorKilo * 1000;

        System.out.println(valorGrama);

        input.close();
    }
}
