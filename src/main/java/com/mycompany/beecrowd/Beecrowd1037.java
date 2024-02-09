/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beecrowd;

import java.util.Scanner;

/**
 *
 * @author romar
 */
public class Beecrowd1037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double intervalo;
        
        intervalo = scan.nextDouble();
        //System.out.println(intervalo);
        
        if(intervalo >=0.0 && intervalo <= 25.0) {
            System.out.println("Intervalo [0,25]");
        }   
        else if (intervalo > 25.0 && intervalo <= 50.0)  {
            System.out.println("Intervalo (25,50]");
        }
        else if (intervalo > 50.0 && intervalo <= 75.0) {
            System.out.println("Intervalo (50,75]");
        }
        else if (intervalo > 75.0 && intervalo <= 100.0) {
            System.out.println("Intervalo (75,100]");
        }
        
        else {
            System.out.println("Fora de intervalo");
        }
    }
}
