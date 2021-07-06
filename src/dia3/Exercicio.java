package src.dia3;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        // exercicio1();
        // exercicio2();
        // exercicio3();
        // exercicio4();
        exercicio5();
        // exercicio6();
    }

    public static void validaScannerInt(Scanner sc) {
        if (!sc.hasNextInt()) {
            System.out.println("Só trabalhamos com inteiros, fechando aplicação...");
            sc.close();
            System.exit(1);
        }
    }

    public static void exercicio1() {
        // Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro para saber se é impar ou par: ");

        while (sc.hasNextInt()) {
            if (!sc.hasNextInt()) {
                System.out.println("Valor inválido encerrando aplicação...");
                System.exit(1);
            }
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                System.out.println("É par");
            } else {
                System.out.println("É impar");
            }
            System.out.println("Digite outro inteiro para saber se é impar ou par: ");
            if (!sc.hasNextInt()) {
                System.out.println("Valor inválido encerrando aplicação...");
                System.exit(1);
            }
        }
        sc.close();
    }

    public static void exercicio2() {
        /*
         * Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das
         * seguintes categorias: Infantil A = 5 a 7 anos Infantil B = 8 a 11 anos
         * Juvenil A = 12 a 13 anos Juvenil B = 14 a 17 anos Adultos = Maiores de 18
         * anos
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");

        while (sc.hasNextInt()) {
            if (!sc.hasNextInt()) {
                sc.close();
                System.out.println("Só aceitamos números!!");
            }

            int idade = sc.nextInt();

            if (idade >= 5 && idade <= 7) {
                System.out.println("Infantil A");
            }

            else if (idade >= 8 && idade <= 11) {
                System.out.println("Infantil B");
            } else if (idade >= 12 && idade <= 13) {
                System.out.println("Juvenil A");
            }

            else if (idade >= 14 && idade <= 17) {
                System.out.println("Juvenil B");
            }

            else if (idade >= 18) {
                System.out.println("Adultos");
            } else {
                System.out.println("Você não se enquadra em nenhuma classe!!!");
            }
            System.out.print("Digite uma outra idade: ");
            if (!sc.hasNextInt()) {
                System.out.println("Só aceitamos números, fechando aplicação...");
            }

        }
        sc.close();
    }

    public static void exercicio3() {

        /**
         * Escreva um algoritmo em Java que leia dois números inteiros e determine qual
         * é o menor.Escreva um algoritmo que determina o maior também.
         */
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Digite dois numeros inteiros para determinar qual é o maior é qual é o menor: ");
        System.out.print("primeiro numero: ");
        validaScannerInt(sc);
        x = sc.nextInt();

        System.out.print("Segundo numero: ");
        validaScannerInt(sc);
        y = sc.nextInt();

        if (x < y) {
            System.out.println(x + " é menor que " + y);
        } else if (x > y) {
            System.out.println(x + " é maior que " + y);
        } else {
            System.out.println("Ambos são iguais");
        }
        sc.close();
    }

    public static void exercicio4() {
        /**
         * Construa um algoritmo que leia 10 valores inteiros e positivos e: Encontre o
         * maior valor Encontre o menor valor Calcule a média dos números lidos.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 10 valores inteiro e positivos: ");
        validaScannerInt(sc);
        int numero = sc.nextInt();

        int maiorValor = numero;
        int menorValor = numero;
        int somaValor = 0;

        for (int i = 0; i < 9; i++) {
            somaValor += numero;
            validaScannerInt(sc);
            numero = sc.nextInt();

            if (numero <= menorValor) {
                menorValor = numero;
            }
            if (numero >= maiorValor) {
                maiorValor = numero;
            }
        }
        somaValor += numero;
        double media = somaValor / 3;
        System.out.printf("maior valor: %d \n Menor valor: %d \n Média= %.2f", maiorValor, menorValor, media);

    }

    public static void exercicio5() {
        /**
         * Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações
         * matemáticas (adição, subtração, multiplicação e divisão). Todas as operações
         * serão entre dois valores. No começo do algoritmo pergunte ao usuário qual
         * operação ele deseja fazer e quais são os valores.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual formula deseja usar como operação?");
        System.out.println("   1-adição            2-Subtração\n  3-Multiplicão             / 4-divisão");
        System.out.println("________________________________________");
        int operacao = sc.nextInt();
        double resultado = 0;
        validaScannerInt(sc);

        if (operacao == 1) {
            System.out.println("Você escolheu Adição, digite dois numero: ");
            double num1 = sc.nextInt();
            double num2 = sc.nextInt();
            resultado = num1 + num2;
        } else if (operacao == 2) {
            System.out.println("Você escolheu subtração, digite dois numero: ");
            double num1 = sc.nextInt();
            double num2 = sc.nextInt();
            resultado = num1 - num2;
        } else if (operacao == 3) {

            System.out.println("Você escolheu multiplicação, digite dois numero: ");
            double num1 = sc.nextInt();
            double num2 = sc.nextInt();
            resultado = num1 * num2;
        } else if (operacao == 4) {

            System.out.println("Você escolheu divisão, digite dois numero: ");
            double num1 = sc.nextInt();
            double num2 = sc.nextInt();
            resultado = num1 / num2;
        } else {
            System.out.println("Operação inválida, encerrando aplicação...");
        }

        System.out.printf("Resultado: %.2f", resultado);        
        sc.close();
    }

    public static void exercicio6() {
        /**
         * Faça a implementação do Jogo Pedra, Papel e Tesoura (Jokempô). O algoritmo
         * deverá perguntar qual é a escolha do jogador 1 (Pedra [pe], Papel [pa],
         * Tesoura [t]) e deverá fazer o mesmo para o jogador 2. No final da execução o
         * algoritmo deverá dizer qual é o jogador vencedor ou se houve empate.
         */
    }

}
