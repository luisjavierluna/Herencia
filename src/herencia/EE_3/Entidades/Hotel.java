/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_3.Entidades;

import herencia.EE_3.Enums.Gimnasio;

/**
 *
 * @author javie
 */
public class Hotel extends Alojamiento implements Comparable<Hotel>{
    protected int cantidadHabitaciones;
    protected int numeroCamas;
    protected int cantidadPisos;
    protected Gimnasio gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;
    protected double precioHabitacion;

    public Hotel() {
    }

    public Hotel(
            int cantidadHabitaciones, 
            int numeroCamas, 
            int cantidadPisos, 
            Gimnasio gimnasio, 
            String nombreRestaurante, 
            int capacidadRestaurante,
            String nombre, 
            String dirección, 
            String localidad, 
            String gerente) {
        super(nombre, dirección, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public void setGimnasio(Gimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public int compareTo(Hotel h1) {
        return Double.compare(h1.getPrecioHabitacion(), this.precioHabitacion);
    }

    

}
