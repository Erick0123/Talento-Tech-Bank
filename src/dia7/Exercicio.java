package src.dia7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {
    public static void exercicio1() {
        /**
         * Escreva um algoritmo que leia números insira, em um array e após mostre os
         * números informados na tela. Ler somente 5 números.
         */

        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite numero: ");
            numeros.add(sc.nextInt());
        }

        System.out.println(numeros);
        sc.close();
    }

    public static void exercicio2() {
        // Escreva um algoritmo que leia números, insira em um array
        // e após mostre a quantidade de números negativos.
        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite numero: ");
            numeros.add(sc.nextInt());
        }

        int qtdNegativo = 0;
        for (Integer numero : numeros) {
            if (numero < 0) {
                qtdNegativo++;
            }
        }
        System.out.println(qtdNegativo);

        sc.close();
    }

    public static void exercicio3() {
        // Escreva um algoritmo que leia números,
        // insira em um array e após mostre a quantidade de números pares.
        Scanner sc = new Scanner(System.in);

        List<Integer> numero = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite numero: ");
            numero.add(sc.nextInt());
        }
        int qtdPares = 0;
        for (Integer integer : numero) {
            if (integer % 2 == 0) {
                qtdPares++;
            }
        }
        System.out.println(qtdPares);
        sc.close();
    }

    public static void exercicio4() {
        // Escreva um algoritmo que leia números,
        // insira em um array e após mostre o maior valor.

        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o numero: ");
            numeros.add(sc.nextInt());
        }

        int maiorValor = Integer.MIN_VALUE;

        for (Integer integer : numeros) {
            if (integer > maiorValor) {
                maiorValor = integer;
            }
        }
        System.out.println(maiorValor);
        sc.close();

    }

    public static void exercicio5() {
        /*
         * Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara
         * adivinhar uma palavra chutando cada letra em no máximo 10 chutes, caso o
         * usuario acerte a letra o jogo dirá que ele acertou, caso tenha errado, o
         * numero de tentativas vai diminuindo. Caso o numero de tentativas chegue a 0 o
         * usuário perde.
         */

         
    }

    public static void main(String[] args) {
        // exercicio1();
        // exercicio2();
        // exercicio3();
        // exercicio4();
        exercicio5();
    }

}
