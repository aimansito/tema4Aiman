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
    private String matricula;
    private String marca;
    private double velocidad;
    
    
    //metodos --acciones
    //metodo constructor ,se llama igual que la clase siempre es publico 
    //no devuelve nada, puede tener parametros
    
    public Vehiculo(String matricula,String marca,double velocidad){
        this.matricula = matricula; 
        this.marca = marca;
        this.velocidad = velocidad;
    }
    //getters y setters son public
    //metodos get sirven para obtener datos
    public String getMatricula(){
        return this.matricula;
    }
    public String getMarca(){
        return this.marca;
    }
    public double getVelocidad(){
        return this.velocidad;
    }
   //metodos set --> sirven para establece datos en los atributos

   public void setMatricula(String matricula){
       this.matricula = matricula ;
   }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("matricula=").append(matricula);
        sb.append(", marca=").append(marca);
        sb.append(", velocidad=").append(velocidad);
        sb.append('}');
        return sb.toString();
    }

    
   
}
