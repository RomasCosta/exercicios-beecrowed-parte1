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
public class Beecrowd1016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int distancia, total;
        int minutos = 2;
        
        distancia = scan.nextInt();
        
        total = distancia * minutos;
        
        System.out.println(total + " minutos");
    }
}
