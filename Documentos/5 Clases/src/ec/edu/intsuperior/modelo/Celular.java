/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author USUARIO
 */
public class Celular {

    public String getMarca() {
        return marca;
    }

    public String getCapaciudad() {
        return capaciudad;
    }

    public String getCarmara() {
        return carmara;
    }
    private String marca;
    private String capaciudad;
    private String carmara;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapaciudad(String capaciudad) {
        this.capaciudad = capaciudad;
    }

    public void setCarmara(String carmara) {
        this.carmara = carmara;
    }
    
}
