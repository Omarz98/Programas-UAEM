/*
Universidad Autónoma del Estado de México
Centro Universitario UAEM Zumpango
Ingeniería en Computación
UA Algoritmos Genéticos 2019-A
Alumno(s): 
Omar Zamora Ramon
Profesor: Dr. Asdrúbal López Chau
Descripción:
Laboratorio 103, encontrar la contraseña

Fecha: 
*/
package laboratorio03;

import java.util.Date;
import java.util.Random;

public class pass {
    
    private static final String geneSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!¡., ";
    private static final String objetivo = "¡Hola Mundo!";
    private static final Random aleatorio = new Random();
    //funcion generar padre
    private static String generarPadre(int logitud) {       
        StringBuilder genes = new StringBuilder();
        for (int i = 0; i < logitud; i++) {
            genes.append(geneSet.charAt(aleatorio.nextInt(geneSet.length())));
        }
        return genes.toString();
    }
    
    private static int obtener_aptitud(String conjetura){
        char[] conjetura_array = conjetura.toCharArray();
        char[] target_array = objetivo.toCharArray();
        int contador = 0;
        for(int i = 0; i < target_array.length; i++) {
            if (conjetura_array[i] == target_array[i]) {
                contador++;
            }
        }
        return contador;       
    }
    
    private static String mutar(String padre){       
        char[] guess_array = padre.toCharArray();
        char[] target_array = objetivo.toCharArray();
        for(int i = 0; i < target_array.length; i++) {
            if (guess_array[i] != target_array[i]) {
                char gene = geneSet.charAt(aleatorio.nextInt(geneSet.length()));
                //¿Es el nuevo gen el mismo que estaba en esa posición?
                //Reemplace el gen seleccionado si es el mismo que se supone que debe reemplazar, lo que puede evitar un número significativo de conjeturas desperdiciadas.
                while (gene != guess_array[i]){
                    guess_array[i] = gene;
                }               
            }
        }
   
        return String.valueOf(guess_array);
   
    }
    
    private static void mostrar(String guess, Date startTime) {
        Date time = new Date();
        System.out.println(String.format("Conjetura: " + guess+ ", Aptitud: " + obtener_aptitud(guess) + ", Tiempo: " + (time.getTime() - startTime.getTime()) + " milisegundos" ));       
    }
    
    public static void main(String[] args) {   
     
        pass contra = new pass();
   
        //Generamos
        aleatorio.setSeed(12345);
        Date tiempo = new Date();
        String mejorPadre = contra.generarPadre(objetivo.length());
        int mejorConjetura = contra.obtener_aptitud(mejorPadre);
        contra.mostrar(mejorPadre, tiempo);
   
        while (true) {
            String hijo = contra.mutar(mejorPadre);
            int mejorHijo = contra.obtener_aptitud(hijo);
            if (mejorConjetura >= mejorHijo) {
                mostrar(hijo, tiempo);
            }
       
            if (mejorHijo >= mejorPadre.length()){
                mostrar(hijo, tiempo);
                break;
            }
       
            mejorConjetura = mejorHijo;
            mejorPadre = hijo;
        }
   
    }
}
