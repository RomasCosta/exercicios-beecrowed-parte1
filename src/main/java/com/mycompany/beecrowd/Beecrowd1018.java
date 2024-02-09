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
public class Beecrowd1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int entrada, quociente, resto, nota;
        
        entrada = scan.nextInt();
        System.out.println(entrada);
        
        resto = entrada;
        
        nota = 100;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;
        
        nota = 50;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;
        
        nota = 20;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;
        
        nota = 10;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;
        
        nota = 5;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;
        
        nota = 2;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;
        
        System.out.println(resto + " nota(s) de R$ 1,00");
             
    }
}
