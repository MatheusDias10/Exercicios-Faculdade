package ProgramacaoAlgoritmo.ExerciciosPraticadosAula;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // https://olimpiada.ic.unicamp.br/pratique/pj/2016/f2/medalhas/

        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int t3 = input.nextInt();

        // tempo 1

        if (t1 < t2 && t1 < t3){
            System.out.println("1");
        }
         else if (t1 > t2 && t1 < t3 || t1 > t3 && t1 < t2){
            System.out.println("2");
        }
        else {
            System.out.println("3");
        }

        //tempo 2

        if (t2 < t1 && t2 < t3){
            System.out.println("1");
        }
        else if (t2 < t1 && t2 > t3 || t2 > t1 && t2 < t3){
            System.out.println("2");
        }
        else {
            System.out.println("3");
        }

        // tempo 3

        if (t3 < t1 && t3 < t2){
            System.out.println("1");
        }
        else if (t3 > t1 && t3 < t2 || t3 < t1 && t3 > t2){
            System.out.println("2");
        }
        else {
            System.out.println("3");
        }
    }
}
