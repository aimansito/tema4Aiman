/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aiman
 */
public class Veterinario {
    //Pedir al usuario un número de animales que van a ser evaluados en el veterinario. 
    //De cada animal vamos a guardar su peso, que vamos a pedir por teclado. 
    //Una vez sepamos los pesos de todos los animales, queremos saber la media 
    //de todos los pesos, cuantos animales hay por debajo de la media y cuantos por encima
    //Si el usuario pone un peso negativo se considerará positivo
    //hacer un array que pida el nombre de los animales y lo muestre 
    public static void main(String[] args) {
            int numAnimales = numeroAnimales(); //en esta variable se almacena el número de animales
            String[] pedirNombreAnimal = new String [numAnimales];
            double[] pedirPesoAnimal= new double[numAnimales];
            pedirNombreAnimal = pedirNombreAnimal(pedirNombreAnimal);
            pedirPesoAnimal = pedirPesoAnimal(pedirNombreAnimal, pedirPesoAnimal);
            double mediaPeso = mediaPeso (pedirPesoAnimal,numAnimales);
            mostrarNombreyPeso(pedirPesoAnimal,pedirNombreAnimal);
            numAnimalesMasMedia(pedirPesoAnimal,mediaPeso);
    }
    public static int numeroAnimales(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un número");
        boolean seguir = true;
        int numAnimales =0;
        do{
            try{
               numAnimales = teclado.nextInt(); 
               teclado.nextLine();
               seguir=false;
            }catch(InputMismatchException ime){
                System.out.println("Error");
            }
        }while(seguir);
        return numAnimales;
    }
    public static String[] pedirNombreAnimal(String[] arrayNombreAnimal){
        Scanner teclado = new Scanner (System.in);
        String nombreAnimal="";
        boolean valido = true ;
        for(int i = 0;i<arrayNombreAnimal.length;i++){
            System.out.println("Introduce el nombre del animal "+i);
            do{
                try{
                nombreAnimal = teclado.nextLine();
                valido=false;
                }catch(InputMismatchException ime){
                System.out.println("Vuelve a introducirlo");
                teclado.nextLine();
                }
            }while(valido);
            arrayNombreAnimal[i] = nombreAnimal;
        }
        return arrayNombreAnimal;
    }
    public static double[] pedirPesoAnimal(String[] arrayNombreAnimal , double[] arrayPesoAnimal){
        Scanner teclado = new Scanner (System.in);
        double pesoAnimal=0;
        boolean valido = true ;
        for(int i = 0;i<arrayPesoAnimal.length;i++){
            System.out.println("Introduce el peso del animal de "+arrayNombreAnimal[i]);
            do{
                try{
                pesoAnimal = teclado.nextDouble();
                pesoAnimal = Math.abs(pesoAnimal);
                valido=false;
                }catch(InputMismatchException ime){
                System.out.println("Vuelve a introducirlo");
                teclado.nextLine();
                }
            }while(valido);
            arrayPesoAnimal[i] = pesoAnimal;
        }
        return arrayPesoAnimal;
    }
    public static double mediaPeso(double[] peso,int numAnimales){
        double mediaPeso= 0;
        double suma = 0;
        for (int i = 0; i < peso.length; i++) {
            suma += peso[i];
        }
        mediaPeso = suma / numAnimales;
        System.out.println("\nLa media del peso es de: " + mediaPeso + "Kg");
        return mediaPeso;
    }
    public static void  mostrarNombreyPeso(double[]peso,String[]nombre){
        for(int i = 0;i<nombre.length;i++){
            System.out.println("Animal con nombre "+nombre[i]+" y peso "+peso[i]);
        }
    }
    public static void numAnimalesMasMedia (double[]peso, double mediaPeso){
        int contadorMas = 0;
        int contadorMenos = 0;
        for(int i = 0;i<peso.length;i++){
            if(peso[i]>mediaPeso){
                contadorMas++;
            }else if(peso[i]<mediaPeso){
                contadorMenos++;
            }
        }
        System.out.println("Hay "+contadorMas+" animales por encima de la media"
                + "y "+contadorMenos+" por debajo de la media");
    }
}
