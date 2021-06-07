/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author diego
 */
public class Servicio {
    private long id;
    private Date horaEntrada;
    private Date horaSalida;
    private double valorPagar;
    private Vehiculo vehiculo;

    public Servicio(long id, Date horaEntrada, Date horaSalida, double valorPagar) {
        this.id = id;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.valorPagar = valorPagar;
    }

    public Servicio(long id, Date horaEntrada, Date horaSalida, double valorPagar, Vehiculo vehiculo) {
        this.id = id;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.valorPagar = valorPagar;
        this.vehiculo = vehiculo;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Servicio{" + "id=" + id + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", valorPagar=" + valorPagar + " -> Vehiculo : " + vehiculo + '}';
    }
 
}
