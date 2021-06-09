/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorAula;
import ejercicio.aula;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class vistaAula {
    public Scanner teclado;
    private ControladorAula controladorAula;
    public vistaAula(ControladorAula controladorAula){
        teclado=new Scanner(System.in);
        this.controladorAula=controladorAula;
    }
    
    public void menu(){
        int opcion=0;
        do{
            System.out.println("1. Crear \n 2. Actualizar \n 3. Buscar \n 4. Eliminar \n 5. Listar \n 6. Sair");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:this.crear(); break;
                case 2:this.actualizar(); break;
                case 3:this.buscar(); break;
                case 4:this.eliminar(); break;
                case 5:this.listar(); break;
            }
        }while(true);
    }
    public void crear()
    {
        System.out.println("Ingrese: \n Descripcion");
        String descrip=teclado.next();
        System.out.println("Res: "+ controladorAula.crear(descrip));
    }
    public void actualizar(){
        System.out.println("Ingrese: \n Descripcion");
        String descrip=teclado.next();
        System.out.println("Res: "+controladorAula.actualizar(0, descrip));
    }
    public void buscar(){
        System.out.println("Ingrese: \n id");
        long id=teclado.nextLong();
        System.out.println(controladorAula.buscar(id));
    }
    public void eliminar(){
        this.buscar();
        System.out.println("Res: "+controladorAula.eliminar(controladorAula.getSeleccionado().getId()));
    }
        public void listar(){
        for(aula Aula : controladorAula.getListaAula()){
            
            System.out.println(Aula);
        }
    }
}
