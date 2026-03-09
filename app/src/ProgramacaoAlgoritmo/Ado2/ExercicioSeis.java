import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * Implementar um programa em Java que calcule quantas paradas para
         * abastecimento
         * são necessárias para realizar uma viagem, a partir da capacidade do tanque de
         * combustível (em litros), do consumo do veículo (km por litros) e da distância
         * da
         * viagem (km).
         */

        System.out.println("Qual a capacidade máxima de litros no tanque do veículo:");
        int capTanque = input.nextInt();

        System.out.println("Qual o consumo do veículo em litros por kilometros:");
        int consumoVeic = input.nextInt();

        System.out.println("Qual a distância da viagem:");
        int distanciaViagem = input.nextInt();

        int litrosPercurso = capTanque * consumoVeic;
        int paradas = (distanciaViagem + litrosPercurso -1) / litrosPercurso;

        System.out.printf("Você precisará fazer %d paradas para abastecer.", paradas);

        input.close();
    }
}
