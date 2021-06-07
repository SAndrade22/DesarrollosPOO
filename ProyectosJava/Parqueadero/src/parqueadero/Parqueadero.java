/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

/**
 *
 * @author diego
 */

import modelo.Empresa;
import modelo.Cliente;
import vista.ClienteVista;
import vista.VistaGeneral;

public class Parqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaGeneral vistaGeneral = new VistaGeneral();
        vistaGeneral.menu();
        
    }
    
}
