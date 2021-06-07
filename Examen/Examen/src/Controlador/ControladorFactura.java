/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Factura;
import modelo.Cliente;
import modelo.Producto;

/**
 *
 * @author Usuario
 */
public class ControladorFactura {
    private List<Factura> listaFactura;
    private Factura seleccionado;
    
    public ControladorFactura(){
        listaFactura=new ArrayList<>();
    }
    public int generarNumero(){
        return(listaFactura.size()>0)? listaFactura.get(listaFactura.size()-1).getNumero()+1:1;
    }
    public boolean crear(int Numero, Cliente cliente , Producto producto, int Cantidad, double Valor, String Fecha){
        return listaFactura.add(new Factura(generarNumero(), cliente, producto, Cantidad, Valor, Fecha));
    }
    public Factura buscar(int Numero){
        for(Factura factura:listaFactura){
            if(factura.getNumero()==(Numero)){
                seleccionado=factura;
                return factura;
            }
        }
        return null;
    }
    public boolean actualizar(int Numero, Producto producto, int Cantidad, double Valor){
        Factura factura = buscar(Numero);
        if (factura!=null){
            int posicion = listaFactura.indexOf(factura);
       
            factura.setCantidad(Cantidad);
            factura.setValor(Valor);
            listaFactura.set(posicion, factura);
            return true;
        }
        return false;
    }
    public boolean eliminar(int Numero){
        Factura factura=buscar(Numero);
        return listaFactura.remove(factura);
    }

    public List<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(List<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

    public Factura getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Factura seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}

