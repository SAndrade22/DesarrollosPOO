/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ejercicio.asignatura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorAsignatura {
    private List<asignatura> listaAsignatura;
    private asignatura seleccionado;
    
    public ControladorAsignatura(){
        listaAsignatura=new ArrayList<>();
    }
    public long generarId(){
        return(listaAsignatura.size()>0)? listaAsignatura.get(listaAsignatura.size()-1).getId()+1:1;
    }
    public boolean crear(String nombre){
        return listaAsignatura.add(new asignatura(generarId(), nombre));
    }
    
    public asignatura buscar(long id){
        for(asignatura Asignatura:listaAsignatura){
            if(Asignatura.getId()==(id)){
                seleccionado=Asignatura;
                return Asignatura;
            }
        }
        return null;
    }
    
    public boolean actualizar(long id, String nombre){
        asignatura Asignatura = buscar(id);
        if (Asignatura!=null){
            int posicion = listaAsignatura.indexOf(Asignatura);
       
            Asignatura.setNombre(nombre);
            listaAsignatura.set(posicion, Asignatura);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(long id){
        asignatura Asignatura=buscar(id);
        return listaAsignatura.remove(Asignatura);
    }

    public List<asignatura> getListaAsignatura() {
        return listaAsignatura;
    }

    public void setListaAsignatura(List<asignatura> listaAsignatura) {
        this.listaAsignatura = listaAsignatura;
    }

    public asignatura getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(asignatura seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
