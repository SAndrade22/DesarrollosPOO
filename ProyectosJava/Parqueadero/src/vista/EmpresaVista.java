/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.EmpresaControlador;
import java.util.Scanner;
import modelo.Cliente;
import modelo.Empresa;

/**
 *
 * @author diego
 */
public class EmpresaVista {

    private EmpresaControlador empresaControlador;
    private Scanner teclado;

    public EmpresaVista() {
        empresaControlador = new EmpresaControlador();
        teclado = new Scanner(System.in);
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n Gestion Empresa");
            System.out.println("1. Crear");
            System.out.println("2. Actaulizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: this.crear(); break;
                case 2: this.actualizar();break;
                case 3: this.buscar();break;
                case 4: this.eliminar();break;
                case 5: this.imprimir(); break;  
            }
        } while (opcion < 6);
    }
    public void crear(){
        System.out.println("Ingresar los siguientes datos:");
        System.out.println("Id");
        long id = teclado.nextLong();
        System.out.println("Nombre");
        String nombre = teclado.next();
        boolean resultado = empresaControlador.crear(id, nombre);
        System.out.println("Creado = " + resultado);
    }
    public void actualizar(){
        System.out.println("Nombre");
        String nombreAnterior = teclado.next();
        System.out.println("Nombre Nuevo");
        String nombre = teclado.next();
        boolean resultado = empresaControlador.actualizar(nombreAnterior, nombre);
        System.out.println("Actualizado = " + resultado);
    }
    public Empresa buscar(){
        System.out.println("Nombre");
        String nombre = teclado.next();
        Empresa empresa = empresaControlador.buscar(nombre);
        //empresaControlador.setSeleccionado(empresa);
        return empresa;
    }
    public void asignarSelecionado(Empresa empresa){
        empresaControlador.setSeleccionado(empresa);
    }
    public void eliminar(){
        System.out.println("Nombre");
        String nombre = teclado.next();
        boolean resultado = empresaControlador.eliminar(nombre);
        System.out.println("Eliminado = " + resultado);
    }
    public void imprimir(){ 
        for (Empresa empresa : empresaControlador.getListaEmpresa()) {
            System.out.println(empresa);
            this.imprimirClientes(empresa);
        }
    }
    public void imprimirClientes(Empresa empresa){
        for (Cliente cliente : empresa.getListaCliente()) {
            System.out.println(cliente);
        }
    }

    public EmpresaControlador getEmpresaControlador() {
        return empresaControlador;
    }

    public void setEmpresaControlador(EmpresaControlador empresaControlador) {
        this.empresaControlador = empresaControlador;
    }
    
    
}
