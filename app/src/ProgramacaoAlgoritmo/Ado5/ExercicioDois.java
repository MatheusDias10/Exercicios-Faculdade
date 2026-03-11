package ProgramacaoAlgoritmo.Ado5;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implementar um programa em Java que informe a cor resultante
         * a partir de duas cores primárias. Se as cores informadas não
         * forem primárias, a função deve informar uma mensagem dizendo
         * que apenas cores primárias são aceitas.
         */

        System.out.println("Digite a primeira cor primária:");
        String cor1 = input.nextLine();

        System.out.println("Digite a segunda cor primária:");
        String cor2 = input.nextLine();

        String corFinal = "";

        if ((cor1.equalsIgnoreCase("vermelho") && cor2.equalsIgnoreCase("azul")) ||
                (cor1.equalsIgnoreCase("azul") && cor2.equalsIgnoreCase("vermelho"))) {
                    corFinal = "Roxo";
        }
        else if ((cor1.equalsIgnoreCase("vermelho") && cor2.equalsIgnoreCase("amarelo")) ||
                (cor1.equalsIgnoreCase("amarelo") && cor2.equalsIgnoreCase("vermelho"))) {
                    corFinal = "Laranja";
        }
        else if ((cor1.equalsIgnoreCase("azul") && cor2.equalsIgnoreCase("amarelo")) ||
                (cor1.equalsIgnoreCase("amarelo") && cor2.equalsIgnoreCase("azul"))) {
                    corFinal = "Verde";
        }
        else if (cor1.equalsIgnoreCase(cor2)) {
                    corFinal = cor1;
        } 
        else {corFinal = "Apenas cores primárias são aceitas";}

        System.out.printf("A combinação das cores é: %s", corFinal);
        input.close();

    }
}
