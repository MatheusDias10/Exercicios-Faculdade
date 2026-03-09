import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Implementar um programa em Java para calcular o valor final de uma compra a
        partir do valor da compra e do cupom de desconto. O cupom diz quantos reais
        terá de desconto.
        */

        System.out.println("Digite o valor da compra:");
        double valorCompra = input.nextDouble();

        System.out.println("Digite o cupom de desconto que deseja utilizar:");
        double cupomReais = input.nextDouble();

        double valorTotal = valorCompra - cupomReais;

        System.out.printf("Compra finalizada! O total é de R$ %.2f", valorTotal);

        input.close();
    }
}