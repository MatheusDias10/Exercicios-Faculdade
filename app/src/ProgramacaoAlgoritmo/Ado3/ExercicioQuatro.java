package ProgramacaoAlgoritmo.Ado3;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /* Implementar um programa em Java para verificar se um número é par. */

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        boolean par = numero % 2 == 0;

        System.out.printf("Número é par? %b%n", par);

        input.close();
    }
    
}