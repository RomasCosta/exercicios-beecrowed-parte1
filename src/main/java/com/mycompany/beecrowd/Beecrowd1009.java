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
public class Beecrowd1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String vendedor;
        double salario, vendas, total;
        
        vendedor = scan.nextLine();
        salario = scan.nextDouble();
        vendas = scan.nextDouble();
        
        total = (vendas * 0.15) + salario;
        
        System.out.printf("TOTAL = R$ %.2f%n", total);
        
    }
}
