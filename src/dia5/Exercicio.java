package src.dia5;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        // exercicio1();
        // exercicio2I();
       // exercicio2II();
       exercicio2III();
    }

    public static void exercicio1() {

        /*
         * Dois números são inseridos pelo teclado. Escreva um programa para encontrar o
         * valor de um número elevado à potência de outro. (Não use o método Math.pow
         * integrado Java)
         */

        Scanner sc = new Scanner(System.in);

        int base, potencia, resultado = 1;

        System.out.print("Digite um numero como Base: ");
        base = sc.nextInt();

        System.out.print("\nDigite um numero como potência: ");
        potencia = sc.nextInt();

        for (int i = 1; i <= potencia; i++) {
            resultado *= base;
        }

        System.out.println("Resultado: " + resultado);
    }

    public static void exercicio2I() {
        int linha = 4;
        for (int i = 0; i < linha; i++) {
            System.out.println("********");
        }
    }

    public static void exercicio2II() {
        int linha = 5;
        for (int i = 1; i <= linha; i++) {
            for(int j=1; j<= i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void exercicio2III() {
        int linha = 8;

        for(int i=8; i>=linha; i--){
            System.out.print(" l");
        }
    }
}
