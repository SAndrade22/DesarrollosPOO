/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import modelo.Cliente;
/**
 *
 * @author Usuario
 */
public class Factura {
    private int Numero;   
    private int Cantidad;
    private double Valor;
    private String fecha;
    private Cliente cliente;
    private Producto producto;

    public Factura(int Numero, Cliente cliente, Producto producto, int Cantidad, double Valor, String Fecha) {
        this.Numero=Numero;
        this.cliente = cliente;
        this.producto=producto;
        this.Cantidad = Cantidad;
        this.Valor = Valor;
        this.fecha = fecha;
        
    }

    public Factura(int Numero, int Cantidad, double Valor, Date Fecha, Cliente cliente, Producto producto) {
        this.Numero = Numero;
        this.Cantidad = Cantidad;
        this.Valor = Valor;
        
        this.cliente = cliente;
        this.producto=producto;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    @Override
    public String toString() {
        return "Factura{" + "Numero=" + Numero + ", Cantidad=" + Cantidad + ", Valor=" + Valor + ", cliente=" + cliente + '}';
    }

}
