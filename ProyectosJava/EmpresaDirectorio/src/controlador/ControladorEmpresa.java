/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Empresa;

/**
 *
 * @author diego
 */
public class ControladorEmpresa {
    private List<Empresa> listaEmpresa;
    private Empresa seleccionado;
    
    public ControladorEmpresa(){
        listaEmpresa = new ArrayList();
        seleccionado = null;
    }
    public long generarId(){
        // Operadores ternarios: Es poder realizar un if / else en una sola linea
        return (listaEmpresa.size()>0)? listaEmpresa.get(listaEmpresa.size()-1).getId()+1 : 1;
    }
    public boolean crear(String nombre){
        return listaEmpresa.add(new Empresa(generarId(), nombre));
    }
    public Empresa buscar(String nombre){
        for (Empresa empresa : listaEmpresa) {
            if(empresa.getNombre().equals(nombre))
                return empresa;
        }
        return null;
        // Buscar en una linea
        //return listaEmpresa.stream().filter(empresa -> empresa.getNombre().equals(nombre)).findFirst();
    }
    public boolean actualizar(String nombreAnterior, String nombre){
        Empresa empresa = buscar(nombreAnterior);
        if(empresa != null){
            int posicion = listaEmpresa.indexOf(empresa);
            empresa.setNombre(nombre);
            listaEmpresa.set(posicion, empresa);
            return true;
        }
        return false;
    }
    public boolean eliminar(String nombre){
        return listaEmpresa.remove(buscar(nombre));
    }
    public boolean agregarEmpleado(Empleado empleado){
        return seleccionado.getListadoEmpleados().add(empleado);
    }
    public boolean agregarCliente(Cliente cliente){
        return seleccionado.getListadoClientes().add(cliente);
    }

    public List<Empresa> getListaEmpresa() {
        return listaEmpresa;
    }

    public void setListaEmpresa(List<Empresa> listaEmpresa) {
        this.listaEmpresa = listaEmpresa;
    }

    public Empresa getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Empresa seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
