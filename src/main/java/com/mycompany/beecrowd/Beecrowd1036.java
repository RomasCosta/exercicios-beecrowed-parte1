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
public class Beecrowd1036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double A, B, C, DELTA, RAIZ, R1, R2;
        
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        
        DELTA = Math.pow(B, 2) - 4 * A * C;
        RAIZ = Math.sqrt(DELTA);
       
        if(DELTA < 0.0  || A <= 0.0) {
            System.out.println("Impossivel calcular");
        } else {
        
            R1 = (- B + RAIZ) / (2 * A);
            System.out.printf("VALOR DE R1 = %.5f%n" , R1);

            R2 = (- B - RAIZ) / (2 * A);
            System.out.printf("VALOR DE R2 = %.5f%n" , R2);
        }
    }
}
