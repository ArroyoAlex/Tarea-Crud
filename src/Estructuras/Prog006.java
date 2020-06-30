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
public class Prog006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int S=0, N;
        System.out.print("N: ");
        N = teclado.nextInt();
        for (int i=1; i<=N; i++){
            S = S+i;
        }
        System.out.println("S = "+S);
        teclado.close();
    }
}
