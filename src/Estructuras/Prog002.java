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
public class Prog002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double importe;
        System.out.println("Digite el importe: ");
        importe = teclado.nextDouble();
        if(importe>4000){
            System.out.println("Categoría D.");
        }
        else if(importe>2000){
            System.out.println("Categoría C.");
        }
        else if(importe>1000){
            System.out.println("Categoría B.");
        }
        else if(importe>=0){
            System.out.println("Categoría A.");
        }
        
        teclado.close();
    }
}
