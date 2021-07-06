package src.dia6;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        //exercicio1();
        //exercicio2();
    }

    public static void exercicio1() {
        // Dado um array com 20 números, imprima seus valores de trás para frente.
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int tamanho = sc.nextInt();
        int[] numero = new int[tamanho];
        for(int i=numero.length ; i>=0;i--){
            System.out.print(i +", ");
        }
        sc.close();
    }

    public static void exercicio2() {
       
        
    }

}
