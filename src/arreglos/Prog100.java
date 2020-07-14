/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import utils.Leer;

/**
 *
 * @author USUARIO
 */
public class Prog100 {
    public static void inicio(){
        
        System.out.println("Ingrese el tamaño del arreglo: ");
        int n = Leer.entero();
        int[] a = new int[n];
        System.out.println("Ingresar los elementos: ");
        for (int i=0; i<a.length; i++){
            System.out.print("Ingrese el #"+(i+1)+": ");
            a[i]= Leer.entero();
        }
        System.out.println("Los elementos del arreglo son: ");
        for(int i:a){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        inicio();
    }
}
