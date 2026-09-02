package ProgramacaoAlgoritmo.SecundoSemestre.ExerciciosArray2;

public class ExUm {
    public static int buscaLinear(int[] array, int valorProcurado){
        /*Implemente um método buscarLinear(int[] array, int valor) que retorne a posição da primeira ocorrência do valor
          no array, ou -1 caso não exista. Teste com um array de sua escolha, com pelo menos 8 elementos.*/

        for (int i = 0; i < array.length; i++) {
            if(array[i] == valorProcurado){
                return i;
            }
        }
        // Se o loop terminar sme achar nada, só passar o -1 para retornar ausencia.
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {50, 3, 6654, 1, 3545, 33, 67, 76, 23, 90};
        int alvo = 67;

        // passando a função
        int posicao = buscaLinear(numeros, alvo);

        if (posicao != -1){
            System.out.println("Parabéns, o valor " + alvo + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("O alvo não existe na lista de números.");
        }
    }
}
