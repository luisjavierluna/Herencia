/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_3.Entidades;

import herencia.EE_3.Enums.Gimnasio;

/**
 *
 * @author javie
 */
public final class Hotel5 extends Hotel {
    private int CantidadSalonesConferencia;
    private int CantidadSuites;
    private int CantidadLimosinas;

    public Hotel5() {
    }

    public Hotel5(
            int CantidadSalonesConferencia, 
            int CantidadSuites, 
            int CantidadLimosinas, 
            int cantidadHabitaciones, 
            int numeroCamas, 
            int cantidadPisos, 
            Gimnasio gimnasio, 
            String nombreRestaurante, 
            int capacidadRestaurante, 
            String nombre, 
            String dirección, 
            String localidad, 
            String gerente) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, gimnasio, nombreRestaurante, capacidadRestaurante, nombre, dirección, localidad, gerente);
        this.CantidadSalonesConferencia = CantidadSalonesConferencia;
        this.CantidadSuites = CantidadSuites;
        this.CantidadLimosinas = CantidadLimosinas;
    }

    public int getCantidadSalonesConferencia() {
        return CantidadSalonesConferencia;
    }

    public int getCantidadSuites() {
        return CantidadSuites;
    }

    public int getCantidadLimosinas() {
        return CantidadLimosinas;
    }

    public void setCantidadSalonesConferencia(int CantidadSalonesConferencia) {
        this.CantidadSalonesConferencia = CantidadSalonesConferencia;
    }

    public void setCantidadSuites(int CantidadSuites) {
        this.CantidadSuites = CantidadSuites;
    }

    public void setCantidadLimosinas(int CantidadLimosinas) {
        this.CantidadLimosinas = CantidadLimosinas;
    }
    
}
