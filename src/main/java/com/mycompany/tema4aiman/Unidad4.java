/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema4aiman;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aiman
 */
public class Unidad4 {
    public static void main(String[] args) {
        //acceso a un metodo etatico publico de otra clase
        //se usa el nombre de la clase(.)nombre del metodo
       // int numero = Utilidades.filtrarEnterosEntre(6, 10);
        
       // System.out.println("Numero "+numero);
//        
//        System.out.println("Vamos a crear aleatorios entre dos números int ");
//        System.out.println("Introduce el primer número");
//        int dato1 = Utilidades.solicitarDatoInt();
//        System.out.println("Solicita el segundo datos");
//        int dato2 = Utilidades.solicitarDatoInt();
//        
//        
//        int aleatorio = Utilidades.enteroAleatorio(dato1, dato2);
//        System.out.println(aleatorio);
//        
      //metodo de clase para solicitar datos
      
      //array
      
      int[] arrayAleatorios = new int[100];
      int numeroMenor = 10;
      int numeroMayor = 2000;
      //rellenar array con aleatorios
      for(int i = 0;i<arrayAleatorios.length;i++){
          arrayAleatorios [i] = Utilidades.enteroAleatorio(numeroMenor, numeroMayor);
      }
      
      for(int i = 0;i<arrayAleatorios.length;i++){
          System.out.println(" "+ arrayAleatorios [i] );
      }
    }
}
