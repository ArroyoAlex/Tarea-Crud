/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import com.sun.org.apache.xpath.internal.operations.Equals;
import utils.Leer;
/**
 *
 * @author USUARIO
 */
public class TareaCRUD {
    public static String[] nombre = new String[1000];
    public static String[] fake = new String[1000];
    public static double[] notaep = new double[1000];
    public static double[] notapp = new double[1000];
    public static double[] notapl = new double[1000];
    public static double[] notaef = new double[1000];
    public static double[] notata = new double[1000];
    public static double[] notapromedio = new double[1000];
    public static int posicion = -1;
    
    public static void agregar(){
        String r, continuar;
        
        do{
            posicion++;
            System.out.println("Agregar Alumno: ");
            System.out.print("Nombre: ");
            fake[posicion] = Leer.cadena();
            nombre[posicion] = Leer.cadena();
            System.out.print("Examen Parcial: ");
            notaep[posicion] = Leer.decimal();
            System.out.print("Promedio de prácticas: ");
            notapp[posicion] = Leer.decimal();    
            System.out.print("Promedio de laboratorio: ");
            notapl[posicion] = Leer.decimal();
            System.out.print("Examen Final: ");
            notaef[posicion] = Leer.decimal();    
            System.out.println("¿Desea agregar otro?(S/N): ");
            r = Leer.cadena();//
            continuar = Leer.cadena();
            
        }while(continuar.equalsIgnoreCase("S"));
        
    }
    public static void eliminar(){
        String continuar;
        do {
                listar();
                System.out.print("Ingrese el numero del alumno a eliminar: ");
                int numero = Leer.entero();
                numero--;
                for (int i = numero; i < posicion; i++) {
                    nombre[i] = nombre[i + 1];
                    notaep[i] = notaep[i + 1];
                    notapp[i] = notapp[i + 1];
                    notapl[i] = notapl[i + 1];
                    notaef[i] = notaef[i + 1];
                    notapromedio[i] = notapromedio[i + 1];
                }
                nombre[posicion] = "";
                notaep[posicion] = 0;
                notapp[posicion] = 0;
                notapl[posicion] = 0;
                notaef[posicion] = 0;
                notapromedio[posicion] = 0;
                posicion--;
                System.out.println("¿Deseas Eliminar otro [S/N]?");
                continuar = Leer.cadena();
      } while (continuar.equalsIgnoreCase("S"));
    }
    public static void editar(){
        String continuar;
        do {
                listar();
                System.out.println("Ingrese el numero del alumno a editar: ");
                int numero = Leer.entero();
                numero--;
                System.out.println("Resultado: "+nombre[numero]+"\tExamen parcial: "+notaep[numero]+"\tPromedio de prácticas: "+notapp[numero]+"\tPromdeio de Laboratorio: "+notapl[numero]+"\tExamen final: "+notaef[numero]);
                System.out.print("Nuevo Nombre: ");
                nombre[numero] = Leer.cadena();
                System.out.print("Nuevo Examen Parcial: ");
                notaep[numero] = Leer.decimal();
                System.out.print("Nuevo Promedio de Prácticas: ");
                notapp[numero] = Leer.decimal();
                System.out.print("Nuevo Promedio de laboratorio: ");
                notapl[numero] = Leer.decimal();
                System.out.print("Nuevo Examen final: ");
                notaef[numero] = Leer.decimal();
                System.out.print("¿Deseas agregar otro [S/N]?");
                continuar = Leer.cadena();
      } while (continuar.equalsIgnoreCase("S"));

    }
    public static void listar(){
        for (int i=0; i<=posicion; i++){
            notapromedio[i] = notaep[i]*0.25 + notapp[i]*0.2 + notapl[i]*0.2 + notaef[i]*0.25;
        }
        System.out.println("Listado");
        System.out.println("Nº\tNombre\tExamenParcial\tPromedio de Prácticas\tPromedio de Laboratorio\t Examen Final\tPromedio Final");
        for (int i=0; i<=posicion; i++){
            System.out.println((i+1)+"\t"+nombre[i]+"\t"+notaep[i]+"\t\t"+notapp[i]+"\t\t\t"+notapl[i]+"\t\t\t "+notaef[i]+"\t\t"+notapromedio[i]);
        }
    }
    public static void salir(){
        System.out.println("Gracias por su visita.");
    }
    public static void error(){
        System.out.println("Error, opción incorrecta.");
    }
    public static void menu(){
        System.out.println("Bienvenido al Sistema de notas de los alumnos\nMenú de opciones:"
                + "\n1. Agregar Alumno"
                + "\n2. Eliminar Alumno"
                + "\n3. Editar Alumno"
                + "\n4. Listar "
                + "\n5. Salir."
                + "\n Ingrese una opcion: ");
    }
    public static void inicio(){
        int op;
        do{
            menu();
            op = Leer.entero();
            switch(op){
                case 1: agregar();
                break;
                case 2: eliminar();
                break;
                case 3: editar();
                break;
                case 4: listar();
                break;
                case 5: salir();
                break;
                default: error();
            }
        }while(op!=5);
        
    }
    public static void main(String[] args) {
        inicio();
    }
}
