package ProgramacaoAlgoritmo.SecundoSemestre;

import javax.swing.*;

public class ModeloMatriz {
    public static void main(String[] args) {

        int quantidadeLojas = 3;
        int quantidadeMeses = 4;
        String[] nomesLojas = new String[quantidadeLojas];
        String[] nomesMeses = {"Janeiro","Fevereiro","Março","Abril"};
        double[][] vendas = new double[quantidadeLojas][quantidadeMeses];

        //Cadastrar os nomes das lojas
        for (int loja=0;loja<quantidadeLojas;loja++){
            String nome = JOptionPane.showInputDialog("Digite o nome da loja "+(loja+1)+": ");
            nomesLojas[loja] = nome;
        }

        for (int loja=0;loja<quantidadeLojas;loja++){
            for (int mes=0;mes<quantidadeMeses;mes++){
                String entrada;
                double valorVenda;
                //Usamos um do...while para repetir a pergunta caso o usuário digite algo inválido
                do {
                    entrada = JOptionPane.showInputDialog("Informe o valor das vendas da "
                            +nomesLojas[loja]+" em "+nomesMeses[mes]+"(R$): ");
                    //Testamos coinverter o texto digitado em um número decimal
                    try {
                        valorVenda = Double.parseDouble(entrada.replace(",","."));
                        if(valorVenda<0){
                            JOptionPane.showMessageDialog(null,"O valor não pode ser negativo! Tente novamente.");
                            valorVenda=-1;//Marcamos como inválido para repetir o do...while
                        }
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Valor inválido! Digite apenas números.");
                        valorVenda=-1;
                    }
                }while (valorVenda<0);

                //Guardamos o valor validado na posição [loja][mes] da matriz
                vendas[loja][mes] = valorVenda;
            }
        }
    }
}
