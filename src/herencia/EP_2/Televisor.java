/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.EP_2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public final class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }
    
    public void crearTelevisor() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        
        System.out.println("Ingresa la resolución del televisor");
        this.resolucion = scan.nextInt();
        scan.nextLine();
        
        System.out.println("¿El televisor cuenta con sintonizador TDT?");
        this.TDT = scan.nextBoolean();
        scan.nextLine();
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        
        if (this.resolucion > 40) {
            this.precio *= 1.3;
        }
        
        if (TDT) {
            this.precio += 500d;
        }
    }
    
    @Override
    public String toString() {
        return "\nTelevisor: \n"
                + "Precio: " + precio + " USD \n"
                + "Color: " + color + "\n"
                + "Consumo Energético: " + consumoEnergetico + "\n"
                + "Peso: " + peso + "\n"
                + "Resolución: " + resolucion + " Pulgadas \n"
                + "Sintonizador TDT: " + (TDT == true ? "Si" : "No") + "\n";
    }
}
