/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;
import modelo.Cliente;
import modelo.Empresa;
import modelo.Vehiculo;

/**
 *
 * @author diego
 */
public class VistaGeneral {

    private ClienteVista clienteVista;
    private EmpresaVista empresaVista;
    private VehiculoVista vehiculoVista;
    private ServicioVista servicioVista;
    private Scanner teclado;

    public VistaGeneral() {
        empresaVista = new EmpresaVista();
        clienteVista = new ClienteVista(empresaVista.getEmpresaControlador()); // estoy unificando el controlador de empresa en uno solo
        vehiculoVista = new VehiculoVista(clienteVista.getClienteControlador());
        servicioVista = new ServicioVista(vehiculoVista.getVehiculoControlador());
        teclado = new Scanner(System.in);
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1. Empresa");
            System.out.println("2. Cliente");
            System.out.println("3. Vehiculo");
            System.out.println("4. Servicio");
            System.out.println("5. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: empresaVista.menu(); break;
                case 2: this.cliente(); break;
                case 3: this.vehiculo(); break;
                case 4: this.servicio();break;
            }
        } while (opcion < 5);
    }
    public void cliente() {
        System.out.println("Seleccione una empresa para gestionar los clientes");
        Empresa empresa = empresaVista.buscar();
        if(empresa != null){ 
            empresaVista.asignarSelecionado(empresa);
            clienteVista.menu();
        }else {
            System.out.println("No exite la empresa");
            this.cliente();
        }
    }
    public void vehiculo(){
        System.out.println("Seleccione una propietario para gestionar los vechiculos");
        Cliente cliente = clienteVista.buscar();
        if(cliente != null){ 
            clienteVista.asignarSeleccionado(cliente);
            vehiculoVista.menu();
        }else {
            System.out.println("No exite la empresa");
            this.vehiculo();
        }
    }
    public void servicio(){
        System.out.println("Selecione un vehiculo");
        Vehiculo vehiculo = vehiculoVista.buscar();
        if(vehiculo != null){
            vehiculoVista.asignarSeleccionado(vehiculo);
            servicioVista.menu();
        }else {
            System.out.println("No existe vehiculo");
            this.menu();
        }
    }

}
