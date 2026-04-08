package ProgramacaoAlgoritmo.ExerciciosPraticadosAula;

import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        /*
        Aprendendo vetor/array.

        vetor ou array é basicamente o processo de você armazenar valorES dentro de uma variável.
        Cada valor dentro do vetor tem sua posição específica, começando no 0 e indo em sequência.

        Se um array tiver três valores, sendo [1, 2, 3], na lógica o array tem 3 posições, porém a ultima posição
        é o número 2, pois sempre começa a contagem no 0.

        A partir do momento em que um vetor é criado não é possível aidicionar mais nenhum valor nele e nem remover.

        Assim que um vetor é criado temos que declarar o valor dele, ou seja, a quantidade de valores serão
        correspondentes às posições.

        A maneira mais comum para você tentar adicionar mais valor a um vetor é você criar outro vetor e neste outro
        vetor, copiar os valores do vetor antigo e adicionar os novos, logo depois declarar o valor deste novo vetor.



        */

        // Criação de um vetor
        int [] a = {1, 2, 3, 4, 5};
        System.out.println( a[2] + a[4] + "\n" );

        /*
        Nesse caso eu acesso a posição 2 dentro do vetor, que é 3, e logo em seguida eu somo com a posição 4,
        que é o valor 5. (Lembrando que são estes valores pois a posição começa no 0.).
        */

        int [] nums = new int[3];
        nums[0] = 15;
        nums[1] = 10;
        nums[2] = 5;

        // Esse valor não será atrelado ao vetor pois a posição 3 no vetor não existe.
        // nums[3] = 200;

        // Aqui acessamos o valor 5 do vetor nomeado nums.
        System.out.println(nums[2] + "\n");

        //Nesse caso vai dar erro pois a posição três não existe.
        //System.out.println(nums[3]);

        // Aqui eu altero os valores dentro de cada posição do vetor. Lembrando, posos alterar, não remover nem add.
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 10;

        // cria vetor pelo tamanho
        int num = 10;
        int [] vetor = new int[num];
        // Aqui eu crio um vetor pelo tamanho de outra variável.


        // Iterando sobre os valores do vetor.
        int [] vetorDois = {15, 40, 50};

        for (int posicao = 0; posicao < vetorDois.length; posicao++) {
            System.out.println(vetorDois[posicao]);
        }

        System.out.println(); // quebra linha

        // Agora iterando como o FOREACH
        for (int item : vetorDois) {
            System.out.println(item);
        }

        System.out.println(); // quebra linha

        // vetor com String
        String [] vetorString = new String[3];
        vetorString[0] = "Matheus";
        vetorString[1] = "Pietro";
        vetorString[2] = "Lucas";

        for (String valor : vetorString) {
            System.out.println(valor);
        }

        System.out.println(); // quebra linha

        // Exercicio: Calcular a média de uma quantidade de notas usando vetor.

        System.out.println("Informe a quantidade de notas:");
        int qtd = input.nextInt();

        int [] notas = new int[qtd];

        for (int pos = 0; pos < notas.length; pos++) {
            System.out.println("Digite a nota do aluno:");
            int notaAluno = input.nextInt();

            notas[pos] = notaAluno;
        }

        // soma as posições do vetor
        double soma = 0;
        for (double item : notas) {
            soma += item;
        }

        // divide pela qtd
        double media = soma / notas.length;

        System.out.println(media);

    }
}
