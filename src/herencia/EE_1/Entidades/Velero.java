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
public final class Velero extends Barco {
    private int numeroMastiles;

    public Velero() {
    }

    public Velero(int numeroMastiles, String matricula, double slora, LocalDate anioFabricacion) {
        super(matricula, slora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    
}
