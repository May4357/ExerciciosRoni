package com.pool.exroni.exroni;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantas horas normais trabalhadas em um ano? ");
    int horasnormais = sc . nextInt();

    System.out.println("Quantas horas extras trabalhadas em um ano?");
    int horasextras= sc . nextInt();
    
    double resultadofinal=(horasnormais*10)+(horasextras*15);

    System.out.println("O seu salário anual é de R$ "+resultadofinal);

    }
}