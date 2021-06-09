/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ejercicio.grupo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorGrupo {
    private List<grupo> listaGrupo;
    private grupo seleccionado;
    
    public ControladorGrupo(){
        listaGrupo=new ArrayList<>();
    }
    
    public long generarId(){
        return(listaGrupo.size()>0)? listaGrupo.get(listaGrupo.size()-1).getId()+1:1;
    }
    public boolean crear(String nombre){
        return listaGrupo.add(new grupo(generarId(), nombre));
    }
    
    public grupo buscar(long id){
        for(grupo Grupo:listaGrupo){
            if(Grupo.getId()==(id)){
                seleccionado=Grupo;
                return Grupo;
            }
        }
        return null;
    }
    
    public boolean actualizar(long id, String nombre){
        grupo Grupo = buscar(id);
        if (Grupo!=null){
            int posicion = listaGrupo.indexOf(Grupo);
       
            Grupo.setNombre(nombre);
            listaGrupo.set(posicion, Grupo);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(long id){
        grupo Asignatura=buscar(id);
        return listaGrupo.remove(listaGrupo);
    }

    public List<grupo> getListaGrupo() {
        return listaGrupo;
    }

    public void setListaGrupo(List<grupo> listaGrupo) {
        this.listaGrupo = listaGrupo;
    }

    public grupo getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(grupo seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
