package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.FmrAdministrador;
import ec.edu.intsuperior.vista.FmrLogin;

/**
 *
 * @author USUARIO
 */
public class controlador {
    private FmrLogin Fmrlogin = new FmrLogin(this);
    private FmrAdministrador FmrAdministrador = new FmrAdministrador(this);
    public void mostrarAdministrador(){
        FmrAdministrador.setVisible(true);
    }
    public void ocultarAdministrador(){
        FmrAdministrador.setVisible(false);
    }
    
    public void Mostrarlogin(){
        Fmrlogin.setVisible(true);
    }
    public void ocultarlogin(){
        Fmrlogin.setVisible(false);
    }
    }

    
            
   