/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author dkmrfcb
 */
public class RegistroCurso {

    ArrayList<Curso> listaCursos;

    public RegistroCurso() {
        listaCursos = new ArrayList<Curso>();
    }

    public boolean verificarCurso(String nombreCurso) {
        if (!nombreCurso.equalsIgnoreCase("")) { //Si el nombre del curso no es un String vacío
            for (Curso curso1 : listaCursos) {
                if (curso1.getNombreCurso().equalsIgnoreCase(nombreCurso)) {

                    return false; //Retorno false debido a que se verificó que ya existe ese curso en la lista de cursos
                }
            }

        }

        return true; //Si devuelve true es porque el curso no se encuentra en la lista.
    }

    public int verificarDato_Curso(String dato) { //Este método lo utilizo en consultarCursos (String dato)
        if (!dato.equalsIgnoreCase("")) {
            for (Curso curso1 : listaCursos) {
                if (dato.equalsIgnoreCase(curso1.getNombreCurso()) ^ dato.equalsIgnoreCase(curso1.getSiglas())) {
                    listaCursos.indexOf(curso1); //Existe el nombre del curso o las siglas del curso en la lista de cursos.
                }
            }
        }

        return -1; //No existe ese dato en los nombres de cursos ni en las siglas.
    }

    public String registrarCurso(String nombreCurso, String siglas, int creditos) {
        if (verificarCurso(nombreCurso)) {
            listaCursos.add(new Curso(nombreCurso, siglas, creditos));
            return "El curso fue registrado exitosamente";

        }

        return "¡Ya existe un curso con ese nombre!";
    }

    public String consultarCursos(String dato) {
        if (dato.equalsIgnoreCase("")) { //Si el dato no es un String vacio.
            if (verificarDato_Curso(dato) != -1) {
                return listaCursos.get(verificarDato_Curso(dato)).getInformacion_Curso();

            } else {
                return "No estan registradas las siglas ni el nombre del curso";
            }

        }
        return "Debe llenar el área con las siglas o el nombre de un curso";
    }
}
