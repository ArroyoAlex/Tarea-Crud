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
public class Prog003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("***Manejo de Cadenas***");
        System.out.print("Leer cadena con nextline(): ");
        cadena = teclado.nextLine();
        System.out.println("Valor incial ingresado:"+cadena);
        System.out.println("Mayúscula con toUpperCase(): "+cadena.toUpperCase());
        System.out.println("Minúscula con toLowerCase(): "+cadena.toLowerCase());
        System.out.println("Elimina espacios con trim: "+cadena.trim());
        System.out.println("Subcadena con substring(int): "+cadena.substring(2));
        System.out.println("Subcadena con substring(int,int): "+cadena.substring(5, 10));
        System.out.println("Tamaño de cadena: "+cadena.length());
        System.out.println("Valor incial ingresado: "+cadena);
        System.out.println("Extraer Letra con charAt(int): "+cadena.charAt(0));
    }
}
