package ProjetoIntegrador;

import java.util.Scanner;

public class vetorExercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //declaração dos vetores
        String [] nomes = new String[3];
        double [] idades = new double[3];
        double [] salarios = new double[3];
        double [] novoSal = new double[3];

        int opcao;
        boolean dadosCadastrados = false;
        
        do {
            System.out.println("""
                    -------- Menu sistema ---------
                    1. Cadastrar dados
                    2. Exibir vetores
                    0. Sair
                    Escolha uma opção:
                    """);
            opcao = input.nextInt();
            
            switch (opcao) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("\nRegistro " + (i + 1) + " de 3:");

                        System.out.println("Nome: ");
                        input.nextLine();
                        nomes[i] = input.nextLine();

                        System.out.println("Idade:");
                        idades[i] = input.nextDouble();

                        System.out.println("Salário:");
                        salarios[i] = input.nextDouble();

                        // Calculo do novoSal
                        if (idades[i] >= 10) {
                            novoSal[i] = salarios[i] * 1.15; // 15% de aumento
                        } else {
                            novoSal[i] = salarios[i] * 1.08; // 8% de aumento
                        }
                    }
                    dadosCadastrados = true;
                    System.out.println("Todos os vetores ja foram cadastrados.");
                    break;
                    
                case 2:
                    if (!dadosCadastrados) {
                        System.out.println("Vc ainda não preencheu os vetores. (Opcção 1).");
                    } else {
                        System.out.println("----- Mensagem final -----");
                        // loop para exibição formatada
                        for (int i = 0; i < 3; i++) {
                            System.out.printf("Nome: %-10s | Idade: %.0f | Salário: R$ %.2f | Novo salário: R$ %.2f%n",
                                    nomes[i], idades[i], salarios[i], novoSal[i]);
                        }
                    }
                    break;
                    
                case 0:
                    System.out.println("Alexa, fechar programa. Ok chefe!");
                    break;
                    
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
                 
        } while (opcao != 0);
        
        input.close();
    }
}
