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
public class Perro extends Animal {

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void Alimentarse() {
        System.out.println(nombre + " es un perro " + raza + " de " + edad + " años y se alimenta de " + alimento);
    }
    
}
