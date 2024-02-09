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
public class Beecrowd1011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int raio;
        double pi = 3.14159;
        double volume;
        
        raio = scan.nextInt();
        
        volume = (4.0/3) * pi * Math.pow(raio, 3);
        
        System.out.printf("VOLUME = %.3f%n", volume);
        
        
        
    }
}
