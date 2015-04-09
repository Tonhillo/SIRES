/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author dkmrfcb
 */
public class Matricula {

    private String fecha;
    private String datosCurso;

    public Matricula(String fecha, String datosCurso) {
        this.fecha = fecha;
        this.datosCurso = datosCurso;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDatosCurso() {
        return datosCurso;
    }

    public void setDatosCurso(String datosCurso) {
        this.datosCurso = datosCurso;
    }

}
