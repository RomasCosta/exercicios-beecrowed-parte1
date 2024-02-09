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
public class Beecrowd1019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N, resto, hora, minuto, segundo;
        
        N = scan.nextInt();
        
        hora = N / 3600;
        resto = N % 3600;
        
        minuto = resto / 60;
        resto = resto % 60;
        
        segundo = resto;
        
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }
}
