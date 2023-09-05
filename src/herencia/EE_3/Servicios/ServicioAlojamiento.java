/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EE_3.Servicios;

import herencia.EE_3.Entidades.Alojamiento;
import herencia.EE_3.Entidades.Camping;
import herencia.EE_3.Entidades.Hotel;
import herencia.EE_3.Entidades.Hotel5;
import herencia.EE_3.Entidades.Residencia;
import herencia.EE_3.Enums.Gimnasio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioAlojamiento {
    
    ArrayList<Alojamiento> alojamientos = new ArrayList<>(Arrays.asList(    
            new Hotel(2, 2, 2, Gimnasio.A, "B", 20, "BBBBB", "BBBBB", "BBBBB", "BBBBB"),
            new Hotel5(3, 3, 3, 3, 3, 3, Gimnasio.B, "C", 30, "CCCCC", "CCCCC", "CCCCC", "CCCCC"),
            new Camping(4, 4, true, true, 4, "DDDDD", "DDDDD", "DDDDD", "DDDDD"),
            new Camping(5, 5, false, false, 5, "FFFFF", "FFFFF", "FFFFF", "FFFFF"),
            new Residencia(6, true, true, true, 6, "GGGGG", "GGGGG", "GGGGG", "GGGGG"),
            new Residencia(7, false, false, false, 7, "HHHHH", "HHHHH", "HHHHH", "HHHHH"),
            new Hotel(8, 8, 8, Gimnasio.B, "I", 80, "IIIII", "IIIII", "IIIII", "IIIII"),
            new Hotel5(9, 9, 9, 9, 9, 9, Gimnasio.A, "J", 90, "JJJJJ", "JJJJJ", "JJJJJ", "JJJJJ")
        ));
    
    public double calcularPrecioHabitacion(Hotel hotel) {
        double agregadoRestaurante = calcularAgregadoRestaurante(hotel.getCapacidadRestaurante());
        double agregadoGimnasio = calcularAgregadoGimnasio(hotel.getGimnasio());
        double agregadoLimosinas;
        
        if (hotel instanceof Hotel5) agregadoLimosinas = ((Hotel5) hotel).getCantidadLimosinas() * 15;
        else agregadoLimosinas = 0;

        double precioHabitacion = 50
                + ((10 * hotel.getCapacidadRestaurante())
                + agregadoRestaurante
                + agregadoGimnasio
                + agregadoLimosinas);

        hotel.setPrecioHabitacion(precioHabitacion);
        return hotel.getPrecioHabitacion();
    }
    
    private double calcularAgregadoRestaurante(int capacidadRestaurante) {
        if (capacidadRestaurante < 30) return 10d;
        else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) return 30d;
        else return 50d;
    }
    
    private double calcularAgregadoGimnasio(Gimnasio tipoGimnasio) {
        if (tipoGimnasio == Gimnasio.A) return 50d;
        else return 30d;
    }
    
    public void menu() {
        Scanner scan = new Scanner(System.in);
        char eleccion;
        boolean salir = false;

        do {
            
            System.out.println(
                    "¿Qué acción quieres realizar? \n"
                    + "A. Mostrar todos los Alojamientos \n"
                    + "B. Mostrar todos los Hoteles \n"
                    + "C. Mostrar todos los Campings con Restaurante \n"
                    + "D. Mostrar todas las Residencias con Descuentos \n"
                    + "F. Salir del Menú \n");
            
            eleccion = scan.next().charAt(0);

            eleccion = Character.toUpperCase(eleccion);
            
            switch (eleccion) {
                case 'A':
                    mostrarTodosAlojamientos();
                    break;
                case 'B':
                    mostrarHoteles();
                    break;
                case 'C':
                    mostrarCampingRestaurante();
                    break;
                case 'D':
                    mostrarResidenciasDescuento();
                    break;
                case 'F':
                    System.out.println("Saliste del programa");
                    salir = true;
                    break;
                default:
                    System.out.println("Elige una opción válida");
            }
        } while (!salir);
    }
    
    public void mostrarTodosAlojamientos() {
        System.out.println("Estos son todos los alojamientos:");
        for (Alojamiento alojamiento : alojamientos) System.out.println(alojamiento.getNombre());
        System.out.println("");
    }
    
    public void mostrarHoteles() {
        System.out.println("Estos son todos los hoteles: ");
        ArrayList<Hotel> hoteles = new ArrayList<>();
        for (Alojamiento hotel : alojamientos) {
            if (hotel instanceof Hotel) {
                calcularPrecioHabitacion((Hotel) hotel);
                hoteles.add((Hotel) hotel);
            }
        }
        
        Collections.sort(hoteles);
        
        for (Hotel hotel : hoteles) System.out.println(hotel.getNombre() + ": " + hotel.getPrecioHabitacion());
        System.out.println("");
    }
    
    public void mostrarCampingRestaurante() {
        System.out.println("Campings con restaurante: ");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;
                
                if (camping.isTieneRestaurante()) {
                    System.out.println(camping.getNombre() + " tiene restaurante:  " + camping.isTieneRestaurante());
                }
            }
        }
        System.out.println("");
    }
    
    public void mostrarResidenciasDescuento() {
        System.out.println("Residencias con descuento: ");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;
                
                if (residencia.isTieneDescuentosAGremios()) {
                    System.out.println(residencia.getNombre() + " tiene descuento:  " + residencia.isTieneDescuentosAGremios());
                }
            }
        }
        System.out.println("");
    }
}
