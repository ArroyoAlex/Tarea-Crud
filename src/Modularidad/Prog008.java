
package Modularidad;

public class Prog008 {
    public static void saludo(String nombre){
        System.out.println("Bienvenido "+nombre);
        System.out.println("Disfruta tu estadía en este lugar");
    }
    public static void saludo2(String nombre, String carrera){
        System.out.println("Disfruta tu estadía en la carrera "+carrera);
    }
    public static void factorial(int numero){
        int fac=1;
        for(int i=1; i<=numero; i++){
            fac *= i;
        }
        System.out.println("Factorial de "+numero+" es "+fac);
    }
    public static void main(String[] args) {
        saludo("Daniel");
        saludo2("Juan","Ing.Sistemas");
        factorial(5);
    }
}
