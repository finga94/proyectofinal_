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
public class Cliente extends Persona{
    private String IdCliente;

    public Cliente() {
    }

    public Cliente(String IdCliente, String ci, String apellido1, String apellido2, String nombre1, String nombre2, String direccion, String correo, String celular, String fechaNacimiento) {
        super(ci, apellido1, apellido2, nombre1, nombre2, direccion, correo, celular, fechaNacimiento);
        this.IdCliente = IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getIdCliente() {
        return IdCliente;
    }
    
    
}
