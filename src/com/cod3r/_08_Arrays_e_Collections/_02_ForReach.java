package com.cod3r._08_Arrays_e_Collections;

public class _02_ForReach {
    public static void main(String[] args) {
        double[] notas = {9.9, 8.7, 7.2, 9.4};


        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();

        for (double nota : notas) {
            System.out.print(nota + " ");

        }
    }
}
