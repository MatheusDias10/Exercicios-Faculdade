package ProgramacaoAlgoritmo.SecundoSemestre.ExerciciosArray2.ExerciciosDois;

import javax.swing.*;

public class Ex4 {

/*
    Em uma farmácia, os medicamentos que chegam de um novo lote precisam ser organizados na prateleira por data de validade, dos que vencem primeiro para os que vencem por último — isso evita que um medicamento próximo do vencimento fique esquecido atrás de outros com validade mais distante.
    Tarefa: implemente um programa em Java que receba uma lista de validades (represente as datas como números inteiros no formato AAAAMMDD, por exemplo 20261203 para 03/12/2026) e utilize o algoritmo Insertion Sort para organizá-las da validade mais próxima para a mais distante. Utilize JOptionPane para cadastrar cada validade e exiba o resultado final ordenado.
*/


    public static void ordenarInsercao(int[] validades){
        int n = validades.length; // armazenando tamanho do vetor

        // consideramos que a primeira validade (indice 0) já forma, sozinha uma parte ordenada
        // por isso começamos no indice 1.

        for (int i = 0; i < n; i++) {
            // Guardamos a validade atual que queremos "inserir" na parte já ordenada.
            int validadeAtual = validades[i];

            // O "j" começa apontando para o eleento imediatamente à esquerda do atual.
            int j = i - 1;

            // Enquanto ainda houver elementos à esquerda (j>=0), e a validade da posição J
            // for maior que a validade atual.
            while (j >= 0 && validades[i] > validadeAtual){
               // deslizamos a validade para a posição a direita em um casa.
               validades[j+1] = validades[j];
               j--;
            }
            validades[j+1] = validadeAtual;
        }
    }

    public static String formatarData(int dataNumerica){
        // Convertemos o números para texto, para podermos "fatiar" os digito
        String textoData = String.valueOf(dataNumerica);

        // Os quatro primeiro catacteres representam o ano (posicao do 0 a 3)
        String ano = textoData.substring(0,4);

        // Os 2 caracteres seguintes representam o mês (do 4 a 5)
        String mes = textoData.substring(4,6);

        // Os dois proximos caracteres representam o dia (posições 6 e 7)
        String dia = textoData.substring(6,8);

        //Montamos e retornamos a data no formato DD/MM/AAAA, mais familiar para a leitura
        return dia + " / "+mes+" / "+ano;
    }

    public static void main(String[] args) {
        // Perguntamos quantos medicamentos chegaram no novo lote
        String textoQuantidade = JOptionPane.showInputDialog(
                "Quantos medicamentos chegaram do novo lote?"
        );
        int quantidade = Integer.parseInt(textoQuantidade);

        // Criando o array que vai armazenar as validades cadastradas
        int[] validades = new int[quantidade];

        for (int i = 0; i < quantidade; i++){
            String textoValidade = JOptionPane.showInputDialog(
                    "Digite a validade do medicamento " + (i+1)+
                            " (formato AAAAMMDD, ex.: 20260915"
            );
            validades[i] = Integer.parseInt(textoValidade);
        }
        ordenarInsercao(validades);
        // Construido um texto unico juntando todas as validades ja ordenadas
        StringBuilder listaOrganizada = new StringBuilder();

        for (int i = 0; i < validades.length; i++) {
            listaOrganizada.append((i+1) + "o. - Validade: " + formatarData(validades[i])+ "\n");
        }
        JOptionPane.showMessageDialog(null,
                "Medicamentos organizados na prateleira (validade mais próxima primeiro: \n\n"+
                        listaOrganizada.toString(),
                "Estoque Organizado por Validade",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
