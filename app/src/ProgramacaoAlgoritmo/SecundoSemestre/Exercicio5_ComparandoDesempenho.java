package ProgramacaoAlgoritmo.SecundoSemestre;

import javax.swing.*;

public class Exercicio5_ComparandoDesempenho {
    public static int[] buscarLinearComContador(int[] array, int valor){
        int comparacoes = 0;
        //Percorremos o array do início até o fim
        for (int i=0;i< array.length;i++){
            comparacoes++;
            if (array[i] == valor){
                //Encontramos! Retornamos a posição e o total de comparações até aqui
                return new int[] {i,comparacoes};
            }
        }
        return new int[] {-1,comparacoes};
    }

    public static int[] buscarBinariaComContador(int[] array, int valor){
        int comparacoes = 0;
        int inicio = 0;
        int fim = array.length-1;
        while (inicio <= fim){
            //Calculamos o índice do meio do intervalo atual
            int meio = inicio + (fim-inicio)/2;
            comparacoes++;
            //Verificamos se o valor do meio é o valor procurado
            if(array[meio] == valor){
                return new int[] {meio,comparacoes};
            }
            if (valor > array[meio]){
                inicio = meio +1;
            }else {
                fim = meio - 1;
            }
        }
        return new int[] {-1,comparacoes};
    }

    public static void main(String[] args) {
        String textoTamanho = JOptionPane.showInputDialog("" +
                "Quantos elementos o array de teste deve ter? ");
        int tamanho = Integer.parseInt(textoTamanho);
        int[] arrayOrdenado = new int[tamanho];
        for (int i=0;i<tamanho;i++){
            arrayOrdenado[i] = i * 2;
        }
        //Perguntamos para o usuário qual valor que ele quer buscar no array gerado
        String textoValorProcurado = JOptionPane.showInputDialog(
                "Digite um valor par para buscar no array: "+((tamanho - 1)*2)+" ):"
        );

        int valorProcurado = Integer.parseInt(textoValorProcurado);
        //Executamos a busca linear com contador de comparações
        int[] resultadoLinear = buscarLinearComContador(arrayOrdenado,valorProcurado);
        int[] resultadoBinaria = buscarBinariaComContador(arrayOrdenado,valorProcurado);

        //Montamos a mensagem comparando os dois resultados lado a lado
        String mensagem = "Array com "+tamanho+" elementos...\n\n"+
                "Busca Linear:\n"+
                "Posição encontrada: "+resultadoLinear[0]+"\n"+
                "Comparações realizadas: "+resultadoLinear[1]+"\n\n"+
                "Busca binária: \n"+
                "Posição encontrada: "+resultadoBinaria[0]+"\n"+
                "Comparações realizadas: "+resultadoBinaria[1]+"\n\n";

        //Exibimos o comparativo completo em uma única caixa de mensagem
        JOptionPane.showMessageDialog(
                null,mensagem,"Comparação de Desempenho",JOptionPane.INFORMATION_MESSAGE
        );

        System.exit(0);

    }
}