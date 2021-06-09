package ejercicio;

import Vista.vistaAula;

/**
 *
 * @author sebas
 */
public class Ejercicio {
    public static void main(String[] args)
    {
       vistaAula a= new aula();
       asignatura b= new asignatura(2,"Estudios Sociales");
       grupo c= new grupo(8,"58");
       
       System.out.println(a);      
       System.out.println(b); 
       System.out.println(c);
    }
    
}
