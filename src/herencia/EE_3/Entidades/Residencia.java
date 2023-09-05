/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_3.Entidades;

/**
 *
 * @author javie
 */
public final class Residencia extends Extraotelero{
    private int cantidadHabitaciones;
    private boolean tieneDescuentosAGremios;
    private boolean tieneCampoDeportivo;

    public Residencia() {
    }

    public Residencia(
            int cantidadHabitaciones, 
            boolean tieneDescuentosAGremios, 
            boolean tieneCampoDeportivo, 
            boolean esPrivado, 
            int cantidadMetros, 
            String nombre, 
            String dirección, 
            String localidad, 
            String gerente) {
        super(esPrivado, cantidadMetros, nombre, dirección, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.tieneDescuentosAGremios = tieneDescuentosAGremios;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public boolean isTieneDescuentosAGremios() {
        return tieneDescuentosAGremios;
    }

    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public void setTieneDescuentosAGremios(boolean tieneDescuentosAGremios) {
        this.tieneDescuentosAGremios = tieneDescuentosAGremios;
    }

    public void setTieneCampoDeportivo(boolean tieneCampoDeportivo) {
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }
    
    
}
