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
    private List<Cliente> listadoClientes;
    private List<Empleado> listadoEmpleados;
    private List<Directivo> listadoDirectivo;

    public Empresa(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.listadoClientes = new ArrayList();
        this.listadoEmpleados = new ArrayList();
        listadoDirectivo = new ArrayList();
    }
    
    public Empresa(long id, String nombre, List<Cliente> listadoClientes, List<Empleado> listadoEmpleados) {
        this.id = id;
        this.nombre = nombre;
        this.listadoClientes = listadoClientes;
        this.listadoEmpleados = listadoEmpleados;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListadoClientes() {
        return listadoClientes;
    }

    public void setListadoClientes(List<Cliente> listadoClientes) {
        this.listadoClientes = listadoClientes;
    }

    public List<Empleado> getListadoEmpleados() {
        return listadoEmpleados;
    }

    public void setListadoEmpleados(List<Empleado> listadoEmpleados) {
        this.listadoEmpleados = listadoEmpleados;
    }

    public List<Directivo> getListadoDirectivo() {
        return listadoDirectivo;
    }

    public void setListadoDirectivo(List<Directivo> listadoDirectivo) {
        this.listadoDirectivo = listadoDirectivo;
    }
    
    

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
    
}
