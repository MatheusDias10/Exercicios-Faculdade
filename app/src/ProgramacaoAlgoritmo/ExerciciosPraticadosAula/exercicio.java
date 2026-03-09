import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quem foi o diretor de Django Livre:");
        String resposta = input.nextLine();

        boolean respostaPergunta = resposta.equalsIgnoreCase("Quentin Tarantino") || resposta.equalsIgnoreCase("Tarantino");

        System.out.printf("Resposta correta: %s", respostaPergunta);

        input.close();
    }
    
}
