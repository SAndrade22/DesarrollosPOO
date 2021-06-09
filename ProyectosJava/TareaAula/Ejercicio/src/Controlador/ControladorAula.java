/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
    
    import java.util.ArrayList;
    import java.util.List;
    import ejercicio.aula;
/**
 *
 * @author Usuario
 */
public class ControladorAula {
    private List<aula> listaAula;
    private aula seleccionado;
    
    public ControladorAula(){
        listaAula=new ArrayList<>();
    }
    public long generarId(){
        return(listaAula.size()>0)? listaAula.get(listaAula.size()-1).getId()+1:1;
    }
    public boolean crear(String descrip){
        return listaAula.add(new aula(generarId(), descrip));
    }
    
    public aula buscar(long id){
        for(aula Aula:listaAula){
            if(Aula.getId()==(id)){
                seleccionado=Aula;
                return Aula;
            }
        }
        return null;
    }
    
    public boolean actualizar(long id, String descrip){
        aula Aula = buscar(id);
        if (Aula!=null){
            int posicion = listaAula.indexOf(Aula);
       
            Aula.setDescripcion(descrip);
            listaAula.set(posicion, Aula);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(long id){
        aula Aula=buscar(id);
        return listaAula.remove(Aula);
    }

    public List<aula> getListaAula() {
        return listaAula;
    }

    public void setListaAula(List<aula> listaAula) {
        this.listaAula = listaAula;
    }

    public aula getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(aula seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
