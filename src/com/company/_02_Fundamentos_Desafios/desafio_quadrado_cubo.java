package com.company._02_Fundamentos_Desafios;

import java.util.Scanner;

public class desafio_quadrado_cubo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero para ver valor ao quadrado e ao cubo");
        double num = entrada.nextDouble();


        double quadrado = Math.pow(num, 2);  //também funciona num * num
        double cubo = Math.pow(num, 3);     //também funciona num * num * num

        System.out.print("o valor " + num + "\nAo quadrado corresponde a " + quadrado + "\nO valor ao cubo é " + cubo);
        entrada.close();
    }
}