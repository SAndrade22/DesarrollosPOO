/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author diego
 */
public class Directivo extends Empleado{
    private String categoria;
    public Directivo(long id, String nombre, String apellido, String cedula, String direccion, double sueldoBruto) {
        super(id, nombre, apellido, cedula, direccion, sueldoBruto);
    }

    public Directivo(long id, String nombre,String apellido, String cedula, String direccion, double sueldoBruto, String categoria) {
        super(id, nombre, apellido, cedula, direccion, sueldoBruto);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Directivo{" + "categoria=" + categoria + super.toString() +'}';
    }
    
}
