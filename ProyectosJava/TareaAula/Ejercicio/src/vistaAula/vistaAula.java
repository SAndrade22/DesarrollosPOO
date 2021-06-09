
package vistaAula;
/**
 *
 * @author sebas
 */
import controlAula.controlAula;
import ejercicio.aula;
import java.util.Scanner;
public class vistaAula {
    private Scanner Scanner;
    
    private controlAula obj;
    
    public vistaAula(){
        
        Scanner =new Scanner(System.in);
        
        obj=new controlAula();
        
    }
    
    public void menu(){
        int opcion;
        do{
        System.out.println("            Menú            ");
        System.out.println("1)  Crear");
        System.out.println("2)  Actualizar");
        System.out.println("3)  Buscar");
        System.out.println("4)  Eliminar");
        System.out.println("5)  Listar");
        System.out.println("6)  Salir");
            opcion= Scanner.nextInt();
            switch (opcion){
                case 1: this.crear();break;
                case 2: this.actualizar();break;
                case 3: this.buscar();break;
                case 4: this.eliminar();break;
                case 5: obj.mostrar();break; 
                
            }
        }while(opcion<=5);
    }
    
    public void crear(){
        System.out.println("Ingrese la descripcion del aula porfavor:");
        System.out.println("ID: ");
        long id=Scanner.nextLong();
        System.out.println("Descripcion de la Aula: ");
        String descripcion=Scanner.next();
        boolean resultado =obj.crear(id,descripcion);
    }
    
    public void actualizar(){
        System.out.println("Que aula desea actualizar:");
        System.out.println("aula: ");
        String descripcion=Scanner.next();
        System.out.println("ID: ");
        long id=Scanner.nextLong();
        boolean resultado =obj.actualizar(descripcion,id);
        System.out.println("Aula actualizada: "+resultado);
       
    }
    public void eliminar(){
        System.out.println("Que aula desea borrar:");
        System.out.println("aula: ");
        String descripcion=Scanner.next();
        boolean resultado =obj.borrar(descripcion);
        System.out.println("Aula eliminado");
       
    }
    public void buscar(){
        System.out.println("Que aula desea buscar:");
        System.out.println("Aula: ");
        String descripcion=Scanner.next();
        aula mat =obj.buscar(descripcion);
        System.out.println(mat);
       
    }
}
