package com.dio.exercicios.lacos;

import java.util.Scanner;

// Exercício gerador de tabuada

public class GeradorDeTabuada {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Digite a tabuada que gostaria de resolver entre 1 e 10: ");
        int tabuada = num.nextInt();

        for(int i=1;i<11;i++){
            System.out.println(tabuada+"x"+i+" = "+i*tabuada);
        }
    }
}
