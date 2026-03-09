import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implementar um programa em Java que retorne uma mensagem formatada com
         * o valor das parcelas de uma compra, a partir do valor total da compra e da
         * quantidade do parcelamento.
         */

        System.out.println("Digite o valor da compra em reais:");
        double valorCompra = input.nextDouble();

        System.out.println("Digite a quantidade de parcelas");
        int quantParcelas = input.nextInt();

        double valorTotal = valorCompra / quantParcelas;
        
        System.out.printf("Sua compra de R$ %.2f em %dx de R$ %.2f foi concluída", valorCompra, quantParcelas, valorTotal);

        input.close();

    }
}
