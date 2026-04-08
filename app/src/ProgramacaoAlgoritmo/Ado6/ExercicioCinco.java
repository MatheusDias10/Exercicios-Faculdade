package ProgramacaoAlgoritmo.Ado6;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    /*  Implemente um programa que simule um sistema bancário básico,
        permitindo ao usuário realizar operações em uma conta.*/


        double saldoAtual = 0.0;
        int opcaoEscolhida;

        do {
            // Exibição do Menu
            System.out.println("\n--- Menu de Opções ---");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Realizar Depósito");
            System.out.println("3. Realizar Saque");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcaoEscolhida = input.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    // consultar Saldo
                    System.out.printf("Saldo atual: R$ %.2f%n", saldoAtual);
                    break;

                case 2:
                    // realizando o Depósito
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = input.nextDouble();

                    if (valorDeposito < 0) {
                        System.out.println("Valor inválido");
                    } else {
                        saldoAtual += valorDeposito;
                        System.out.printf("Saldo atual: R$ %.2f%n", saldoAtual);
                    }
                    break;

                case 3:
                    // realizar saque
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = input.nextDouble();

                    if (valorSaque < 0) {
                        System.out.println("Valor inválido");
                    } else if (valorSaque > saldoAtual) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldoAtual -= valorSaque;
                        System.out.printf("Saldo atual: R$ %.2f%n", saldoAtual);
                    }
                    break;

                case 0:
                    // sair
                    System.out.println("Encerrando o sistema. É nois dog!");
                    break;

                default:
                    // Opção Inválida
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcaoEscolhida != 0);

        input.close();
    }
}

