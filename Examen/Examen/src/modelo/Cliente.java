/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private String Nombre;
    private String Cedula;
    private double fiabilidadPago;

    public Cliente(String Nombre, String Cedula, double fiabilidadPago) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.fiabilidadPago = fiabilidadPago;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public double getFiabilidadPago() {
        return fiabilidadPago;
    }

    public void setFiabilidadPago(double fiabilidadPago) {
        this.fiabilidadPago = fiabilidadPago;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", Cedula=" + Cedula + ", fiabilidadPago=" + fiabilidadPago + '}';
    }
    
    
}
