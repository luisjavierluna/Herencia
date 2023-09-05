/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import herencia.EE_3.Entidades.Alojamiento;
import herencia.EE_3.Entidades.Camping;
import herencia.EE_3.Entidades.Hotel;
import herencia.EE_3.Entidades.Hotel5;
import herencia.EE_3.Entidades.Residencia;
import herencia.EE_3.Enums.Gimnasio;
import herencia.EE_3.Servicios.ServicioAlojamiento;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author javie
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAlojamiento sa = new ServicioAlojamiento();
        
        sa.menu();
        
    }
}
