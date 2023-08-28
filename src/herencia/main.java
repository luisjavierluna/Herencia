/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import herencia.EP_1.Animal;
import herencia.EP_1.Caballo;
import herencia.EP_1.Gato;
import herencia.EP_1.Perro;
import herencia.EP_2.Lavadora;
import herencia.EP_2.Televisor;

/**
 *
 * @author javie
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        lavadora.precioFinal();
        System.out.println(lavadora);
        
        System.out.println("--------------------------------");
        
        Televisor tv = new Televisor();
        tv.crearTelevisor();
        tv.precioFinal();
        System.out.println(tv);
        
    }
    
}
