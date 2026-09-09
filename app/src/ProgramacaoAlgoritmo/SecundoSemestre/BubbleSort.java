package ProgramacaoAlgoritmo.SecundoSemestre;

public class BubbleSort {
    //Método que ordena um array de inteiros em ordem crescente
    public static void ordenarBolha(int[] array){
        //"n" guarda o tamanho do array, para não calcular isso várias vezes
        int n = array.length;

        //Loop externo: controla quantas "passagens" completas faremos pelo array
        for (int passagem=0;passagem<n-1;passagem++){
            boolean houveTroca = false;
            for (int j=0;j<n-1-passagem;j++){
                //Comparamos o elemento atual com o seu vizinho da direita
                if (array[j] > array[j+1]){
                    //Se o elemento atual for MAIOR que o vizinho, eles estão fora da ordem
                    //então trocamos os dois de posição
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    houveTroca=true;
                }
            }
            //Se percorremos o array inteiro sem nenhuma troca,
            //significa que ele já está ordenado - podemos parar mais cedo
            if (!houveTroca){
                break;
            }
        }
    }
    //Método auxiliar apenas para exibir o array de forma legível no console
    public static void imprimirArray(int[] array){
        for (int valor : array){
            System.out.println(valor+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        //criamos um array de exemplo, fora de ordem
        int[] numeros = {64,34,25,12,22,11,90};

        //Exibimos o array antes da ordenação
        System.out.println("Antes: ");
        imprimirArray(numeros);
        ordenarBolha(numeros);
        System.out.println("Depois: ");
        imprimirArray(numeros);
    }
}
