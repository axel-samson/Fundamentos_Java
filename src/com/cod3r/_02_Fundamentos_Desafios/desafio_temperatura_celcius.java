package com.cod3r._02_Fundamentos_Desafios;

import java.util.Scanner;

public class desafio_temperatura_celcius {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("a temperatira em celsius  ");
        double c = entrada.nextDouble();

        double f = (1.8 * c) + 32;
        double k = (f + 459.67) * 5 / 9;

        //System.out.printf("A temperatura %.2f em Celcius corresponde a %.2f Fahrenheit e %.2f Kelvin ", c, f, k);

        System.out.printf("%.2f Celcius corresponde a: ", c);
        System.out.println();
        System.out.printf("%.2f Fahrenheit ", f);
        System.out.println();
        System.out.printf("%.2f Kelvin ", k);

        entrada.close();
    }
}
