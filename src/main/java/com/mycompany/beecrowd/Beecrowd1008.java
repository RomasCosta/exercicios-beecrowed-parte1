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
public class Beecrowd1008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero, horas;
        double valor, salario;
        
        numero = scan.nextInt();
        horas = scan.nextInt();
        valor = scan.nextDouble();
        
        salario = horas * valor;
        
        System.out.printf("NUMBER = %s%nSALARY = U$ %.2f%n", numero, salario);
    }
}
