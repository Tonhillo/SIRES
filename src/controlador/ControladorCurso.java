/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroCurso;
import vista.GUICurso;

/**
 *
 * @author Fran
 */
public class ControladorCurso implements ActionListener {
    
    private RegistroCurso registroCurso;
    private GUICurso guiCurso;
    
    public ControladorCurso (RegistroCurso registroCurso, GUICurso guiCurso){
        
        this.registroCurso= registroCurso;
        this.guiCurso= guiCurso;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getActionCommand().equalsIgnoreCase(guiCurso.BOTON_REGISTRAR_CURSO)){
            if (guiCurso.getFieldCreditosCurso() guiCurso.getFieldNombreCurso() guiCurso.getFieldSiglasCurso())
        }
    }
    
    
}
