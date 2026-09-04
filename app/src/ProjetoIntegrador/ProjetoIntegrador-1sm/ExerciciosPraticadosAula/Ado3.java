package ProjetoIntegrador;

import java.util.Scanner;

public class Ado3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("Digite seu peso:");
        peso = input.nextDouble();

        System.out.println("Digite sua altura:");
        altura = input.nextDouble();

        imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9 ){
            System.out.println("Peso normal");
        } else if (imc >= 25){
            System.out.println("Está com sobrepeso.");
        } else {
            System.out.println("Dados incorretos.");
        }

        System.out.printf("Seu IMC é de: %.2f", imc);

        input.close();
    }
}
