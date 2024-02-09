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
public class Beecrowd1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double pi = 3.14159; 
        double raio = scan.nextDouble();
        double area = pi * (Math.pow(raio, 2));
        
        System.out.printf("A=%.4f%n", area);
    }
}
