package ProjetoIntegrador;

import java.util.Scanner;

public class Condicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String genero;

        System.out.println("Qual seu genêro:");
        genero = input.next();

        if (genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("Masculino")){
            System.out.println("Você é homem.");
        } else if (genero.equalsIgnoreCase("F") || genero.equalsIgnoreCase("Feminino")){
            System.out.println("Você é mulher.");
        } else {
            System.out.println("Genêro inválido.");
        }

        input.close();
    }
}
