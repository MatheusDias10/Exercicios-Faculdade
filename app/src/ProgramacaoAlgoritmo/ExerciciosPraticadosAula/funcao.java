package ProgramacaoAlgoritmo.ExerciciosPraticadosAula;

import java.util.Scanner;

public class funcao {
    static Scanner input = new Scanner(System.in); // variavel global

    public static void main(String[] args) {

        int a = input.nextInt();
        int b = input.nextInt();

        int s = somar(a, b);

        System.out.printf("A soma entre os números %d e %d é: %d", a, b, s);
    }


    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static double calcularMedia(double num1, double num2, double num3){
        return (num1 + num2 + num3) / 3;
    }

    public static String verificarMedia(double media){
        if (media >= 6){
            return "Aprovado parabéns";
        } else if (media < 6){
            return "Reprovado, tente novamente semestre que vem";
        }else return "Dados inválidos";
    }

//    public static int perguntaNumber(double []notas){
//
//    }

}
