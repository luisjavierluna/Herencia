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
public abstract class Extraotelero extends Alojamiento{
    private boolean esPrivado;
    private int cantidadMetros;

    public Extraotelero() {
    }

    public Extraotelero(boolean esPrivado, int cantidadMetros, String nombre, String dirección, String localidad, String gerente) {
        super(nombre, dirección, localidad, gerente);
        this.esPrivado = esPrivado;
        this.cantidadMetros = cantidadMetros;
    }

    public boolean isEsPrivado() {
        return esPrivado;
    }

    public int getCantidadMetros() {
        return cantidadMetros;
    }

    public void setEsPrivado(boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public void setCantidadMetros(int cantidadMetros) {
        this.cantidadMetros = cantidadMetros;
    }
    
}
