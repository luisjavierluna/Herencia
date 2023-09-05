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
public final class Camping extends Extraotelero{
    private int capacidadMaxCarpas;
    private int capacidadBanios;
    private boolean tieneRestaurante;

    public Camping() {
    }

    public Camping(
            int capacidadMaxCarpas, 
            int capacidadBanios, 
            boolean tieneRestaurante, 
            boolean esPrivado, 
            int cantidadMetros, 
            String nombre, 
            String dirección, 
            String localidad, 
            String gerente) {
        super(esPrivado, cantidadMetros, nombre, dirección, localidad, gerente);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.capacidadBanios = capacidadBanios;
        this.tieneRestaurante = tieneRestaurante;
    }

    public int getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public int getCapacidadBanios() {
        return capacidadBanios;
    }

    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setCapacidadMaxCarpas(int capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public void setCapacidadBanios(int capacidadBanios) {
        this.capacidadBanios = capacidadBanios;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }
    
}
