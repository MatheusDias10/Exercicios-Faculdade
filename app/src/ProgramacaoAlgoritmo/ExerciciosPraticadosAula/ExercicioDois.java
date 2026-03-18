package ProgramacaoAlgoritmo.ExerciciosPraticadosAula;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // https://olimpiada.ic.unicamp.br/pratique/p1/2021/f2/recorde/

    System.out.println("R:");
    int R = input.nextInt();

    System.out.println("M:");
    int M = input.nextInt();

    System.out.println("L:");
    int L = input.nextInt();

    if (R <= M){
        System.out.println("RM");
    } else {
        System.out.println("*");
    }

    if (R <= L){
        System.out.println("RO");
    } else {
        System.out.println("*");
    }
    
    }
}