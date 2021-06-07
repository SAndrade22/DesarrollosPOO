/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Directivo;

/**
 *
 * @author diego
 */
public class ControladorDirectivo {
    private List<Directivo> listaDirectivo;
    private Directivo seleccionado;
    
    public ControladorDirectivo(){
        listaDirectivo = new ArrayList();
        seleccionado = null;
    }
    public long generarId(){
        if(listaDirectivo.size()>0)
            return listaDirectivo.get(listaDirectivo.size() -1).getId() + 1;
        return 1;
    }
    public boolean crear(String nombre, String apellido, String cedula, String direccion, double sueldoBruto, String categoria){
        Directivo directivo = new Directivo(generarId(), nombre, apellido, cedula, direccion, sueldoBruto, categoria);
        return listaDirectivo.add(directivo);
    }
    public Directivo buscar(String cedula){
        for (Directivo directivo : listaDirectivo) {
            if(directivo.getCedula().equals(cedula))
                return directivo;
        }
        return null;
    }
    public boolean actualizar(String nombre, String apellido, String cedula, String direccion, double sueldoBruto, String categoria){
        Directivo directivo = buscar(cedula);
        if(directivo !=null){
            int posicion = listaDirectivo.indexOf(directivo);
            directivo.setApellido(apellido);
            directivo.setNombre(nombre);
            directivo.setSueldoBruto(sueldoBruto);
            directivo.setCategoria(categoria);
            directivo.setDireccion(direccion);
            listaDirectivo.set(posicion, directivo);
            return true;
        }
        return false;
    }
    public boolean eliminar(String cedula){
        Directivo directivo = this.buscar(cedula);
        return listaDirectivo.remove(directivo);
    }

    public List<Directivo> getListaDirectivo() {
        return listaDirectivo;
    }

    public void setListaDirectivo(List<Directivo> listaDirectivo) {
        this.listaDirectivo = listaDirectivo;
    }

    public Directivo getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Directivo seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
