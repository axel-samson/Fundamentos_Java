package com.cod3r._01_Fundamentos;


import java.util.Date;

public class _07_import {

    public static void main(String[] args) {
        String b = "Boa tarde";
        System.out.println(b);

        String s = "Bom dia";
        System.out.println(s);

        /*Dentro do IntelliJ, o import
        é automático quando você seleciona
        exemplo, import do Date, ele aponta
        no início do código como mostrado no
        após o anúncio de pacote*/

        Date d = new Date();
        System.out.println(d);

    }
}
