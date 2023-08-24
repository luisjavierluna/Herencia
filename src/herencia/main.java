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

/**
 *
 * @author javie
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaración del objeto Perro
        Animal perro1 = new Perro("Stich", "Humanos", 15, "Doberman");
        perro1.Alimentarse();
        
        // Declaración de otro objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();
        
        // Declaración del objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.Alimentarse();
        
        // Declaración del objeto Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
        
    }
    
}
