/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.util.Scanner;
import Controlador.ControladorCliente;
import Controlador.ControladorCliente;
import Controlador.ControladorFactura;
import Controlador.ControladorProducto;
import modelo.Cliente;
import modelo.Producto;
import modelo.Factura;
import vista.vistaCliente;
import vista.vistaProducto;
import vista.vistaFactura;
/**
 *
 * @author Usuario
 */
public class Examen {

    public Scanner teclado;
    public vistaCliente vistaCliente;
    public vistaProducto vistaProducto;
    public vistaFactura vistaFactura;
    public ControladorCliente controladorCliente;
    public ControladorProducto controladorProducto;
    public ControladorFactura controladorFactura;
    
    
    /*public Factura() 
    {
        teclado = new Scanner(System.in);
        controladorCliente = new ControladorCliente();
        controladorProducto = new ControladorProducto();
        controladorFactura = new ControladorFactura();
        
        vistaCliente = new vistaCliente(controladorCliente);
        vistaProducto = new vistaProducto(controladorProducto);
        vistaFactura = new vistaFactura(controladorFactura);          
    }*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        int opcion=0;        
        do
        {
            System.out.println("1. Clientes \n 2. Productos \n 3. Facturas \n 4. Salir");
            opcion=teclado.nextInt();
            switch(opcion)
            {
                case 1:
                    vistaCliente vistaCl = null;
                    vistaCl.menu();
                    break;
                case 2:
                    vistaProducto vistaPr = null;
                    vistaPr.menu();
                    break;
                case 3:
                    vistaFactura vistaFa = null;
                    vistaFa.menu();
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }while(true);
        
        
        
    }
    
}
