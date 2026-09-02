package ProgramacaoAlgoritmo.PrimeiroSemestre.Ado2.AdoVetor;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] tarefas = new String[100];
        boolean[] concluida = new boolean[100];
        int totalTarefas = 0;
        int opcao;

        do {
            System.out.println("\n--- CONTROLE DE TAREFAS ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar concluída");
            System.out.println("4. Exibir pendentes");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    input.nextLine();
                    System.out.print("Digite a tarefa: ");
                    tarefas[totalTarefas] = input.nextLine();
                    concluida[totalTarefas] = false;
                    totalTarefas++;
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    if (totalTarefas == 0) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        System.out.println("\nLista de tarefas:");
                        for (int i = 0; i < totalTarefas; i++) {
                            String status = concluida[i] ? "[X]" : "[ ]";
                            System.out.printf("%d - %s %s\n", (i + 1), status, tarefas[i]);
                        }
                    }
                    break;

                case 3:
                    if (totalTarefas == 0) {
                        System.out.println("Nenhuma tarefa para concluir.");
                    } else {
                        System.out.print("Número da tarefa concluída: ");
                        int num = input.nextInt();
                        if (num > 0 && num <= totalTarefas) {
                            concluida[num - 1] = true;
                            System.out.println("Tarefa " + num + " marcada como concluída.");
                        } else {
                            System.out.println("Número inválido!");
                        }
                    }
                    break;

                case 4:
                    if (totalTarefas == 0) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        System.out.println("\nTarefas pendentes:");
                        for (int i = 0; i < totalTarefas; i++) {
                            if (!concluida[i]) {
                                System.out.printf("%d - [ ] %s\n", (i + 1), tarefas[i]);
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0);
    }
}