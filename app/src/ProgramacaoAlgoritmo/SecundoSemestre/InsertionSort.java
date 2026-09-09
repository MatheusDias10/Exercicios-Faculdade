package ProgramacaoAlgoritmo.SecundoSemestre;

public class InsertionSort {
    //Método que ordena um array de inteiros em ordem crescente
    public static void ordenarInsercao(int[] array){
        int n = array.length;

        for (int i=1;i<n;i++){
            int atual = array[i];
            int j = i-1;
            //Enquanto ainda houver elementos à esquerda(j>=0)
            //E o elemento da posição j for MAIOR que o valor que queremos inserir
            while (j>=0 && array[i] > atual){
                array[j+1] = array[j];
                j--;
            }
            //quando o loop while termina, encontramos a posição correta
            //(j+1) para inserir o valor que estava guardado em "atual"
            array[j+1] = atual;
        }
    }

    public static void imprimirArray(int[] array){
        //Percorremos cada elemento do array
        for (int valor : array){
            System.out.println(valor+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] numeros = {12,13,11,5,6};
        System.out.println("Antes: ");
        imprimirArray(numeros);
        ordenarInsercao(numeros);
        System.out.println("Depois: ");
        imprimirArray(numeros);
    }
}
