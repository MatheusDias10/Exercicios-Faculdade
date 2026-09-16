package ProgramacaoAlgoritmo.SecundoSemestre.ExerciciosArray2.ExerciciosDois;

public class Ex1 {
/*  Uma clínica popular distribui senhas numéricas para atendimento, mas por conta de uma falha no sistema, as senhas
    foram impressas fora de ordem. Antes de chamar os pacientes, a recepcionista precisa reorganizar a lista de senhas
    em ordem crescente,para que o atendimento siga a ordem correta de chegada.
    Tarefa: implemente um programa em Java que receba um array de senhas (números inteiros) e utilize o algoritmo
     Bubble Sort para reorganizá-las em ordem crescente. Ao final, exiba a lista de senhas na ordem correta em que os
     pacientes devem ser chamados.*/

    public static void OrdernarLista(int[] array){

        int n = array.length; /*guardando tamanho array*/

        //Loop externo: controla quantas "passagens" completas faremos pelo array
        for (int passagem = 0; passagem < n-1; passagem++) {
            boolean houveTroca = false;

            //Comparamos o elemento atual com o seu vizinho da direita
            for (int j = 0; j < n-1; passagem++) {
                if(array[j] > array[j+1]){
                    /*Se o elemento atual for MAIOR que o vizinho, eles estão fora da ordem
                    então trocamos os dois de posição. Isso serve para deixarmos na ordem
                    do menor para o maior.*/
                    int temp = array[j]; /*captura o valor que está no array posicao J*/

                    array[j] = array[j+1];/* transformando o valor da posicao J para o mesmo valor da posicao na direita*/

                    array[j+1] = temp;
                    houveTroca = true; /*Se a troca de valores funcionou corretamete é true*/
                }
            }
            //Se percorremos o array inteiro sem nenhuma troca,
            //significa que ele já está ordenado - podemos parar mais cedo
            if (!houveTroca) {
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

    public static void main(String[] args) {
        //criamos um array de exemplo, fora de ordem
        int[] numeros = {6, 6, 25, 12, 122, 71, 10};

        //Exibimos o array antes da ordenação
        System.out.println("Antes: ");
        imprimirArray(numeros);
        OrdernarLista(numeros);
        System.out.println("Depois: ");
        imprimirArray(numeros);
    }
}
