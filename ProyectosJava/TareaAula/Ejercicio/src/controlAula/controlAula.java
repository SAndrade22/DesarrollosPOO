package controlAula;
import java.util.List;
import java.util.ArrayList;
import ejercicio.aula;
public class controlAula {
      private List<aula> aula;

    public controlAula() {
      aula= new ArrayList<aula>();    
    }
    //CRUD
    public boolean crear(long id, String descripcion) {
        aula mat= new aula(id,descripcion);
        return aula.add(mat);
    }
    
    public aula buscar(String descripcion){
        for (aula mat:aula){
            if (mat.getDescripcion().equals(descripcion)==true){
                return mat;
            }
        }
        return null;
        
    } 
    public boolean actualizar(String descripcion,long id){
         aula mat= this.buscar(descripcion);
         if (mat!= null){
             int pos=  aula.indexOf(mat);
             mat.setDescripcion(descripcion);
             mat.setId(id);
             aula.set(pos,mat);
             return true;
         }
         return false;

    }
    public boolean borrar(String descripcion){ 
        aula mat = this.buscar(descripcion);
        if (mat !=null){
            return aula.remove(mat);
            
        }
        return false;
        
    }
    public void mostrar(){
        for  (aula mat:aula){
            System.out.println(mat);
        }
    }

        public List<aula> getaula() {
            return aula;
        }

        public void setaula(List<aula> aula) {
            this.aula = aula;
        }
}
