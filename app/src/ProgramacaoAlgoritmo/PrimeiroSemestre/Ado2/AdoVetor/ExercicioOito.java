package ProgramacaoAlgoritmo.PrimeiroSemestre.Ado2.AdoVetor;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[1000];
        int[] quantidades = new int[1000];
        int totalProdutos = 0;
        int opcao;

        do {
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Realizar entrada no estoque");
            System.out.println("3. Realizar saída no estoque");
            System.out.println("4. Listar estoque");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if (totalProdutos < 1000) {
                        input.nextLine();
                        System.out.print("Nome do produto: ");
                        nomes[totalProdutos] = input.nextLine();
                        System.out.print("Quantidade inicial: ");
                        quantidades[totalProdutos] = input.nextInt();
                        totalProdutos++;
                        System.out.println("Produto adicionado com sucesso!");
                    } else {
                        System.out.println("Limite de 1000 produtos atingido!");
                    }
                    break;

                case 2:
                    if (totalProdutos == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.print("Número do produto (1 a " + totalProdutos + "): ");
                        int numEntrada = input.nextInt();
                        System.out.print("Quantidade de entrada: ");
                        int qtdEntrada = input.nextInt();
                        quantidades[numEntrada - 1] += qtdEntrada;
                        System.out.println("Entrada realizada com sucesso!");
                    }
                    break;

                case 3:
                    if (totalProdutos == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.print("Número do produto (1 a " + totalProdutos + "): ");
                        int numSaida = input.nextInt();
                        System.out.print("Quantidade de saída: ");
                        int qtdSaida = input.nextInt();

                        if (qtdSaida <= quantidades[numSaida - 1]) {
                            quantidades[numSaida - 1] -= qtdSaida;
                            System.out.println("Saída realizada com sucesso!");
                        } else {
                            System.out.println("Quantidade insuficiente em estoque!");
                        }
                    }
                    break;

                case 4:
                    if (totalProdutos == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("\nEstoque atual:");
                        for (int i = 0; i < totalProdutos; i++) {
                            System.out.printf("Produto %d: %s - %d unidades\n", (i + 1), nomes[i], quantidades[i]);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);
    }
}