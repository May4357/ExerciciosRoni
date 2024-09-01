package com.pool.exroni.exroni;
import java.util.Scanner;
public class Exercicio10 {
    public static void resolucao(){

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o tempo em segundos:");
        int segundos= sc.nextInt();

       int hora=segundos/3600;
       int minutos= (segundos%3600)/60;
       int segundosformatado=(segundos%60);

       System.out.println("Hora:"+hora+"\n Minutos:"+minutos+"\n Segundos:"+segundosformatado);
    

    }



}
