package ProgramacaoAlgoritmo.SecundoSemestre;

import javax.swing.*;

public class Estacionamento {
    public static void main(String[] args) {
        int[][] estacionamento = new int[5][6];
        int vagasLivres=0;
        int vagasOcupadas=0;

        //Lendo a situação das vagas
        for (int i=0;i<5;i++){
            for (int j=0;j<6;j++){
                estacionamento[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Vaga - Linha "+(i+1)
                                +", Coluna "+(j+1)
                                +"\n\nDigite: "
                                +"0 - Vaga Livre\n"
                                +"1 - Vaga Ocupada"
                ));
                if (estacionamento[i][j] == 0){
                    vagasLivres++;
                } else if (estacionamento[i][j] == 1) {
                    vagasOcupadas++;
                }
            }
        }
        //Exibindo o mapa
        String resultado = "MAPA DO ESTACIONAMENTO\n\n";
        for (int i=0;i<5;i++) {
            for (int j = 0; j < 6; j++) {
                resultado += estacionamento[i][j]+"  ";
            }
            resultado += "\n";
        }
        //Calculando porcentagem
        double porcentagemOcupacao = (vagasOcupadas *100.0)/30;

        resultado +="\n--------------------------------------\n";
        resultado +="Vagas livres: "+vagasLivres+"\n";
        resultado +="Vagas ocupadas: "+vagasOcupadas+"\n";
        resultado +="Porcentagem de ocupação: "+porcentagemOcupacao+"%";
        JOptionPane.showMessageDialog(null,resultado);
        //Consultando uma vaga
        int linha = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a linha da vaga que deseja consultar (1 a 5): "
        ));
        int coluna = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a coluna da vaga que deseja consultar (1 a 6): "
        ));
        linha = linha-1;
        coluna = coluna-1;
        if (estacionamento[linha][coluna] == 0){
            JOptionPane.showMessageDialog(null,"A vaga está LIVRE.");
        } else if (estacionamento[linha][coluna] == 1) {
            JOptionPane.showMessageDialog(null,"A vaga está OCUPADA.");
        }
    }
}