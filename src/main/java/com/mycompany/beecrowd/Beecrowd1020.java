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
public class Beecrowd1020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N, resto, ano, mes, dia;
        
        N = scan.nextInt();
        
        ano = N / 365;
        System.out.println(ano + " ano(s)");
        resto = N % 365;
        
        mes = resto / 30;
        System.out.println(mes + " mes(es)");
        resto = resto % 30;
        
        System.out.println(resto + " dia(s)");
    }
}
