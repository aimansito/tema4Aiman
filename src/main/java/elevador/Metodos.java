/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevador;
/**
 *
 * @author aiman
 */
public class Metodos {
    public static boolean moverPlanta(Elevador planta,int plantaNueva){
        if((planta.getPlanta()<0||planta.getPlanta()>8)||(plantaNueva<0||plantaNueva>8)||(planta.getPlanta()==plantaNueva)){
          return false;
        }
        return true;
    }
    public static void estadoPlanta(Elevador e1,int plantaNueva){
        
        if(moverPlanta(e1,plantaNueva)==true&&(plantaNueva>e1.getPlanta())){
            e1.setPlanta(plantaNueva);
            System.out.println("Se mueve a la planta: "+e1.getPlanta());
            e1.setEstado("Subiendo");
            System.out.println(e1.getEstado());
        
        }else if(moverPlanta(e1,plantaNueva)==true&&(plantaNueva<e1.getPlanta())){
            e1.setPlanta(plantaNueva);
            System.out.println("Se mueve a la planta: "+e1.getPlanta());
            e1.setEstado("Bajando");
            System.out.println(e1.getEstado());
        }
        else if(moverPlanta(e1,plantaNueva)==false){
            e1.setPlanta(e1.getPlanta());
            System.out.println("Te mantienes en la planta: "+e1.getPlanta());
        }
    }
}
