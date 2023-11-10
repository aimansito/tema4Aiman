/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema4aiman;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aiman
 */
public class Utilidades {
    //metodo de clase publico visible por otras clases 
    //metodo estatico es decir que no necesita objeto de la clase utilidades
    // devuelve un dato de tipo int + implica un return dentro del metodo
    //nombre del metodoç
    //no hay parametros
    public static int solicitarDatoInt(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un número");
        boolean seguir = true;
        int dato =0;
        do{
            try{
               dato = teclado.nextInt(); 
               teclado.nextLine();
               seguir=false;
            }catch(InputMismatchException ime){
                System.out.println("Error");
            }
            teclado.nextLine();
        }while(seguir);
        //aqui ya hay un numero 
        //devolucion de un dato 
        return dato;
    }
    public static int filtrarEnterosEntre(int menor,int mayor){
        int numero = 0;
        do{
            //AL USAR UN METODO QUE ESTA EN LA MISMA CLASE NO ES NECESARIO PONER EL NOMBRE DE LA CLASE
            numero = solicitarDatoInt();
            if(numero>mayor || numero<menor){
                System.out.println("No está en el rango de"+mayor+"y"+menor);
            }
            //numero no sea mayor que menor y menor qe mayor
        }while(!(numero>menor&&numero<mayor));
        
        return numero;
    }
    //metodo para obtener un entero aleatorio entre dos numeros
    public static int enteroAleatorio(int menor,int mayor){
        Random random = new Random();
        
        return random.nextInt(menor,mayor+1);
        
    }
}
