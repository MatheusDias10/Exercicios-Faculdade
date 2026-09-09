package ProgramacaoAlgoritmo.SecundoSemestre.ExerciciosArray2;

public class BubbleSort {
        // Metodo que ordena um array de inteiros em ordem crescente
        public static void ordenarBolha(int[] array){
            // "n" guarda o tamanho do array, para não calcular isso várias vezes
            int n = array.length;

            //Loop externo: controla quantas "passagerns" completas faremos pelo array
            for (int passagem = 0; passagem < n-1; passagem++){
                boolean houveTroca = false;
                for (int j=0; j<n-1-passagem; j++){

                    // Comparamops o elemento atual com o vizinho da direita
                    if (array[j] > array[j+1]){

                        // Se o elemento atual for MAIOR que o vizinho, eles estãO fora da ordem
                        // então trocamos os dois de posição
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                        houveTroca = true;
                    }
                }
                // Se percorrermos o array inteiro sem nenhuma troca, significa que ele já está ordenado
                // ou seja, podemos parar mais cedo
                if (!houveTroca){
                    break;
                }
            }

        }

        // Metodo auxiliar apejnas para exibir o array de forma legiviel no console
        public static void imprimirArray(int[] array) {
            for (int valor : array){
                System.out.println(valor + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
        // criando um array de exemplo, fora de ordem
            int[] numeros = {64, 34, 25, 12, 22, 11, 90};

            // Exibimos o array anes da ordenação
            System.out.println("Antes: ");
            imprimirArray(numeros);
            ordenarBolha(numeros);

            System.out.println("Depois: ");
            imprimirArray(numeros);
    }
}

