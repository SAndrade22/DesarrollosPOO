package ejercicio;
import java.util.ArrayList;
/**
 *
 * @author sebas
 */
public class grupo {
    private  long id;
    private String nombre;
    
    public grupo(long id, String nom) {
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

    public void setNombre(String nom) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "grupo {" + "id=" + id + ", nom=" + nombre + '}';
    }
}
