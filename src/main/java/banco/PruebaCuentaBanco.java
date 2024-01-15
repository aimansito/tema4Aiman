/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author aiman
 */
public class PruebaCuentaBanco {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CuentaBanco c1 = new CuentaBanco("aiman","2342",1000,10);
        System.out.println(c1.getNumCuenta());
        //metodo tostring
        System.out.println("Ingrese el saldo");
        c1.ingresarSaldo(teclado.nextDouble());
        System.out.println(c1.getSaldoCuenta());
        System.out.println("Retire el saldo");
        c1.retirarSaldo(teclado.nextDouble());
        teclado.nextLine();
        System.out.println("Introduce los interes");
        c1.interesSaldo(0.03);
        System.out.println(c1.cobrarIntereses());
        System.out.println(c1.getSaldoCuenta());
        System.out.println(c1.getInteresMensual());
    }
   
}
