/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_1.Servicios;

import herencia.EE_1.Entidades.Alquiler;
import herencia.EE_1.Entidades.Motor;
import herencia.EE_1.Entidades.Velero;
import herencia.EE_1.Entidades.Yate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author javie
 */
public class ServicioAlquiler {
    
    public double calcularAlquiler(Alquiler alquiler) {
        long diasOcupacion = ChronoUnit.DAYS.between(alquiler.getFechaAlquiler(), alquiler.getFechaDevolucion());
        double valorModulo = alquiler.getBarco().getSlora() * 10;
        double calculoAlquiler = diasOcupacion * valorModulo;
        
        if (alquiler.getBarco() instanceof Velero) {
            calculoAlquiler += ((Velero) alquiler.getBarco()).getNumeroMastiles();
        } else if (alquiler.getBarco() instanceof Motor) {
            calculoAlquiler += ((Motor) alquiler.getBarco()).getPotenciaCV();
        } else if (alquiler.getBarco() instanceof Yate) {
            calculoAlquiler += ((Yate) alquiler.getBarco()).getPotenciaCV()
                    + ((Yate) alquiler.getBarco()).getCamarotes();
        }
        
        return calculoAlquiler;
    }
}
