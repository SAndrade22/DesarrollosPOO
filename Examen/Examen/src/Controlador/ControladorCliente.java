/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Producto;


/**
 *
 * @author Usuario
 */
public class ControladorCliente {
    private List<Cliente> listaCliente;
    private Cliente seleccionado;
    
    public ControladorCliente(){
        listaCliente=new ArrayList<>();
    }
    
    public boolean crear(String Nombre, String Cedula, double fiabilidadPago){
        return listaCliente.add(new Cliente(Nombre, Cedula, fiabilidadPago));
    }
    public Cliente buscar(String Cedula){
        for(Cliente cliente:listaCliente){
            if(cliente.getCedula().equals(Cedula)){
                seleccionado=cliente;
                return cliente;
            }
        }
        return null;
    }
    public boolean actualizar(String Nombre, String Cedula, double fiabilidadPago){
        Cliente cliente = buscar(Cedula);
        if (cliente!=null){
            int posicion = listaCliente.indexOf(cliente);
            cliente.setFiabilidadPago(fiabilidadPago);
            cliente.setNombre(Nombre);
            listaCliente.set(posicion, cliente);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(String Cedula){
        Cliente cliente=buscar(Cedula);
        return listaCliente.remove(cliente);
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public Cliente getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Cliente seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
