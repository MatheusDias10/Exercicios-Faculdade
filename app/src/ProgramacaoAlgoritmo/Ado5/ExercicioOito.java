package ProgramacaoAlgoritmo.Ado5;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implemente um programa em Java que informe a situação de um orçamento
         * familiar baseado no total de ganhos e gastos. A situação deve ser calculada
         * a partir da tabela abaixo:
        */

        System.out.println("Digite o total de ganhos:");
        double ganhos = input.nextDouble();

        System.out.println("Digite o total de gastos:");
        double gastos = input.nextDouble();

        double porcentagem = (gastos / ganhos) * 100;

        String resultado;

        if (gastos > ganhos) {
            resultado = "Orçamento comprometido! Hora de rever seus gastos!";
        } 
        else if (porcentagem >= 81) {
            resultado = "Cuidado, seu orçamento pode ficar comprometido!";
        } 
        else if (porcentagem >= 51) {
            resultado = "Atenção, melhor conter os gastos!";
        } 
        else if (porcentagem >= 21) {
            resultado = "Muito bem, seus gastos não ultrapassam metade dos ganhos!";
        } 
        else {
            resultado = "Parabéns, está gerenciando bem seu orçamento!";
        }

        System.out.println(resultado);
        input.close();
    }
}
