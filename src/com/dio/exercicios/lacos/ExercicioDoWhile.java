package com.dio.exercicios.lacos;

import java.util.Scanner;

public class ExercicioDoWhile {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        double nota;
        do {
            System.out.println("Digite uma nota válida 'Entre 0 e 10': ");
            nota = numero.nextDouble();

        } while (nota > 10 | nota < 0);

        System.out.println("Sua nota válida foi: " + nota);

    }
}
