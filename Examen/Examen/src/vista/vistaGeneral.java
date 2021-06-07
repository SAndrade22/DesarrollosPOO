/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ControladorCliente;
import Controlador.ControladorFactura;
import Controlador.ControladorProducto;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class vistaGeneral {
    public Scanner teclado;
    public vistaCliente vistaCliente;
    public ControladorCliente controladorCliente;
    public vistaFactura vistaFactura;
    public ControladorFactura controladorFactura;
    public vistaProducto vistaProducto;
    public ControladorProducto controladorProducto;
    
    public vistaGeneral(){
        teclado = new Scanner(System.in);
        controladorCliente=new ControladorCliente();
        
        controladorFactura=new ControladorFactura();
        controladorProducto=new ControladorProducto();
        vistaCliente=new vistaCliente(controladorCliente);
        
        vistaFactura=new vistaFactura(controladorFactura);
        vistaProducto=new vistaProducto(controladorProducto);
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
