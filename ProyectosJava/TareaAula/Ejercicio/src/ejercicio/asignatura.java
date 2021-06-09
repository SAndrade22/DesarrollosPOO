/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import java.util.ArrayList;
/**
 *
 * @author sebas
 */
public class asignatura {
     private  long id;
    private String nombre;
    
    public asignatura(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "asignatura{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}