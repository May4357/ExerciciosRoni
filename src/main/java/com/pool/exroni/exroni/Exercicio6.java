package com.pool.exroni.exroni;
 import java.util.Scanner;
public class Exercicio6 {
   
    public static void resolucao(){
        Scanner sc = new Scanner(System.in);

        double celsius;
        double fahrenheint;

        System.out.println("Escreva os graus em Celsius: ");
        celsius = sc.nextDouble();

        fahrenheint = celsius * 1.8 + 32;

        
        System.out.printf("Em Farenheint: %.2f ", fahrenheint);




        sc.close();

    }
}


