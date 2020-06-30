/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Preg005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, temp;
        System.out.print("Valor de A: ");
        a = teclado.nextInt();
        System.out.print("Valor de B: ");
        b = teclado.nextInt();
        teclado.close();
        if (a<b){
            temp = a;
            a = b;
            b = temp;
        }
        do{
            System.out.println(a);
            a++;
        }while( a <= b );
    }
}
