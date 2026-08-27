package ProjetoIntegrador;

import java.util.Scanner;

public class CondicaoDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double media, n1, n2; String status, erro;

        System.out.println("Digite a nota 1: ");
        n1 = input.nextDouble();

        System.out.println("Digite a nota 2: ");
        n2 = input.nextDouble();

        if (n1 < 0 || n1 > 19 || n2 < 0 || n2 > 10){
            erro = "Erro! Nota 1 e 2 devem estar entre 0 e 10";
            System.out.println(erro);
            System.exit(0);
        }
        media = (n1 + n2) / 2;

        if (media < 3){
            status = "Aluno reprovado";
        } else if (media < 5){
            status = "Aluno de recuperação";
        } else if (media < 6){
            status = "Aluno de exame";
        } else {
            status = "Aluno aprovado";
        }

        String saida;
        saida = String.format("Media do aluno: %.2f{%s}", media, status );
        System.out.println(saida);
        input.close();
    }
    
}
