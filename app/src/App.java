import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Programa
        System.out.println("Programa da soma\n");

        // Entrada de dados
        System.out.println("Informe um número:");
        int n1 = input.nextInt();

        System.out.println("Informe um número:");
        int n2 = input.nextInt();
        
        // calculo
        int soma = n1 + n2;

        // Saida dos dados
        System.out.printf("A soma de %d + %d é: %d", n1, n2, soma);

        input.close();

    }
}
