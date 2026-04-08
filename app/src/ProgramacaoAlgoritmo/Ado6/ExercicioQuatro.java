package ProgramacaoAlgoritmo.Ado6;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    /* Implemente um programa que simule o funcionamento de um caixa
        de mercado, recebendo do usuário os valores das compras
        realizadas. O programa deve permitir a inserção de múltiplos
        valores, encerrando a entrada quando o usuário informar o valor 0.


        Caso o usuário informe valores negativos durante a entrada, o
        programa deve exibir a mensagem “Valor inválido” e
        desconsiderar esse valor no cálculo do total.

        Após o cálculo do total, o programa deve solicitar ao usuário em
        quantas vezes deseja parcelar a compra.

         Caso o usuário informe
        0 ou 1, o programa deve exibir o valor total à vista. Caso informe
        um valor maior que 1, o programa deve exibir o valor total da
        compra e o valor de cada parcela.*/


        double totalDaCompra = 0;

        // Loop para entrada dos valores dos produtos
        while (true) {
            System.out.println("Digite o valor do produto que deseja colocar no carrinho: (digite 0 para ir para as parcelas.)");
            double valorProduto = input.nextDouble();

            if (valorProduto == 0) {
                break;
            }

            if (valorProduto < 0) {
                System.out.println("Valor inválido: " + valorProduto);
            } else {
                totalDaCompra += valorProduto;
            }
        }

        // Solicitação da quantidade de parcelas
        System.out.println("Digite a quantidade de parcelas para a compra:");
        int quantidadeParcelas = input.nextInt();

        if (quantidadeParcelas <= 1) {
            System.out.printf("Pagamento à vista: R$ %.2f%n", totalDaCompra);
        } else {
            double valorDaParcela = totalDaCompra / quantidadeParcelas;

            //output
            System.out.printf("Total da compra: R$ %.2f%n", totalDaCompra);
            System.out.printf("Parcelado em %dx de R$ %.2f%n", quantidadeParcelas, valorDaParcela);
        }

        input.close();
    }
}