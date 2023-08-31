/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_2.Entidades;

import herencia.EE_2.Enums.TipoInstalacion;

/**
 *
 * @author javie
 */
public final class Polideportivo extends Edificio{
    private String nombre;
    private TipoInstalacion tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, TipoInstalacion tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoInstalacion getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInstalacion(TipoInstalacion tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }
    
    @Override
    public void calcularSuperficie() {
        double perimetroBase = (largo + ancho) * 2;
        double areaBase = largo * ancho;
        
        superficie = (perimetroBase * alto) + (2 * areaBase);
    }

    @Override
    public void calcularVolumen() {
        volumen = largo * ancho * alto;
    }

    @Override
    public String toString() {
        return "\n" + nombre + ": \n"
                + "Superficie: " + superficie + "\n"
                + "Volumen: " + volumen;
    }
    
    
}
