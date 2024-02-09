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
public class Beecrowd1006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double A, B, C, media;
        
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        
        media = ((A * 2) + (B * 3) + (C * 5)) / 10;
        
        System.out.printf("MEDIA = %.1f%n", media);
    }
}
