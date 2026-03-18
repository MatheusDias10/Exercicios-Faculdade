package ProgramacaoAlgoritmo.ExerciciosPraticadosAula;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Sabemos que Cibele nasceu antes de Camila e Celeste nasceu depois de Camila.
         * 
         * Dados três números inteiros indicando as idades das irmãs, escreva um
         * programa para determinar a idade de Camila.
         * 
         * Entrada
         * A entrada é composta por três linhas, cada linha contendo um número inteiro
         * N, a idade de uma das irmãs.
         * 
         * Saída
         * Seu programa deve produzir uma única linha, contendo um único número inteiro,
         * a idade de Camila.
         * 
         * Restrições
         * 5 ≤ N ≤ 100
         */

        System.out.println("Digite a primeira idade:");
        int n1 = input.nextInt();

        System.out.println("Digite a segunda idade");
        int n2 = input.nextInt();

        System.out.println("Digite a terceira idade:");
        int n3 = input.nextInt();

        if (n1 < n2 && n2 < n3 || n3 < n2 && n2 < n1){
        System.out.println(n2);
        } else if (n2 < n1 && n1 < n3 || n3 < n1 && n1 < n2){
            System.out.println(n1);
        } else if (n1 < n3 && n3 <n3 || n2 < n3 && n3 < n1){
            System.out.println(n3);
        }
    }
}