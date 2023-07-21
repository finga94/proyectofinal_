/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.FmrAdministrador;
import ec.edu.intsuperior.vista.FmrLogin;

/**
 *
 * @author USUARIO
 */
public class controlador {
    FmrLogin Fmrlogin = new FmrLogin(this);
    FmrAdministrador FmrAdministrador = new FmrAdministrador(this);
    public void mostrarAdministrador(){
        FmrAdministrador.setVisible(true);
    }
    public void OcultarAdministrador(){
        FmrAdministrador.setVisible(false);
    }
    public void Mostrarlogin(){
        Fmrlogin.setVisible(true);
    }
    public void Ocultarlogin(){
        Fmrlogin.setVisible(false);
    }
}
