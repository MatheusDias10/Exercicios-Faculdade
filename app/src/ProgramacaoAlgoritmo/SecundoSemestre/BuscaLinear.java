package ProgramacaoAlgoritmo.SecundoSemestre;

public class BuscaLinear {
    public static int buscaLinear(int[] array, int valorProcurado){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorProcurado){
                return i;
            }
        }

        // Se o loop terminar e nada for encontrado, retornamos -1 com "sentinela -- um valor de ausência"
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {23, 5, 78, 12, 45, 9, 61};
        int alvo = 45;

        int posicao = buscaLinear(numeros, alvo);

        if (posicao != -1){
            System.out.println("Elemento " + alvo + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("Esse elemento não foi encontrado :(");
        }
    }
}
