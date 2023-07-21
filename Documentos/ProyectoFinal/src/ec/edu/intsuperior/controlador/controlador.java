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
        getFmrAdministrador().setVisible(true);
    }
    public void Mostrarlogin(){
        getFmrlogin().setVisible(true);
    }

    /**
     * @return the Fmrlogin
     */
    public FmrLogin getFmrlogin() {
        return Fmrlogin;
    }

    /**
     * @param Fmrlogin the Fmrlogin to set
     */
    public void setFmrlogin(FmrLogin Fmrlogin) {
        this.Fmrlogin = Fmrlogin;
    }

    /**
     * @return the FmrAdministrador
     */
    public FmrAdministrador getFmrAdministrador() {
        return FmrAdministrador;
    }

    /**
     * @param FmrAdministrador the FmrAdministrador to set
     */
    public void setFmrAdministrador(FmrAdministrador FmrAdministrador) {
        this.FmrAdministrador = FmrAdministrador;
    }

    public void OcultarAdministrador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Ocultarlogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
