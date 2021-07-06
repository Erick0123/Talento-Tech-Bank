package src.dia2;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        exercicio4();
    }

    public static void exercicio1() {
        /*
         * Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11
         * em uma variável Z. A seguir (utilizando apenas atribuições entre variáveis)
         * troque os seus conteúdos fazendo com que o valor que está em Y passe para Z e
         * vice-versa. Ao final, escrever os valores que ficaram armazenados nas
         * variáveis.
         */
        int y = 99, z = 11, troca = 0;
        System.out.printf("Antes da troca: Y= %d Z= %d ", y, z);

        troca = y;
        y = z;
        z = troca;
        System.out.printf("\nDepois da troca: Y= %d Z= %d ", y, z);
    }

    public static void exercicio2() {
        // Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o
        // seu antecessor.
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver seu antecessor:");
        int numero = sc.nextInt();
        numero -= 1;

        System.out.printf("Seu numero antecessor é: %d", numero);

        sc.close();
    }

    public static void exercicio3() {
        // Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
        // calcular e escrever a área do retângulo.
        Scanner sc = new Scanner(System.in);

        double b, h, a;
        System.out.print("Digite o valor da Base: ");
        b = sc.nextDouble();

        System.out.print("Digite o valor da altura: ");
        h = sc.nextDouble();

        a = b * h;
        System.out.println(" A area do seu triângulo é: " + a);

        sc.close();
    }

    public static void exercicio4() {
        /*
         * Escreva um algoritmo para ler o número total de eleitores de um município, o
         * número de votos brancos, nulos e válidos. Calcular e escrever o percentual
         * que cada um representa em relação ao total de eleitores
         */

        Scanner sc = new Scanner(System.in);

        int votosBrancos, votosNulos, votosValidos, totalEleitores;
        float percentualBrancos, percentualNulos, percentualValidos;

        System.out.println("Digite votos Brancos: ");
        votosBrancos = sc.nextInt();

        System.out.println("Digite votos nulos: ");
        votosNulos = sc.nextInt();

        System.out.println("Digite votos válidos: ");
        votosValidos = sc.nextInt();
        totalEleitores = votosBrancos + votosNulos + votosValidos;

        percentualBrancos = (votosBrancos * 100) / totalEleitores;
        percentualNulos = (votosNulos * 100) / totalEleitores;
        percentualValidos = (votosValidos * 100) / totalEleitores;

        System.out.println("__________________________________");
        System.out.printf("O Percentual de cada um é:\n Brancos: %.2f\n Nulos: %.2f \n Válidos: %.2f \n\n",
                percentualBrancos, percentualNulos, percentualValidos);

        System.out.println("__________________________________");
        System.out.println("Total de eleitores: " + totalEleitores);

        sc.close();
    }

}
