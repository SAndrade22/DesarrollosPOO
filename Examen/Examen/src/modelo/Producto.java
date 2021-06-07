/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Producto {
    private long id;
    private String Nombre;
    private String descripcion;
    private double precioUnitario;
    private int Stock;
    private boolean Iva;

    public Producto(long id, String Nombre, String descripcion, double precioUnitario, int Stock, boolean Iva) {
        this.id = id;
        this.Nombre=Nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.Stock = Stock;
        this.Iva = Iva;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public int getStock() {
        return Stock;
    }
    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    public boolean getIva() {
        return Iva;
    }
    public void setIva(boolean Iva) {
        this.Iva = Iva;
    }
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", Nombre=" + Nombre + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + ", Stock=" + Stock + ", Iva=" + Iva + '}';
    }

}
