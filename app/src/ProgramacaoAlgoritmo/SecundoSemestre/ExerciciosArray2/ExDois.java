package ProgramacaoAlgoritmo.SecundoSemestre.ExerciciosArray2;

public class ExDois {
    public static int contaOcorrencias(int[] array, int valorProcurado){
        /*Usando busca linear, implemente contarOcorrencias(int[] array, int valor) que retorne quantas vezes o valor
         aparece no array (não apenas se existe).*/

        //variavel para somar a quantidade de vezes que o valor apareceu.
        int somaVezes = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorProcurado){
                somaVezes++; // isso serve para somar toda com o número 1 toda vez q encontrar o 55 na lista.
            }
        }
        return somaVezes;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 30, 55, 55, 64, 67, 55, 9, 90, 234, 55, 54};
        int alvo = 55;

        // passando a função
        int rodaFuncao = contaOcorrencias(numeros, alvo);

        if (rodaFuncao != 0){
            System.out.println("O alvo " + alvo + " foi encontrado na lista " + rodaFuncao + " vezes!");
        } else {
        System.out.println("O alvo " + alvo + " não foi encontrado nenhuma vez.");
        }
    }
}
