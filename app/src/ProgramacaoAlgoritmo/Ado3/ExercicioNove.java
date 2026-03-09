package ProgramacaoAlgoritmo.Ado3;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implementar um programa em Java que verifique se o estado atual de
         * combustível
         * em um carro aponta à necessidade de reabastecê-lo, sabendo que é sugerido
         * realizar o abastecimento quando o combustível atinge ¼ ou menos do tamanho do
         * tanque. O programa deve receber a capacidade do tanque (em litros), a
         * quantidade
         * atual de combustível (em litros) e retornar se o carro deve ser reabastecido.
         */

        System.out.println("Digite a capacidade do tanque:");
        double capacidadeTanque = input.nextDouble();

        System.out.println("Digite a quantidade atual de combustível:");
        double combustivelAtual = input.nextDouble();

        double limite = capacidadeTanque / 4.0;

        boolean precisaAbastecer = combustivelAtual <= limite;

        System.out.printf("Carro precisa ser reabastecido? %b", precisaAbastecer);

        input.close();
    }
}
