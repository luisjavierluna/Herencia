/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_2.Entidades;

/**
 *
 * @author javie
 */
public final class EdificioDeOficinas extends Edificio{
    private int oficinasPorPiso;
    private int personasPorOficina;
    private int numeroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(
            int oficinasPorPiso, 
            int personasPorOficina, 
            int numeroPisos, 
            double ancho, 
            double alto, 
            double largo) {
        super(ancho, alto, largo);
        this.oficinasPorPiso = oficinasPorPiso;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroPisos;
    }

    public int getOficinasPorPiso() {
        return oficinasPorPiso;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setOficinasPorPiso(int oficinasPorPiso) {
        this.oficinasPorPiso = oficinasPorPiso;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    @Override
    public void calcularSuperficie() {
        double perimetroBase = (largo + ancho) * 2;
        double areaBase = largo * ancho;
        
        superficie = (perimetroBase * alto) + (2 * areaBase);
    }

    @Override
    public void calcularVolumen() {
        volumen = largo * ancho * alto;
    }
    
    public void cantPersonas() {
        int personasPorPiso = personasPorOficina * oficinasPorPiso;
        System.out.println("Personas por piso: " + personasPorPiso);
        
        int cantidadTotalPersonas = personasPorPiso * numeroPisos;
        System.out.println("Cantidad total de personas: " + cantidadTotalPersonas);
    }
    
    @Override
    public String toString() {
        return  "\nEdificio de Oficinas: \n"
                + "Superficie: " + superficie + "\n"
                + "Volumen: " + volumen;
    }
}
