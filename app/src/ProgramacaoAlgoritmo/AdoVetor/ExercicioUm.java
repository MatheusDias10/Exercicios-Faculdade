package ProgramacaoAlgoritmo.AdoVetor;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos alunos há na sala de aula: ");
        int totalAl = input.nextInt();

        int[] notas  = new int[totalAl];

        // COLOCANDO AS NOTAS NAS VARIAVEIS
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Qual sua nota: ");
            int notaAluno = input.nextInt();

            if (notaAluno > 10 || notaAluno < 0){
                System.out.println("Não é permitido nota maior que 10 ou menor que 0...");
                i--;
                continue;
            } else {
                notas[i] = notaAluno;
            }
        }

        // OUTPUT DE TODAS AS NOTAS
        for (int nota : notas) {
            System.out.printf("Nota equivale a: %d\n", nota);
        }

        // MEDIA DAS NOTAS
        double mediaNota = 0;
        int soma = 0;

        for (int nota : notas) {
            soma += nota;
        }

        mediaNota = (double) soma / totalAl;
        System.out.printf("A média das notas é: %.2f\n", mediaNota);


        int menorNota = Integer.MAX_VALUE;
        int maiorNota = Integer.MIN_VALUE;
        // Exibir a maior e menor nota do vetor
        for (int nota : notas) {

            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        System.out.printf("A menor nota é %d e a maior é %d\n", menorNota, maiorNota);


        // Vendo quantos alunos passaram de ano
        int aprovados = 0;
        int reprovados = 0;
        for (int nota : notas){

            if (nota >= 6){
                aprovados ++;
            }
            if (nota < 6){
                reprovados ++;
            }
        }

        System.out.printf("Foram aprovados exatamente %d alunos e reprovados %d alunos.\n", aprovados, reprovados);

    }
}


