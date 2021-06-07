/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ControladorCliente;
import java.util.Scanner;
import modelo.Cliente;

/**
 *
 * @author Usuario
 */
public class vistaCliente {
    public Scanner teclado;
    private ControladorCliente controladorCliente;
    public vistaCliente(ControladorCliente controladorCliente){
        teclado=new Scanner(System.in);
        this.controladorCliente=controladorCliente;
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
        System.out.println("Cedula");
        String cedula=teclado.next();
        System.out.println("Fiabilidad de Pago");
        double fiabilidad=teclado.nextDouble();
        System.out.println("Res: "+ controladorCliente.crear(Nombre,cedula, fiabilidad));
    }
    public void actualizar(){
        System.out.println("Ingrese: \n Nombre");
        String Nombre=teclado.next();
        System.out.println("Ingrese: \n Cedula");
        String Cedula=teclado.next();
        System.out.println("Fiabilidad de Pago");
        double fiabilidad=teclado.nextDouble();
        System.out.println("Res: "+controladorCliente.actualizar(Nombre, Cedula, fiabilidad));
    }
    public void buscar(){
        System.out.println("Ingrese: \n Cedula");
        String cedula=teclado.next();
        System.out.println(controladorCliente.buscar(cedula));
    }
    public void eliminar(){
        this.buscar();
        System.out.println("Res: "+controladorCliente.eliminar(controladorCliente.getSeleccionado().getCedula()));
    }
        public void listar(){
        for(Cliente cliente : controladorCliente.getListaCliente()){
            
            System.out.println(cliente);
        }
    }
}
