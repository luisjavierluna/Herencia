/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_4.Entidades;

import herencia.EE_4.Enums.EstadoCivil;
import java.time.LocalDate;

/**
 *
 * @author javie
 */
public class Empleado extends Persona{
    private LocalDate anioIncorporacion;
    private int numeroDespacho;

    public Empleado() {
    }

    public Empleado(
            LocalDate anioIncorporacion, 
            int numeroDespacho, 
            String nombre, 
            String apellido, 
            int ID, 
            EstadoCivil estadoCivil) {
        super(nombre, apellido, ID, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public LocalDate getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setAnioIncorporacion(LocalDate anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + " Empleado{" + "anioIncorporacion=" + anioIncorporacion + ", numeroDespacho=" + numeroDespacho + "}\n";
    }
    
}
