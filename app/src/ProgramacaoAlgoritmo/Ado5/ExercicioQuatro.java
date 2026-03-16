package ProgramacaoAlgoritmo.Ado5;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        

    Scanner input = new Scanner(System.in);

    /*
     * Implemente um programa em Java que represente
     * uma calculadora. A função deve receber dois
     * valores numéricos e o tipo da operação matemática
     * que deve realizar nos valores e retornar o resultado
     * do cálculo. As operações suportadas estão listadas
     * abaixo, caso seja enviada uma operação diferente,
     * um erro deve ser lançado com a mensagem:
     * "Operação não suportada".
     */

    System.out.println("Digite o número um: ");
    double n1 = input.nextDouble();

    System.out.println("Digite o número dois: ");
    double n2 = input.nextDouble();

    System.out.println("Digite a operação desejada: ");
    String operacao = input.nextLine();

    double soma = n1 + n2;
    double subtracao = n1 - n2;
    double multiplicacao = n1 * n2;
    double divisao = n1 / n2;
    double restoDivisao = n1 % n2;
    double potencia = Math.pow(n1, n2);

    double resultado = 0;

    if (operacao.equalsIgnoreCase("soma")){
        resultado = soma;
    } else if (operacao.equalsIgnoreCase("subtração")){
        resultado = subtracao;
    } else if (operacao.equalsIgnoreCase("multiplicação")){
        resultado = multiplicacao;
    } else if (operacao.equalsIgnoreCase("divisao")){
        resultado = divisao;
    } else if (operacao.equalsIgnoreCase("resto") || operacao.contains("resto")){
        resultado = restoDivisao;
    } else if (operacao.equalsIgnoreCase("potencia")){
        resultado = potencia;
    } else {
        System.out.println("Operação não suportada.");
    }

    System.out.printf("Resultado %f", resultado);
    input.close();

    }    
}