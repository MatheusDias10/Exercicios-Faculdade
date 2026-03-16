package ProgramacaoAlgoritmo.Ado5;

import java.util.Random;
import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que simule o jogo "Par ou Ímpar". O
         * usuário deve informar sua jogada e escolher se quer "Par" ou "Ímpar",
         * enquanto seu oponente será a máquina, que realizará uma jogada aleatória
         * de 1 a 5. Ao final, o programa deve apresentar as jogadas feitas e o
         * vencedor.
         */

        Random random = new Random();

        System.out.println("Digite Par ou Ímpar:");
        String escolha = input.nextLine();

        System.out.println("Digite sua jogada:");
        int jogador = input.nextInt();

        int maquina = random.nextInt(5) + 1;

        int soma = jogador + maquina;

        String resultado;

        if (soma % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }

        String vencedor;

        if (resultado.equalsIgnoreCase(escolha)) {
            vencedor = "Jogador venceu!";
        } else {
            vencedor = "Máquina venceu!";
        }

        System.out.println("Jogador pediu " + escolha);
        System.out.println("Jogador " + jogador + " x " + maquina + " Máquina");
        System.out.println(vencedor);

        input.close();
    }
}
