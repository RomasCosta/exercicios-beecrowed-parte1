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
public class Beecrowd1013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int A, B, C, maior;
        
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        
        maior = A;
        
        if(B > maior) maior = B;
        if(C > maior) maior = C;
        
        System.out.println(maior + " eh o maior");

    }
}
