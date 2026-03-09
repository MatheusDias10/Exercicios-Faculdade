package ProgramacaoAlgoritmo.Ado3;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do livro: ");
        String nomeLivro = input.nextLine();

        System.out.println("Digite o total de páginas: ");
        int totalPaginas = input.nextInt();

        System.out.println("Digite o tempo de leitura por página (segundos): ");
        int segundosPagina = input.nextInt();

        int totalSegundos = totalPaginas * segundosPagina;
        double tempoHoras = totalSegundos / 3600.0;

        System.out.printf("Você lerá %s em %.2f horas.%n", nomeLivro, tempoHoras);

        input.close();
    }
}
