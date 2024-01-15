/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipoPOO;

/**
 *
 * @author aiman
 */
public class Equipo {
    private String nomEquipo ;
    private String nomEntrenador ;
    private String alineacion;

    public Equipo(String nomEquipo, String nomEntrenador, String alineacion) {
        this.nomEquipo = nomEquipo;
        this.nomEntrenador = nomEntrenador;
        this.alineacion = alineacion;
    }

    public String getNomEquipo() {
        return nomEquipo;
    }

    public String getNomEntrenador() {
        return nomEntrenador;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setNomEquipo(String nomEquipo) {
        this.nomEquipo = nomEquipo;
    }

    public void setNomEntrenador(String nomEntrenador) {
        this.nomEntrenador = nomEntrenador;
    }
    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipo{");
        sb.append("nomEquipo=").append(nomEquipo);
        sb.append(", nomEntrenador=").append(nomEntrenador);
        sb.append(", alineacion=").append(alineacion);
        sb.append('}');
        return sb.toString();
    }
}
