/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import herencia.EP_2.Electrodomestico;
import herencia.EP_2.Lavadora;
import herencia.EP_2.Televisor;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author javie
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>(Arrays.asList(
                new Lavadora(25, 1000, "negro", 'A', 40d),
                new Televisor(30, false, 1000, "rojo", 'B', 30d),
                new Lavadora(70, 1000, "gris", 'C', 80d),
                new Televisor(60, true, 1000, "azul", 'D', 50d)
        ));
        
        // Mostrar precio de cada electrodomésticos
        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal();
            
            System.out.println("-------------------------------");
            System.out.println(electrodomestico.toString());
        }
        
        System.out.println("-------------------------------\n");
        
        // Mostrar suma de precio de electrodomésticos
        System.out.println("Costo total: " + electrodomesticos
                .stream()
                .mapToDouble(x -> x.getPrecio())
                .sum() + " USD"
        );
        
        // Mostrar suma de precio de Lavadoras
        System.out.println("Costo Total Lavadoras: " + electrodomesticos.
                stream().filter(x -> x instanceof Lavadora)
                .mapToDouble(x -> x.getPrecio())
                .sum() + " USD"
        );

        // Mostrar suma de precio de Televisores
        System.out.println("Costo Total Televisores: " + electrodomesticos
                .stream()
                .filter(x -> x instanceof Televisor)
                .mapToDouble(x -> x.getPrecio())
                .sum() + " USD"
        );

    }
    
}
