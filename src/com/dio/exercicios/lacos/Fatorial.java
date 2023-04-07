package com.dio.exercicios.lacos;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        // Calculando o fatorial de um número

        Scanner novo = new Scanner(System.in);

        int numero = novo.nextInt();
        int fatorial = numero;

        do {
            --fatorial;
            numero = numero*fatorial;

        }while(fatorial!=1);

        System.out.println("O fatorial foi: "+ numero);
    }
}
