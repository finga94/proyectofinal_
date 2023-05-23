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
public class Carro {
    private String marca;
    private String tonelaje;
    private String placa;
    private String numerodemotro;
    private String numerodeclasis;
    private String año;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTonelaje(String tonelaje) {
        this.tonelaje = tonelaje;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setNumerodemotro(String numerodemotro) {
        this.numerodemotro = numerodemotro;
    }

    public void setNumerodeclasis(String numerodeclasis) {
        this.numerodeclasis = numerodeclasis;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public String getTonelaje() {
        return tonelaje;
    }

    public String getPlaca() {
        return placa;
    }

    public String getNumerodemotro() {
        return numerodemotro;
    }

    public String getNumerodeclasis() {
        return numerodeclasis;
    }

    public String getAño() {
        return año;
    }
    
}
