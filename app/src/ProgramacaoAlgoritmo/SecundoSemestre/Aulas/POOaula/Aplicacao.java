package ProgramacaoAlgoritmo.SecundoSemestre.Aulas.POOaula;

public class Aplicacao {

    private String nome;
    private int senha;

    // Construtor
    public Aplicacao(String nome) {
        this.nome = nome;
    }

    // Getter and Setter (Pegar e Colocar)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Sobrescreve o toString para definir como o cliente aparece quando convertido em texto.
    @Override
    public String toString() {
        //Retornamos um texto legível, por exemplo: Senha 1 - Ana
        return "Senha " + senha + " - " + nome;
    }
}
