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
public class Beecrowd1017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int horas, velocidade;
        int gasto = 12;
        double litros;
        
        horas = scan.nextInt();
        velocidade = scan.nextInt();
        
        litros = (double) horas * velocidade  / gasto;
        
        System.out.printf("%.3f%n", litros);
    }
}
