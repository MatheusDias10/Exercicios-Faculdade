package ProgramacaoAlgoritmo.Ado6;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a posição desejada na sequência de Fibonacci: ");
        int posicaoDesejada = input.nextInt();

        if (posicaoDesejada <= 0) {
            System.out.println("Por favor, informe uma posição maior que 0.");

        } else if (posicaoDesejada == 1 || posicaoDesejada == 2) {
            System.out.printf("O valor na posição %d da sequência de Fibonacci é 1%n", posicaoDesejada);

        } else {
            int anterior = 1;
            int atual = 1;

            for (int i = 3; i <= posicaoDesejada; i++) {
                int proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }

            System.out.printf("O valor na posição %d da sequência de Fibonacci é %d.", posicaoDesejada, atual);
        }

        input.close();
    }
}