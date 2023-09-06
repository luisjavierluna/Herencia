/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_4.Entidades;

import herencia.EE_4.Enums.Departamento;
import herencia.EE_4.Enums.EstadoCivil;

/**
 *
 * @author javie
 */
public class Profesor extends Persona {
    private Departamento departamento;

    public Profesor() {
    }

    public Profesor(
            Departamento departamento, 
            String nombre, 
            String apellido, 
            int ID, 
            EstadoCivil estadoCivil) {
        super(nombre, apellido, ID, estadoCivil);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + " Profesor{" + "departamento=" + departamento + "}\n";
    }
    
    
}
