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
public class Rectangulo extends Figura implements calculosFormas{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        this.area = base * altura;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = (base + altura) * 2;
    }

    @Override
    public String toString() {
        return "Rectangulo:\n"
                + "Área: " + this.area + "\n"
                + "Perimetro: " + this.perimetro + "\n";
    }

    
}
