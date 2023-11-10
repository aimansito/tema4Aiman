/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author aiman
 */
//definicion de la clase(static,extends,abstract,etc)
public class Vehiculo {
    //atributos --caracteristicas  
    String matricula;
    String marca;
    double velocidad;
    
    
    //metodos --acciones
    //metodo constructor ,se llama igual que la clase siempre es publico 
    //no devuelve nada, puede tener parametros
    
    public Vehiculo(String matricula,String marca,double velocidad){
        this.matricula = matricula; 
        this.marca = marca;
        this.velocidad = velocidad;
    }
}
