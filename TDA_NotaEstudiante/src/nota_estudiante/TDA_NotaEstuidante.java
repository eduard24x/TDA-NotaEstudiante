/*
 * Leer el nombre del estudiante y tres notas, calcular e imprimir la nota promedio

 */
package nota_estudiante;//Paquete

import java.util.Scanner;//Importación de Scanner

public class TDA_NotaEstuidante {//Clase pública Nota_estudiante

    public static void main(String[] args) {//Clase pública
        int uno, dos, tres;//Variables tipo entero
        String nombre;//Variable de tipo Cadena
        
        Scanner nuevo=new Scanner(System.in);//Creación del Scanner
        promedio_notas llama;//Creación del objeto
        
        System.out.println("Introduzca el nombre del estudiante (sin dejar espacio): ");//Mensaje al usuario 
        nombre=nuevo.next();//Leer nombre introducido
        System.out.println("Introduzca la primera nota obtenida por el estudiante:");//Mensaje al usuario
        uno=nuevo.nextInt();//Leer número introducido
        System.out.println("Introduzca la segunda nota obtenida por el estudiante:");//Mensaje al usuario
        dos=nuevo.nextInt();//Leer número introducido
        System.out.println("Introduzca la tercera nota obtenida por el estudiante:");//Mensaje al usuario
        tres=nuevo.nextInt();//Leer número introducido
        
        System.out.println("El nombre del estudiante es: " +nombre);//Mensaje al usuario
        llama=new promedio_notas(uno, dos, tres);//Instanciación del objeto
        llama.promedio(uno, dos, tres);//Llamada al método promedio de la clase promedio_notas
    }//Parentesis que cierra la clase pública
    
}//Parentesis que cierra la clase pública Nota_estudiante
