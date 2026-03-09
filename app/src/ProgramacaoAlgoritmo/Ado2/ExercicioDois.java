import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implementar um programa em Java para calcular o valor final de uma compra a
         * partir do valor da compra e do cupom de desconto. O cupom diz a porcentagem
         * que terá de desconto.
         */

        System.out.println("Digite o valor da compra:");
        double valorCompra = input.nextDouble();

        System.out.println("Digite o valor do cupom:");
        double cupomPorcentagem = input.nextDouble();

        double desconto = (cupomPorcentagem / 100) * valorCompra;
        double valorTotal = valorCompra - desconto;

        System.out.printf("Compra finalizada! O total é de R$ %.2f", valorTotal);

        input.close();
    }
}
