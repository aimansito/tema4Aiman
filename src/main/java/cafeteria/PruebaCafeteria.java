/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria;

/**
 *
 * @author aiman
 */
public class PruebaCafeteria {
    private int capacidadMaxima ;
    private int capacidadActual ;
    //static quiere decir que no tienen porque aparecer en el objeto
    public PruebaCafeteria() {
        this.capacidadMaxima = 1000 ;
        this.capacidadActual  = 0;
    }

    public PruebaCafeteria(int capacidadMaxima) {
        this.capacidadMaxima=this.capacidadActual;
    }

    public PruebaCafeteria(int capacidadMaxima, int capacidadActual) {
        if(this.capacidadActual>this.capacidadMaxima){
            this.capacidadActual=this.capacidadMaxima;
        }
        
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    public boolean llenarCafetera(){
        boolean llena = false;
        this.capacidadMaxima = this.capacidadActual;
        if(capacidadActual==this.capacidadMaxima){
            llena = true; 
        }
        return llena;
    }
    public void servirCafe(int cantidadServir){
        int cantidadTaza = 0 ; 
    
        if(cantidadServir>this.capacidadActual){
            this.capacidadActual=cantidadTaza;
        }else{
            cantidadTaza = this.capacidadActual - cantidadServir;
        }
            
    }
    public void vaciarCafe(){
        this.capacidadActual=0;
    }
    public double  agregarCafe(int cantidadPoner){
        this.capacidadActual += cantidadPoner;
        
        if(cantidadPoner>this.capacidadMaxima){
            this.capacidadActual=this.capacidadMaxima;
        }
        return this.capacidadActual;
    }
}
