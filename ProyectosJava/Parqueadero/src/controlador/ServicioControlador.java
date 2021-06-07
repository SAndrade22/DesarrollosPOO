/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import modelo.Servicio;
import modelo.Vehiculo;

/**
 *
 * @author diego
 */
public class ServicioControlador {
    private List<Servicio> datos;
    private Servicio seleccionado;
    public static double COSTO_HORA = 1; // Variable estatica, no se puede cambiar el valor
    
    public ServicioControlador(){
        datos = new ArrayList();
        seleccionado = null;
    }
    public long generarId(){
        if(datos.size() > 0)
            return datos.get(datos.size() -1).getId() + 1;
        return 1;
    }
    public boolean crear(Date horaEntrada, Date horaSalida, double valorPagar, Vehiculo vehiculo){
        Servicio servicio = new Servicio(this.generarId(), horaEntrada, horaSalida, valorPagar, vehiculo);
        vehiculo.getListaServicios().add(servicio);
        return datos.add(servicio);
    }
    public Servicio buscar(Date horaEntrada) {
        for (Servicio dato : datos) {
            if(dato.getHoraEntrada().equals(horaEntrada))
                return dato;
        }
        return null;
    }
    public boolean actualizar(Date horaEntrada, Date horaSalida){
        Servicio servicio = this.buscar(horaEntrada);
        if(servicio != null) {
            int posicion = datos.indexOf(servicio);
            servicio.setHoraSalida(horaSalida);
            long diferenciaSegundos = Math.abs(servicio.getHoraSalida().getTime() - servicio.getHoraEntrada().getTime());
            long minutos = TimeUnit.MINUTES.convert(diferenciaSegundos, TimeUnit.MILLISECONDS);
            double valorPagar = minutos * (this.COSTO_HORA / 60);
            servicio.setValorPagar(valorPagar);
            datos.set(posicion, servicio);
            return true;
        }
        return false;
    }
    public boolean eliminar(Date horaEntrada) {
        Servicio servicio = this.buscar(horaEntrada);
        if(servicio != null){
            servicio.getVehiculo().getListaServicios().remove(servicio);
            return datos.remove(servicio);
        }
        return false;
    }

    public List<Servicio> getDatos() {
        return datos;
    }

    public void setDatos(List<Servicio> datos) {
        this.datos = datos;
    }

    public Servicio getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Servicio seleccionado) {
        this.seleccionado = seleccionado;
    } 
    
}
