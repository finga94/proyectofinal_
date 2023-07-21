/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.educ.intsuperior.modelo;

/**
 *
 * @author USUARIO
 */
public class Cuenta {
  private String numerodecuenta;
  private String nombredesocio;
  private String nombredebanco;
  private String direccion;
  private String tipodecuenta;

    public String getNumerodecuenta() {
        return numerodecuenta;
    }

    public void setNumerodecuenta(String numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public String getNombredesocio() {
        return nombredesocio;
    }

    public void setNombredesocio(String nombredesocio) {
        this.nombredesocio = nombredesocio;
    }

    public String getNombredebanco() {
        return nombredebanco;
    }

    public void setNombredebanco(String nombredebanco) {
        this.nombredebanco = nombredebanco;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipodecuenta() {
        return tipodecuenta;
    }

    public void setTipodecuenta(String tipodecuenta) {
        this.tipodecuenta = tipodecuenta;
    }
  
  
}
