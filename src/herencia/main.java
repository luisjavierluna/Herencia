/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import herencia.EE_1.Entidades.Alquiler;
import herencia.EE_1.Entidades.Barco;
import herencia.EE_1.Entidades.Motor;
import herencia.EE_1.Entidades.Velero;
import herencia.EE_1.Entidades.Yate;
import herencia.EE_1.Servicios.ServicioAlquiler;
import java.time.LocalDate;
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
        ServicioAlquiler sa = new ServicioAlquiler();
        
        ArrayList<Barco> barcos = new ArrayList<>(Arrays.asList(
                new Velero(100, "111", 10d, LocalDate.of(2000, 1, 1)),
                new Motor(200, "222", 20d, LocalDate.of(2010, 1, 1)),
                new Yate(300, 100, "333", 30d, LocalDate.of(2020, 1, 1))        
        ));
        
        ArrayList<Alquiler> alquileres = new ArrayList<>(Arrays.asList(
                new Alquiler ("Alquiler 1", "AAA", LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 20), 1, barcos.get(0)),
                new Alquiler ("Alquiler 1", "AAA", LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 20), 1, barcos.get(1)),
                new Alquiler ("Alquiler 1", "AAA", LocalDate.of(2023, 8, 1), LocalDate.of(2023, 9, 20), 1, barcos.get(2))
        ));
        
        alquileres.forEach(alquiler -> {
            System.out.println(
                sa.calcularAlquiler(alquiler)
                    + " USD"
            );
        });

    }
    
}
