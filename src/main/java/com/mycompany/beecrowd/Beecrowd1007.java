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
public class Beecrowd1007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int A, B, C, D, diferenca; 
        
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();
        
        
        diferenca = (A * B - C * D);
        
        System.out.println("DIFERENCA = " + diferenca);
    }
}
