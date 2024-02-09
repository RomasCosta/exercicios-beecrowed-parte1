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
public class Beecrowd1010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int codigo1, codigo2, numero1, numero2;
        double valor1, valor2, preco1, preco2, total;
        
        codigo1 = scan.nextInt();
        numero1 = scan.nextInt();
        valor1 = scan.nextDouble();
        
        codigo2 = scan.nextInt();
        numero2 = scan.nextInt();
        valor2 = scan.nextDouble();
        
        preco1 = valor1 * numero1;
        preco2 = valor2 * numero2;
        
        total = preco1 + preco2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
          
    }
}
