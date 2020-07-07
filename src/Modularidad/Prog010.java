/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modularidad;

/**
 *
 * @author USUARIO
 */
public class Prog010 {
    public static int factorial(int numero){
        int fac=1;
        for( int i=1; i<=numero; i++){
            fac *= i;
        }
        System.out.println(fac);
        return fac;
    }
    public static void main(String[] args) {
        factorial(7);
    }
}
