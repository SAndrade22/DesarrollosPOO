/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Empresa {
    private long id;
    private String nombre;
    private List<Cliente> listaCliente; // Bidereccional
    // private Cliente[] listCliente = new Cliente[10];

    public Empresa() {
        id = 0;
        nombre = "";
        listaCliente = new ArrayList();
    }
    
    public Empresa(long id, String nombre){
        this.id = id;
        this.nombre = nombre;
        listaCliente = new ArrayList();
    }

    public Empresa(long id, String nombre, List<Cliente> listaCliente) {
        this.id = id;
        this.nombre = nombre;
        this.listaCliente = listaCliente;
    }
    
    
    public long getId(){
        return this.id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
    
     
    @Override
    public String toString() {
        return "id: " + this.id + " nombre: " + this.nombre;
    }
}
