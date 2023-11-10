/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import com.mycompany.tema4aiman.Utilidades;

/**
 *
 * @author aiman
 */
public class Ej1Ut {
    public static int[] devolverBooleano(){
        boolean devolver = true ;
        String caraCruz = "";
        int[] arrayBoolean = new int[20];
        int numeroMenor = 1;
        int numeroMayor = 2;
        for(int i = 0;i<arrayBoolean.length;i++){
            if(Utilidades.enteroAleatorio(numeroMenor, numeroMayor)==1){
                caraCruz = "cara";
                
            } else{
                caraCruz = "cruz";
            }
        }
        return arrayBoolean;
    }
}
