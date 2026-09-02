package ProgramacaoAlgoritmo.SecundoSemestre;

public class BuscaBinario {
    public static int buscaBinaria(int[] array, int valorProcurado){
        int inicio = 0;
        int fim = array.length-1;

        //Repetimos enquanto o [inicio, fim] ainda for válido.
        while (inicio <= fim){
            // Calculamos o índice central do intervalo
            int meio = inicio + (fim - inicio) / 2;

            // Caso encontramos o valor no meio
            if (array[meio] == valorProcurado){
                return meio;
            }
            // Se o valor que procuramos é maior, ele está na metade direita
            if (valorProcurado > array[meio]){
                inicio = meio + 1;
            } else { // Se o valor é menor:
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {5, 9, 12, 23, 45, 61, 78};
        int alvo = 45;
        int posicao = buscaBinaria(numeros, alvo);

        if (posicao != -1){
            System.out.println("Elemento: " + alvo + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("Elemento não encontrado :(");

        }    }
}
