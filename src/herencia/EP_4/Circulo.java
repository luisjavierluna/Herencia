package herencia.EP_4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import herencia.EP_4.Figura;
import herencia.EP_4.Interfaces.calculosFormas;

/**
 *
 * @author javie
 */
public class Circulo extends Figura implements calculosFormas{
    private double radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    @Override
    public void calcularArea() {
        this.area = PI * (Math.pow(radio, 2));
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = PI * diametro;
    }

    @Override
    public String toString() {
        return "Circulo:\n"
                + "Área: " + this.area + "\n"
                + "Perimetro: " + this.perimetro + "\n";
    }    
}
