/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_1.Entidades;

import java.time.LocalDate;

/**
 *
 * @author javie
 */
public abstract class Barco {
    private String matricula;
    private double slora;
    private LocalDate anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, double slora, LocalDate anioFabricacion) {
        this.matricula = matricula;
        this.slora = slora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSlora() {
        return slora;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSlora(double slora) {
        this.slora = slora;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
}
