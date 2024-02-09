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
public class Beecrowd1004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int valor1, valor2, PROD;
        
        valor1 = scan.nextInt();
        valor2 = scan.nextInt();
        
        PROD = valor1 * valor2;
        
        System.out.println("PROD = " + PROD);
    }
}
