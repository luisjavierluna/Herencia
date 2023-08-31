/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import herencia.EE_2.Entidades.Edificio;
import herencia.EE_2.Entidades.EdificioDeOficinas;
import herencia.EE_2.Entidades.Polideportivo;
import herencia.EE_2.Enums.TipoInstalacion;
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
        ArrayList<Edificio> edificios = new ArrayList<>(Arrays.asList(
                new EdificioDeOficinas(2, 20, 2, 2, 3, 4),
                new EdificioDeOficinas(3, 30, 6, 4, 5, 6),
                new Polideportivo("Poli 1", TipoInstalacion.ABIERTO, 10, 20, 30),
                new Polideportivo("Poli 2", TipoInstalacion.TECHADO, 20, 30, 40)
        ));
        
        int abiertos = 0;
        int techados = 0;
        
        for (Edificio edificio : edificios) {
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            
            System.out.println(edificio.toString());
            if (edificio instanceof Polideportivo) {

                if (((Polideportivo) edificio).getTipoInstalacion() == TipoInstalacion.ABIERTO) {
                    abiertos++;
                } else if (((Polideportivo) edificio).getTipoInstalacion() == TipoInstalacion.TECHADO) {
                    techados++;
                }
                
            } else if (edificio instanceof EdificioDeOficinas) {
                ((EdificioDeOficinas) edificio).cantPersonas();
            }
        }

        System.out.println("\nPolideportivos abiertos: " + abiertos + "\n" + "Polideportivos techados: " + techados);
        
    }
    
}
