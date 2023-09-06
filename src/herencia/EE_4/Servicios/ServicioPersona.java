/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_4.Servicios;

import herencia.EE_4.Entidades.Empleado;
import herencia.EE_4.Entidades.Estudiante;
import herencia.EE_4.Entidades.Persona;
import herencia.EE_4.Entidades.Personal;
import herencia.EE_4.Entidades.Profesor;
import herencia.EE_4.Enums.Departamento;
import herencia.EE_4.Enums.EstadoCivil;
import herencia.EE_4.Enums.Seccion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioPersona {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public void cambioEstadoCivil(Persona p) {
        if (p.getEstadoCivil() == EstadoCivil.CASADO) p.setEstadoCivil(EstadoCivil.SOLTERO);
        else p.setEstadoCivil(EstadoCivil.CASADO);
    }
    
    public void reasignacionDespacho(Empleado e) {
        System.out.println("El número de despacho actual de "
                + e.getNombre() + " es " + e.getNumeroDespacho()
                + " ¿Qué número le quieres dar?");
        
        int nuevoDespacho = scan.nextInt();
        scan.nextLine();
        
        e.setNumeroDespacho(nuevoDespacho);
    }
    
    public void matricularEstudiante(Estudiante e) {
        System.out.println("¿A qué curso quieres matricular a " + e.getNombre() + "?");
        String curso = scan.nextLine();
        
        e.setCurso(curso);
        
        System.out.println("Se matriculó a " + e.getNombre() + " exitosamente");
    }
    
    public void cambiarDepartamento(Profesor p) {
        System.out.println("El departamento actual del profesor " 
                + p.getNombre() + " es " + p.getDepartamento()
                + " ¿A qué departamento lo quieres cambiar? (ingresa el número correspondiente)");
        
        for (int i = 0; i < Departamento.values().length; i++)
            System.out.println(i + ". " + Departamento.values()[i]);
        
        Departamento dep = Departamento.values()[scan.nextInt()];
        scan.nextLine();
        
        p.setDepartamento(dep);
    }
    
    public void trasladarEmpleado(Personal p) {
        System.out.println("La sección actual del personal " 
                + p.getNombre() + " es " + p.getSeccion()
                + " ¿A qué sección lo quieres cambiar? (ingresa el número correspondiente)");
        
        for (int i = 0; i < Seccion.values().length; i++)
            System.out.println(i + ". " + Seccion.values()[i]);
        
        Seccion seccion = Seccion.values()[scan.nextInt()];
        scan.nextLine();
        
        p.setSeccion(seccion);
    }
    
    public void mostrar(ArrayList<Persona> personas) {
        personas.forEach((persona) -> System.out.println(persona.toString()));
    }
}
