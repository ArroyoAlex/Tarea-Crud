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
public class Prog001 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Digite un número: ");
        n = entrada.nextInt();
        
        if(n%2==0){
            System.out.println("El número "+n+" es par.");
        }
        else{
            System.out.println("El número "+n+" es impar.");
        }
        entrada.close();
    }
}
