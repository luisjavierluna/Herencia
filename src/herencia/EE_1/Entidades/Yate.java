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
public final class Yate extends Barco {
    private int potenciaCV;
    private int camarotes;

    public Yate() {
    }
    
    public Yate(int potenciaCV, int camarotes, String matricula, double slora, LocalDate anioFabricacion) {
        super(matricula, slora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.camarotes = camarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
}
