/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Empresa;

/**
 *
 * @author diego
 */
public class ClienteControlador {
    private List<Cliente> datos;
    private Cliente seleccionado;
    
    public ClienteControlador() {
        datos = new ArrayList<Cliente>();
        seleccionado = null;
    }
    // CRUD -> Create, Read , Update, Delete -- Crear Leer/Buscar Actualizar Eliminar
    public boolean crear(long id, String nombre, String apellido, String cedula) {
        Cliente cliente = new Cliente(id, nombre, apellido, cedula); // Creo un nuevo cliente
        return datos.add(cliente); // Agrego a mi lista de datos
    }
    public boolean crear(long id, String nombre, String apellido, String cedula, Empresa empresa) {
        Cliente cliente = new Cliente(id, nombre, apellido, cedula, empresa); // Creo un nuevo cliente
        empresa.getListaCliente().add(cliente); // Relación bidireccional // Agregamos a la lista de cliente de la empresa 
        return datos.add(cliente); // Agrego a mi lista de datos
    }
    public Cliente buscar(String cedula){
        for (Cliente cliente : datos) { // Recorre cada uno de los clientes dentro de la lista de datos
            if(cliente.getCedula().equals(cedula) == true){ // comparo la cedula del cada cliente con la que envio por parametro de busqueda
                return cliente; // Retorno el cliente que coincide con la cedula
            }
        }
        return null; // Si no encuentra retorna null
    }
    public boolean actualizar(String cedula, String nombre, String apellido) {
        Cliente cliente = this.buscar(cedula); // busco al cliente con la cedula
        if(cliente != null) { // Comprobar que el cliente exista
            int posicion = datos.indexOf(cliente); // obtengo la posición del cliente actual
            cliente.setNombre(nombre); // Actualizo el nomnbre
            cliente.setApellido(apellido); // Actualizo el apellido
            datos.set(posicion, cliente); // actualizo en base a la posicion del cliente.
            return true;
        }
        return false;
    }
    public boolean eliminar(String cedula) {
        Cliente cliente = this.buscar(cedula);
        if(cliente != null){
            cliente.getEmpresa().getListaCliente().remove(cliente);
            return datos.remove(cliente);
        }
        return false;
    }
    public void imprimir(){
        for (Cliente cliente : datos) {
            System.out.println(cliente);
        }
    }

    public List<Cliente> getDatos() {
        return datos;
    }

    public void setDatos(List<Cliente> datos) {
        this.datos = datos;
    }

    public Cliente getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Cliente seleccionado) {
        this.seleccionado = seleccionado;
    }
    
    
    
}
