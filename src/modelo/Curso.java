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
public class Curso {

    private String nombreCurso;
    private String siglas;
    private int creditos;

    public Curso(String nombreCurso, String siglas, int creditos) {
        this.nombreCurso = nombreCurso;
        this.siglas = siglas;
        this.creditos = creditos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getInformacion_Curso() {

        return "Curso: " + getNombreCurso() + ", siglas: " + getSiglas() + ", créditos: " + getSiglas();
    }
}
