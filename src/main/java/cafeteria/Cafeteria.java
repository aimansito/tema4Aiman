/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteria;

/**
 *
 * @author aiman
 */
public class Cafeteria {
    public static void main(String[] args) {
        PruebaCafeteria c1 = new PruebaCafeteria();
        System.out.println(c1.toString());
        c1.servirCafe(199);
        System.out.println(c1.agregarCafe(199));
        System.out.println(c1.llenarCafetera());
        c1.vaciarCafe();
    }
}
