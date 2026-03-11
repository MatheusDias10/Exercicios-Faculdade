package ProgramacaoAlgoritmo.ExerciciosPraticadosAula;

import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // criação das variaveis
        double base, altura, calculo;

        System.out.println("Exercicio 7");

        // input
        System.out.println("Digite o tamanho da base do traingulo");
        base = input.nextDouble();
        
        System.out.println("Digite o tamanbho da altura do triangulo");
        altura = input.nextDouble();

        // calculo do exercicio
        calculo = (base * altura) / 2;

        // output
        System.out.printf("A área do triângulo é: %.2f", calculo);
        
        input.close();
    }
}
