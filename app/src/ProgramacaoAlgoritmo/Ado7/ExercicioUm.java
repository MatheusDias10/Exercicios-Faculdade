package ProgramacaoAlgoritmo.Ado7;

import java.util.Scanner;

public class ExercicioUm {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        // o vetor precisa passar pelo main para o usuário preencher e também para podermos usar em outra função,
        // já preenchido
        double[] notasAlunos = perguntaNota();
        double m = mediaNotas(notasAlunos);

    }

    public static double[] perguntaNota(){
        // nesse caso, eu não validei o array notas aqui pois iria dar interferência quando fosse declarar o tamanho.

        System.out.println("Digite quantas notas terá");
        int quantNotas = input.nextInt();

        double[] notas = new double[quantNotas]; // crio o array e decalro o tamanho

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = input.nextInt(); // a cada posição o input preenchera o lugar
        }

        return notas;
    }

    public static double mediaNotas(double[] media){

    }

}
