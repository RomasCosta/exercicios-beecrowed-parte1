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
public class Beecrowd1005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double A, B, media;
        
        A = scan.nextDouble();
        B = scan.nextDouble();
        
        media = (A * 3.5 + B * 7.5) / 11; //o cálculo executado nessa operação é de média ponderada.
        
        System.out.printf("MEDIA = %.5f%n", media);
        
      
    }
}
