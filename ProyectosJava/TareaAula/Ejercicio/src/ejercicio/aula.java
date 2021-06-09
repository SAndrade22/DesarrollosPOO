
package ejercicio;
import java.util.ArrayList;
/**
 *
 * @author sebas
 */
public class aula {
    
    private  long id;
    private String descrip;
    
    
    public aula(long id, String descrip) {
        this.id = id;
        this.descrip = descrip;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descrip;
    }

    public void setDescripcion(String descrip) {
        this.descrip = descrip;
    }

    @Override
    public String toString() {
        return "aula{" + "id=" + id + ", descrip=" + descrip+ '}';
    }
}
