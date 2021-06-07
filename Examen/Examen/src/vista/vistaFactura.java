/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ControladorFactura;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import modelo.Factura;
import Controlador.ControladorCliente;
import Controlador.ControladorProducto;
import modelo.Cliente;
import modelo.Producto;

public class vistaFactura {
    public Scanner teclado;
    private ControladorFactura controladorFactura;
    
    public vistaFactura(ControladorFactura controladorFactura){
        teclado=new Scanner(System.in);
        this.controladorFactura=controladorFactura;
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
    public void crear(){
        System.out.println("Ingrese: \n Numero de Cedula");
        String cedula=teclado.next();
        Cliente cliente;
        ControladorCliente controlador = null;
        cliente = controlador.buscar(cedula);
        System.out.println("Producto");
        String nombreProducto=teclado.next();
        Producto producto;
        ControladorProducto productoControlador = null;
        producto=productoControlador.buscar(nombreProducto);
        System.out.println("Cantidad");
        int cantidad=teclado.nextInt();
        System.out.println("Valor");
        double valor=teclado.nextDouble();
        System.out.println("Fecha");
        String fecha=teclado.next();
        
        
        System.out.println("Res: "+ controladorFactura.crear(0,cliente, producto,cantidad,valor, fecha));
    }
    public void actualizar(){
        System.out.println("Ingrese: \n Producto");
        String nombreProducto=teclado.next();
        Producto producto;
        ControladorProducto productoControlador = null;
        producto=productoControlador.buscar(nombreProducto);
        System.out.println("Cantidad");
        int cantidad=teclado.nextInt();
        System.out.println("Valor");
        double valor=teclado.nextDouble();
        
        System.out.println("Res: "+controladorFactura.actualizar(0, producto,cantidad,valor));
    }
    public void buscar(){
        System.out.println("Ingrese: \n Numero");
        int numero=teclado.nextInt();
        System.out.println(controladorFactura.buscar(numero));
    }
    public void eliminar(){
        this.buscar();
        System.out.println("Res: "+controladorFactura.eliminar(controladorFactura.getSeleccionado().getNumero()));
    }
        public void listar(){
        for(Factura factura : controladorFactura.getListaFactura()){
            System.out.println(factura);
        }
    }
}
