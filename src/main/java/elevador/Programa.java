/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevador;

/**
 *
 * @author aiman
 */
public class Programa {
    public static void main(String[] args) {
        // Crear un objeto Elevador sin valores específicos
        Elevador e1 = new Elevador("Empresa", 10, 45,5);

        // Mostrar la representación en cadena del objeto
        System.out.println(e1);
        System.out.println( Metodos.moverPlanta(e1,8));
        Metodos.estadoPlanta(e1,8);
        System.out.println(e1);
        Metodos.estadoPlanta(e1,6);
        System.out.println(e1);
        Metodos.moverPlanta(e1, 14);
        Metodos.estadoPlanta(e1, 14);
        System.out.println(e1);
        Metodos.estadoPlanta(e1, 4);
        Metodos.estadoPlanta(e1, 20);
        System.out.println(e1);
    }
}
