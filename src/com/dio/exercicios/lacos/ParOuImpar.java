package com.dio.exercicios.lacos;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtNumerica,par=0,impar=0;
        System.out.println("Digite a quantidade de números a ser inserida: ");
        qtNumerica = entrada.nextInt();
        int[] numeros = new int[qtNumerica];

        for(int i=0;i<numeros.length;i++) {

            System.out.println("Digite o número "+(i+1));
            numeros[i]= entrada.nextInt();

            if (numeros[i] % 2 == 0){
                par++;
                System.out.println("O número " + numeros[i] + " é par.");
            }

            else {
                impar++;
                System.out.println("O número " + numeros[i] + " é ímpar.");
            }
        }

        System.out.println("A quantidade de pares digitada foi: "+ par);
        System.out.println("A quantidade de ímpares digitada foi: "+ impar);
    }
}
