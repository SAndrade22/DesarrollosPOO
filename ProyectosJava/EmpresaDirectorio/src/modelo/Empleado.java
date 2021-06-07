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
public class Empleado extends Persona{ // Realizamos la herencia con Persona a traves de extends // recordar que Java solo soporta herencia simple
    private double sueldoBruto;

    public Empleado(long id, String nombre, String apellido, String cedula, String direccion) {
        super(id, nombre, apellido, cedula, direccion); // Enviar los datos al padre utilizamos super
    }

    public Empleado(long id, String nombre, String apellido, String cedula, String direccion, double sueldoBruto) {
        super(id, nombre, apellido, cedula, direccion); // Llamamos al padre
        this.sueldoBruto = sueldoBruto; // Asignamos le valor al atributo de Empleado
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "sueldoBruto=" + sueldoBruto + super.toString()+ '}';
    }
  
}
