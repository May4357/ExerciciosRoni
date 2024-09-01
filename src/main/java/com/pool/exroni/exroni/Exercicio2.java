package com.pool.exroni.exroni;
import java.util.Scanner;
public class Exercicio2 {
    public static void resolucao(){

        int n;

        System.out.println("Digite um valor :");
        Scanner sc= new Scanner (System.in);
        n=sc.nextInt();

        System.out.println("O antecessor de "+n+ " é "+(n-1)+" O seu sucessor é "+(n+1)+".");
        

    }
}