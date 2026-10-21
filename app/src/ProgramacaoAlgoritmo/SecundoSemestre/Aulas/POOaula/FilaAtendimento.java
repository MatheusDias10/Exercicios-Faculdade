package ProgramacaoAlgoritmo.SecundoSemestre.Aulas.POOaula;
package Aplicacao;

public class FilaAtendimento {
    private Cliente[] elementos;
    private int quantidade;

    public FilaAtendimento(int capacidade) {
        // Regra do TAD (Tipos Abstratoos de Dados) uma fila precisa comportar pelo menos 1 cliente.
        if (capacidade <= 0){
            // Lançamos uma exception para impedir a criação de uma fila inválida.
            throw new IllegalArgumentException("A capacidade deve ser maior que zero.");
        }

        this.elementos = new Cliente[capacidade];
        // A fila começa vazia
        this.quantidade = 0;
    }

    public boolean estaVazia(){
        return quantidade == 0;
    }

    public boolean estaCheia(){
        return quantidade == elementos.length;
    }

    public int tamanho(){
        return quantidade;
    }

    public Cliente primeiro(){
        // Pré-Condição: se a fila estiver vazia, não há ninguém para consultar.
        if (estaVazia()){
            return null;
        }
        return elementos[0];
    }

    public boolean enfileirar(Cliente cliente) {
        if (estaCheia()) {
            return false;
        }
        elementos[quantidade] = cliente;
        quantidade ++;
        return true;
    }

    public boolean desinfileirar(){
        if (estaVazia()){
            return null;
        }
        Cliente removido = elementos[0];

        // metodo para assim que remover o cliente, os outros clientes irem uma posição para frente.
        for (int i = 0; i < quantidade-1; i++){
            elementos[i] = elementos[i+1];
        }
    }
}

