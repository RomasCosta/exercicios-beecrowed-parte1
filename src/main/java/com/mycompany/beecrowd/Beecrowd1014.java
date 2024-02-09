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
public class Beecrowd1014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int distancia;
        double combustivel, total;
        
        distancia = scan.nextInt();
        combustivel = scan.nextDouble();
        
        total = distancia / combustivel;
        
        System.out.printf("%.3f km/l%n", total);
        
    }
 
}
