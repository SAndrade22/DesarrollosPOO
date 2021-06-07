/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ClienteControlador;
import controlador.VehiculoControlador;
import java.util.Scanner;
import modelo.Cliente;
import modelo.Vehiculo;

/**
 *
 * @author diego
 */
public class VehiculoVista {

    private VehiculoControlador vehiculoControlador;
    private ClienteControlador clienteControlador;
    private Scanner teclado;

    public VehiculoVista(ClienteControlador clienteControlador) {
        this.clienteControlador = clienteControlador;
        vehiculoControlador = new VehiculoControlador();
        teclado = new Scanner(System.in);
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("Gestión de Vehiculos");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Imprimir");
            System.out.println("6. Salir");
            opcion  = teclado.nextInt();
            switch(opcion){
                case 1: this.crear(); break;
                case 2: this.actualizar(); break;
                case 3: this.buscar(); break;
                case 4: this.eliminar(); break;
                case 5: this.imprimir(); break;
            }
        } while (opcion < 6);
    }
    public void crear(){
        System.out.println("Crear - Ingrese los datos:");
        System.out.println("Placa");
        String placa = teclado.next();
        System.out.println("Marca");
        String marca = teclado.next();
        System.out.println("Modelo");
        String modelo = teclado.next();
        boolean resultado = vehiculoControlador.crear(placa, marca, modelo, clienteControlador.getSeleccionado());
        System.out.println("Creado = " + resultado);
    }
    public void actualizar(){
        System.out.println("Actualizar - Ingrese los datos: ");
        System.out.println("Placa");
        String placa = teclado.next();
        System.out.println("Marca");
        String marca = teclado.next();
        System.out.println("Modelo");
        String modelo = teclado.next();
        boolean resultado = vehiculoControlador.actualizar(placa, marca, modelo);
        System.out.println("Actualizado = " + resultado);
    }
    public Vehiculo buscar(){
        System.out.println("Ingresar la placa");
        String placa = teclado.next();
        Vehiculo vehiculo = vehiculoControlador.buscar(placa);
        System.out.println(vehiculo);
        return vehiculo;
    }
    public void eliminar(){
        System.out.println("Ingresar la placa");
        String placa = teclado.next();
        boolean resultado = vehiculoControlador.eliminar(placa);
    }
    public void imprimir(){
        for (Vehiculo vehiculo : vehiculoControlador.getListaVehiculo()) {
            System.out.println(vehiculo);
        }
    }
    public void asignarSeleccionado(Vehiculo vehiculo){
        vehiculoControlador.setSeleccionado(vehiculo);
    }

    public VehiculoControlador getVehiculoControlador() {
        return vehiculoControlador;
    }

    public void setVehiculoControlador(VehiculoControlador vehiculoControlador) {
        this.vehiculoControlador = vehiculoControlador;
    }

    public ClienteControlador getClienteControlador() {
        return clienteControlador;
    }

    public void setClienteControlador(ClienteControlador clienteControlador) {
        this.clienteControlador = clienteControlador;
    }
    
}
