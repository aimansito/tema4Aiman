/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoPOO;

/**
 *
 * @author aiman
 */
public class AlineaciónEquipo {
    public static void main(String[] args) {
        Equipo eq1 = new Equipo("FC Barcelona","Xavi Hernández","4-3-3");
        Equipo eq2 = new Equipo("Real Madrid CF","Carlo Ancelotti","4-3-2-1");
        
        System.out.println("El primer equipo es "+eq1.getNomEquipo()+" "
                + "con entrenador "+eq1.getNomEntrenador()+" que usa la "
                        + "formación "+eq1.getAlineacion());
        
        eq2.setAlineacion("4-4-2");
        System.out.println("El segundo equipo es "+eq2.getNomEquipo()+" con "
                + "entrenador "+eq2.getNomEntrenador()+" que usa la alineación "
                        + ""+eq2.getAlineacion());
        
        System.out.println(eq1.toString());
        System.out.println(eq2.toString());
    }
}
