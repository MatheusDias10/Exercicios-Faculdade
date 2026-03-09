package ProgramacaoAlgoritmo.Ado3;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implementar um programa em Java que realize uma pergunta sobre um
         * anime/filme ao usuário e verifique se a resposta está correta.
         */

        System.out.println("Quem foi o diretor de Django Livre:");
        String resposta = input.nextLine();

        boolean respostaPergunta = resposta.equalsIgnoreCase("Quentin Tarantino")
                || resposta.equalsIgnoreCase("Tarantino");

        System.out.printf("Resposta correta: %s", respostaPergunta);

        input.close();
    }
}
