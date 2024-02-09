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
public class Beecrowd1012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double A, B, C;
        double triangulo, circulo, trapezio, quadrado, retangulo;
        
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        
        triangulo = A * C / 2;
        circulo = 3.14159  * Math.pow(C, 2);
        trapezio = ((A + B) * C) / 2;
        quadrado = B * B;
        retangulo = A * B;
        
        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",
                triangulo, circulo, trapezio, quadrado, retangulo);
        
    }
}
