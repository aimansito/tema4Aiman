/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author aiman
 */
public class PruebaVehiculo {
    public static void main(String[] args) {
        // instanciación de un objeto 
        //reserva de espacio en memoria, dando valor a sus atributos
        Vehiculo vehiculo1 = new Vehiculo("12121", "Bugatti", 0);
        Vehiculo vehiculo2 = new Vehiculo("4334", "Seat", 150);
        System.out.println("Matricula coche 1 "+vehiculo1.getMatricula()+" "
        + "con marca "+vehiculo1.getMarca()+" y velocidad "+vehiculo1.getVelocidad());
        
        vehiculo2.setVelocidad(200);
        System.out.println("Nueva velocidad del vehiculo 2 "+ vehiculo2.getVelocidad());
        System.out.println(vehiculo1.toString());
        
        
    }
}
