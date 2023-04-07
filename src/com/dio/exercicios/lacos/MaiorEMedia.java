package com.dio.exercicios.lacos;

import java.util.Arrays;
import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        int numeroDeNotas;
        System.out.println("Digite o número de notas: ");
        numeroDeNotas = valor.nextInt();
        double[] nota = new double[numeroDeNotas];

        for(int i=0;i<nota.length;i++)
        {
            System.out.println("Digite o valor da nota "+(i+1));
            nota[i] = valor.nextDouble();
        }

        System.out.println("A média é: "+ (Arrays.stream(nota).average().getAsDouble()));
        System.out.println("O maior valor é: "+ Arrays.stream(nota).max().getAsDouble());
    }
}
