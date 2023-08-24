/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EP_1;

/**
 *
 * @author javie
 */
public class Caballo extends Animal{

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void Alimentarse() {
        System.out.println(nombre + " es un caballo " + raza + " de " + edad + " años y se alimenta de " + alimento);
    }
}
