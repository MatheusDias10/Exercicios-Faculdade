package ProgramacaoAlgoritmo.SecundoSemestre;

import javax.swing.*;

public class Ado1 {
    public static void main(String[] args) {

/*  1) Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
    Todos os elementos da Diagonal Principal
    Todos os elementos da Diagonal Secundária
    A Soma de todos os elementos da Diagonal Principal
    A Soma de todos os elementos da Diagonal Secundária*/

        // Criando Matriz 3x3.
        int [][] matriz = new int[3][3];

        // Adicionando valores à Matriz.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String entrada = (JOptionPane.showInputDialog(
                        "Digite valor para a posição [" + i + "][" + j + "]: "
                ));
                matriz[i][j] = Integer.parseInt(entrada);
            }
        }

        //
    }
}
