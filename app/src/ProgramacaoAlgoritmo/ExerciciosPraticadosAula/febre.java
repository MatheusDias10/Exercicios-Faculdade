import java.util.Scanner;

public class febre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.println("===PROGRAMA FEBRE===\n");

        System.out.println("Informe sua temperatura:");
        double temperatura = input.nextDouble();

        boolean febre = temperatura >= 37.5;

        System.out.printf("Você está com febre: %s", febre);
        
        input.close();
    }
}
