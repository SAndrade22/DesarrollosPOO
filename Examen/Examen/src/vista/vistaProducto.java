/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ControladorProducto;
import java.util.Scanner;
import modelo.Producto;

/**
 *
 * @author Usuario
 */
public class vistaProducto {
    public Scanner teclado;
    private ControladorProducto controladorProducto;
    
    public vistaProducto(ControladorProducto controladorProducto){
        teclado=new Scanner(System.in);
        this.controladorProducto=controladorProducto;
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
        System.out.println("Ingrese: \n Nombre del producto");
        String Nombre=teclado.next();
        System.out.println("Descripcion del producto");
        String descripcion=teclado.next();
        System.out.println("PrecioUnitario");
        double preUnitario=teclado.nextDouble();
        System.out.println("Stock");
        int stock=teclado.nextInt();
        System.err.println("Contiene Iva Si/No: ");
        boolean iva;
        String contieneIva=teclado.next();
        if(contieneIva=="Si"){
            iva=true;
        } else {
            iva=false;
        }
        System.out.println("Res: "+controladorProducto.crear(Nombre, descripcion, preUnitario,  stock, iva));
    }
    public void actualizar(){
        System.out.println("Ingrese: \n Nombre");
        String Nombre=teclado.next();
        System.out.println("Descripcion");
        String descripcion=teclado.next();
        System.out.println("Precio Unitario");
        double PrecioUni=teclado.nextDouble();
        System.out.println("Stock");
        int stock=teclado.nextInt();
        System.out.println("Res: "+controladorProducto.actualizar(Nombre, descripcion, PrecioUni, stock));
    }
    public void buscar(){
        System.out.println("Ingrese: \n Nombre");
        String nombre=teclado.next();
        System.out.println(controladorProducto.buscar(nombre));
    }
    public void eliminar(){
        this.buscar();
        System.out.println("Res: "+controladorProducto.eliminar(controladorProducto.getSeleccionado().getNombre()));
    }
        public void listar(){
        for(Producto prodcuto : controladorProducto.getListaProducto()){
            System.out.println(prodcuto);
        }
    }
}
