/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import herencia.EE_4.Entidades.Empleado;
import herencia.EE_4.Entidades.Estudiante;
import herencia.EE_4.Entidades.Persona;
import herencia.EE_4.Entidades.Personal;
import herencia.EE_4.Entidades.Profesor;
import herencia.EE_4.Enums.Departamento;
import herencia.EE_4.Enums.EstadoCivil;
import herencia.EE_4.Enums.Seccion;
import herencia.EE_4.Servicios.ServicioPersona;
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
        ServicioPersona sp = new ServicioPersona();
        
        ArrayList<Persona> personas = new ArrayList<>(Arrays.asList(
            new Empleado(LocalDate.of(2000, 1, 1), 1111, "Nombre1", "Apellido1", 1111, EstadoCivil.SOLTERO),
            new Estudiante("Nombre 2", "Apellido 2", 2222, EstadoCivil.CASADO),
            new Profesor(Departamento.ARQUITECTURA, "Luis", "Luna", 3333, EstadoCivil.CASADO),
            new Personal(Seccion.BIBLIOTECA, "Javier", "Arellano", 4444, EstadoCivil.SOLTERO)
        ));
        
        sp.mostrar(personas);
        
        sp.cambioEstadoCivil(personas.get(0));
        sp.reasignacionDespacho((Empleado) personas.get(0));
        sp.matricularEstudiante((Estudiante) personas.get(1));
        sp.cambiarDepartamento((Profesor) personas.get(2));
        sp.trasladarEmpleado((Personal) personas.get(3));
        
        System.out.println("----------------------------------");
        
        sp.mostrar(personas);
        
    }
}
