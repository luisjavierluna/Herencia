/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_3.Entidades;

/**
 *
 * @author javie
 */
public abstract class Alojamiento {
    protected String nombre;
    protected String dirección;
    protected String localidad;
    protected String gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String dirección, String localidad, String gerente) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
}
