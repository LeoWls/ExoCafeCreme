package com.exodevoir;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("pièces jaunes de 1 centimes ?");
        int centimes1 = scanner.nextInt();

        System.out.println("pièces jaunes de 5 centimes ?");
        int centimes5 = scanner.nextInt();

        System.out.println("pièces jaunes de 10 centimes ?");
        int centimes10 = scanner.nextInt();

        System.out.println("pièces jaunes de 20 centimes ?");
        int centimes20 = scanner.nextInt();

        System.out.println("pièces jaunes de 50 centimes ?");
        int centimes50 = scanner.nextInt();


        int centimesTotal = centimes1 + (centimes5 * 5) + (centimes10 * 10) + (centimes20 * 20) + (centimes50 * 50);
        int differences = 100 - centimesTotal;


        if (differences == 0) {
            System.out.println("Vous avez exactement de quoi vous payer le café !");
        } 
        
        else if (differences > 0) {
            System.out.println("Il vous manque " + differences + " centimes pour prendre un café.");
        } 
        
        else {
            System.out.println("Il vous restera " + (-differences) + " centimes après avoir pris votre café !");
        }



    }
}
