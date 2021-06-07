/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Empresa;

/**
 *
 * @author diego
 */
public class EmpresaControlador {
    private List<Empresa> listaEmpresa;
    private Empresa seleccionado; // Guardar el Objeto que selecciona de la empresa
    
    public EmpresaControlador(){
        listaEmpresa = new ArrayList();
        seleccionado = null;
    }
    
    public boolean crear(long id, String nombre){
        Empresa empresa = new Empresa(id, nombre);
        return listaEmpresa.add(empresa);
    }
    public Empresa buscar(String nombre){
        for (Empresa empresa : listaEmpresa) {
            if(empresa.getNombre().equals(nombre)){
                return empresa;
            }
        }
        return null;
    }
    public boolean actualizar(String nombreAnterior, String nombreNuevo){
        Empresa empresa = this.buscar(nombreAnterior);
        if(empresa != null) {
            int posicion = listaEmpresa.indexOf(empresa);
            empresa.setNombre(nombreNuevo);
            listaEmpresa.set(posicion, empresa);
            return true;
        }
        return false;
    }
    public boolean eliminar(String nombre){
        Empresa empresa = this.buscar(nombre);
        if(empresa != null) {
            return listaEmpresa.remove(empresa);
        }
        return false;
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
