/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevador;

import java.time.LocalDate;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author aiman
 */
public class Elevador {
    public static Random random = new Random ();
    private  final int numSerie ;
    private  final String fabricante;
    private  final int capacidadMaximaPersonas;
    private  final double pesoMaximo;
    private  final LocalDate fechaFabricación;
    private LocalDate fechaUltRevision;
    private String estado;
    private int planta;
    
    public Elevador(String fabricante, int capacidadMaximaPersonas, double pesoMaximo,int planta) {
        this.numSerie = Integer.parseInt(RandomStringUtils.randomNumeric(8));
        this.fabricante = fabricante;
        if(capacidadMaximaPersonas<0||capacidadMaximaPersonas>10){
            this.capacidadMaximaPersonas = 10;
        }else{
            this.capacidadMaximaPersonas=capacidadMaximaPersonas;
        }
        if(pesoMaximo<0||pesoMaximo>800){
            this.pesoMaximo=800;
        }else{
           this.pesoMaximo=pesoMaximo;
        }
        this.fechaFabricación = LocalDate.now();
        this.fechaUltRevision = LocalDate.now();
        this.estado=null;
        this.planta=planta;
    }
    public int getNumSerie() {
        return numSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getCapacidadMaximaPersonas() {
        return capacidadMaximaPersonas;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public LocalDate getFechaFabricación() {
        return fechaFabricación;
    }

    public LocalDate getFechaUltRevision() {
        return fechaUltRevision;
    }

    public String getEstado() {
        return estado;
    }

    public int getPlanta() {
        return planta;
    }

    public void setFechaUltRevision(LocalDate fechaUltRevision) {
        this.fechaUltRevision = fechaUltRevision;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elevador{");
        sb.append("numSerie=").append(numSerie);
        sb.append(", fabricante=").append(fabricante);
        sb.append(", capacidadMaximaPersonas=").append(capacidadMaximaPersonas);
        sb.append(", pesoMaximo=").append(pesoMaximo);
        sb.append(", fechaFabricaci\u00f3n=").append(fechaFabricación);
        sb.append(", fechaUltRevision=").append(fechaUltRevision);
        sb.append(", estado=").append(estado);
        sb.append(", planta=").append(planta);
        sb.append('}');
        return sb.toString();
    }   
}
