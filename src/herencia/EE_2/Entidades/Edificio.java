/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_2.Entidades;

/**
 *
 * @author javie
 */
public abstract class Edificio {
    protected double ancho;
    protected double alto;
    protected double largo;
    protected double superficie;
    protected double volumen;

    public Edificio() {
    }
    
    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getLargo() {
        return largo;
    }

    public double getSuperficie() {
        return superficie;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();
}
