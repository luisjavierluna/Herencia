/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_4.Entidades;

import herencia.EE_4.Enums.EstadoCivil;

/**
 *
 * @author javie
 */
public class Estudiante extends Persona {
    private String curso;

    public Estudiante() {
    }

    public Estudiante(
            String nombre, 
            String apellido, 
            int ID, 
            EstadoCivil estadoCivil) {
        super(nombre, apellido, ID, estadoCivil);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + " Estudiante{" + "curso=" + curso + "}\n";
    }
    
    
}
