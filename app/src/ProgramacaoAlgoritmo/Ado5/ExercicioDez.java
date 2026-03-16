package ProgramacaoAlgoritmo.Ado5;

import java.util.Random;
import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que represente a lógica do jogo Jokenpô.
         * O usuário deve informar qual sua jogada: Pedra, Papel ou Tesoura, enquanto
         * o oponente será a máquina que realizará uma jogada aleatória. Ao final, o
         * programa deve apresentar as jogadas feitas e o vencedor.
         * Obs.:
         * Para a jogada aleatória utilize a classe Random para gerar um número
         * aleatório de 1 a 3.
         * Considere: 1 -> Pedra 2 -> Papel 3 -> Tesoura.
         */

        Random rand = new Random();

        // 1. Entrada do usuário
        System.out.println("Escolha sua jogada (Pedra, Papel ou Tesoura):");
        String jogadaUsuario = input.nextLine();

        // 2. Jogada da máquina (aleatório entre 1 e 3)
        int n = rand.nextInt(1, 4); 
        String jogadaMaquina = "";

        if (n == 1) {
            jogadaMaquina = "Pedra";
        } else if (n == 2) {
            jogadaMaquina = "Papel";
        } else {
            jogadaMaquina = "Tesoura";
        }

        // 3. Exibição do grito e das jogadas
        System.out.println("\nJoo-kenn-poo!");
        System.out.println("Jogador " + jogadaUsuario + " x " + jogadaMaquina + " Máquina");

        // 4. Lógica para decidir o vencedor
        if (jogadaUsuario.equalsIgnoreCase(jogadaMaquina)) {
            System.out.println("Empate!");
        } else if (
            (jogadaUsuario.equalsIgnoreCase("Pedra") && jogadaMaquina.equals("Tesoura")) ||
            (jogadaUsuario.equalsIgnoreCase("Papel") && jogadaMaquina.equals("Pedra")) ||
            (jogadaUsuario.equalsIgnoreCase("Tesoura") && jogadaMaquina.equals("Papel"))
        ) {
            System.out.println("Jogador venceu!");
        } else {
            System.out.println("Máquina venceu!");
        }

        input.close();
    }
}
