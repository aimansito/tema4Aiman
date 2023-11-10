/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Random;

/**
 *
 * @author aiman
 */
public class arrayEjemplos2 {
    public static void main(String[] args) {
        int[] arreglo = generarArreglo(5); // Llamamos al método y obtenemos un arreglo de 5 números aleatorios.
        
        // Imprimimos el arreglo generado.
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento " + i + ": " + arreglo[i]);
        }
    }

    public static int[] generarArreglo(int longitud) {
        int[] arreglo = new int[longitud]; // Creamos un arreglo de la longitud especificada.

        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            arreglo[i] = random.nextInt(100); // Llenamos el arreglo con números aleatorios entre 0 y 99.
        }

        return arreglo; // Devolvemos el arreglo generado.
    }
}
