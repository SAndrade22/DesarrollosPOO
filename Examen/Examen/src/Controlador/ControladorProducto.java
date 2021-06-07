/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author Usuario
 */
public class ControladorProducto {
    private List<Producto> listaProducto;
    private Producto seleccionado;
    
    public ControladorProducto(){
        listaProducto=new ArrayList<>();
    }
    
    public long generarId(){
        return(listaProducto.size()>0)? listaProducto.get(listaProducto.size()-1).getId()+1:1;
    }
    
    public boolean crear(String Nombre, String descripcion, double precioUnitario, int Stock, boolean Iva){
        return listaProducto.add(new Producto(generarId(),Nombre, descripcion, precioUnitario, Stock, Iva));
    }
    
    public Producto buscar(String Nombre){
        for(Producto producto:listaProducto){
            if(producto.getNombre().equals(Nombre)){
                seleccionado=producto;
                return producto;
            }
        }
        return null;
    }
    
    public boolean actualizar(String Nombre, String descripcion, double precioUnitario, int Stock){
        Producto producto = buscar(Nombre);
        if (producto!=null){
            int posicion = listaProducto.indexOf(producto);
            producto.setDescripcion(descripcion);
            producto.setPrecioUnitario(precioUnitario);
            producto.setStock(Stock);
            listaProducto.set(posicion, producto);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(String Nombre){
        Producto producto=buscar(Nombre);
        return listaProducto.remove(producto);
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public Producto getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Producto seleccionado) {
        this.seleccionado = seleccionado;
    }
     
}
