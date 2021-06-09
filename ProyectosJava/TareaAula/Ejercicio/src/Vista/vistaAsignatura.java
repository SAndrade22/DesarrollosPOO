/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorAsignatura;
import java.util.Scanner;
import ejercicio.asignatura;
/**
 *
 * @author Usuario
 */
public class vistaAsignatura {
    public Scanner teclado;
    private ControladorAsignatura controladorAsignatura;
    public vistaAsignatura(ControladorAsignatura controladorAsignatura){
        teclado=new Scanner(System.in);
        this.controladorAsignatura=controladorAsignatura;
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
        System.out.println("Ingrese: \n Nombre");
        String Nombre=teclado.next();
        System.out.println("Res: "+ controladorAsignatura.crear(Nombre));
    }
    public void actualizar(){
        System.out.println("Ingrese: \n Nombre");
        String Nombre=teclado.next();
        System.out.println("Res: "+controladorAsignatura.actualizar(0, Nombre));
    }
    public void buscar(){
        System.out.println("Ingrese: \n id");
        long id=teclado.nextLong();
        System.out.println(controladorAsignatura.buscar(id));
    }
    public void eliminar(){
        this.buscar();
        System.out.println("Res: "+controladorAsignatura.eliminar(controladorAsignatura.getSeleccionado().getId()));
    }
        public void listar(){
        for(asignatura Asignatura : controladorAsignatura.getListaAsignatura()){
            
            System.out.println(Asignatura);
        }
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public ControladorAsignatura getControladorAsignatura() {
        return controladorAsignatura;
    }

    public void setControladorAsignatura(ControladorAsignatura controladorAsignatura) {
        this.controladorAsignatura = controladorAsignatura;
    }

    
}
