/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author aiman
 */
public class CuentaBanco {
    //attributo de clase 
    //accesible mediante el nom de la clase
    //no se usan con this
    //no es necesario crear ningun objeto para usar este atributo
    public static final int NUMCARACTERES = 20;
    //atributos de instancia
    //accesible mediante el nom de objeto 
    //se usan con this
    //hay q crear un objeto cuenta para que cad cuenta tenga sus propios valores 
    private final String numCuenta ;
    private String nombre ;
    private String NIF;
    private double saldoCuenta;
    private double interesMensual; // porcentaje 

    public CuentaBanco(String nombre, String NIF, double saldoCuenta, int interesMensual) {
        this.numCuenta = RandomStringUtils.randomNumeric(NUMCARACTERES);
        this.nombre = nombre;
        this.NIF = NIF;
        this.saldoCuenta = saldoCuenta;
        this.interesMensual = interesMensual;
    }
    public CuentaBanco (CuentaBanco origen) { 
        this.nombre = origen. nombre; 
        this.interesMensual = origen. interesMensual; 
        this.NIF = origen.NIF; 
        this. numCuenta = origen. numCuenta;
        this.saldoCuenta = origen. saldoCuenta; 
    }
    //constructor con valores por defecto 
    
    public CuentaBanco(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public void setInteresMensual(int interesMensual) {
        this.interesMensual = interesMensual;
    }
    public void ingresarSaldo(double saldo){
        this.saldoCuenta += saldo;
    }
    public boolean retirarSaldo(double retiro){
        boolean respuesta = false;
        if(this.saldoCuenta>=retiro){
            this.saldoCuenta -= retiro;
            respuesta=true;
        }
        return respuesta;
    }
    public double interesSaldo(double interesMensual){
        return this.interesMensual= saldoCuenta * interesMensual;
    }
    public double cobrarIntereses(){
        return this.saldoCuenta += this.interesMensual;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CuentaBanco{");
        sb.append("numCuenta=").append(numCuenta);
        sb.append(", nombre=").append(nombre);
        sb.append(", NIF=").append(NIF);
        sb.append(", saldoCuenta=").append(saldoCuenta);
        sb.append(", interesMensual=").append(interesMensual);
        sb.append('}');
        return sb.toString();
    }
}
