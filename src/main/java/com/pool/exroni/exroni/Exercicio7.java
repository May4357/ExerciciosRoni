package com.pool.exroni.exroni;

import java.util.Scanner;


public class Exercicio7 {
   
    public static void resolucao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int dividendo=sc.nextInt();

        System.out.println("Digite mais um número ");
        int divisor= sc .nextInt();

        System.out.println("O Quociente da divisão é " +dividendo/divisor);
        System.out.println("E o resto da divisão é "+ dividendo%divisor);

    }
}
