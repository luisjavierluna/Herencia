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
public final class Motor extends Barco{
    private int potenciaCV;

    public Motor() {
    }

    public Motor(int potenciaCV, String matricula, double slora, LocalDate anioFabricacion) {
        super(matricula, slora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
}
