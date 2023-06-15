/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Controlador {

    Cliente c;
    ArrayList<Cliente> listaCliente = new ArrayList<>();
    private Object ced;

    @SuppressWarnings("fallthrough")
    public void menu() {
        String op;
        do {
            op = JOptionPane.showInputDialog("ingresar una opcion:\n"
                    + "1.-Ingresar Cliente \n"
                    + "2.-consultar Cliente \n"
                    + "3.-Actualizar Cliente \n"
                    + "4.-Eliminar  Cliente \n"
                    + "5.-Salir ");
            switch (op) {
                case "1":
                    this.ingresarCliente();
                    break;
                case "2":
                    this.consultarTodosclientes();
                case "3":
                    this.actualizarCliente(JOptionPane.showInputDialog("Ingresa  la cedula q se va actualizar "));
                    break;
                case "4":
                    this.eliminarCliente(JOptionPane.showInputDialog("Ingresa  la cedula q se va a eliminar  "));
                    break;

            }
        } while (!op.equals("5"));
    }

    public void ingresarCliente() {
        c = new Cliente();
        c.setCi(JOptionPane.showInputDialog("Ingresa  la cedula "));
        c.setApellido1(JOptionPane.showInputDialog("Ingresa apellido 1"));
        c.setApellido2(JOptionPane.showInputDialog("Ingresa apellido 1"));
        c.setNombre1(JOptionPane.showInputDialog("Ingresa nombre 1"));
        c.setNombre2(JOptionPane.showInputDialog("Ingresa nombre 2"));
        c.setCelular(JOptionPane.showInputDialog("Ingresa  la de celular "));
        c.setCorreo(JOptionPane.showInputDialog("Ingresa  la de correo "));

        listaCliente.add(c);
    }

    public void consultarTodosclientes() {
        JOptionPane.showMessageDialog(null, listaCliente.toString());
    }
    
    public void actualizarCliente(String ci) {
        String op;
        for (Cliente cliente : listaCliente) {
            if (cliente.getCi().equals(ci)) {

            }
            do {
                op = JOptionPane.showInputDialog("indicael parametro  a actualizar \n"
                        + "a.-cedula\n"
                        + "b.-apellido1\n"
                        + "c.-apellido2\n"
                        + "d.-nombre1\n"
                        + "e.-nombre1\n"
                        + "f.-nombre2\n"
                        + "d.-direccion\n"
                +"s.- salir");
                switch (op) {
                    case "a":
                        cliente.setCi(JOptionPane.showInputDialog("ingrese nueva cedula"));
                        break;
                    case "b":
                        cliente.setApellido1(JOptionPane.showInputDialog("ingrese nueva apellido1"));
                        break;
                }
            } while (!op.equals("s"));
        }
        else {
    JOptionPane.showInternalMessageDialog(null, "Cliente no existe ");
            }
    }

    /**
     *
     * @param ced
     */
    public void eliminar(string ced);{
    listaCliente.stream().filter((cliente) -> (cliente.getCi().equals(ced))).forEachOrdered((cliente) -> {
        listaCliente.remove(cliente);
        });
}

    private void eliminarCliente(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class string {

        public string() {
        }
    }

}

