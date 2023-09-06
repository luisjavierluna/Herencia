/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_4.Entidades;

import herencia.EE_4.Enums.EstadoCivil;
import herencia.EE_4.Enums.Seccion;

/**
 *
 * @author javie
 */
public class Personal extends Persona {
    private Seccion seccion;

    public Personal() {
    }

    public Personal(
            Seccion seccion, 
            String nombre, 
            String apellido, 
            int ID, 
            EstadoCivil estadoCivil) {
        super(nombre, apellido, ID, estadoCivil);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + " Personal{" + "seccion=" + seccion + "}\n";
    }
    
    
}
