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
public final class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora (){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        
        System.out.println("Ingresa la carga de la lavadora en kilos");
        this.carga = scan.nextInt();
        scan.nextLine();
        
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        
        if (this.carga >= 30) {
            this.precio += 500d;  
        } 
    }

    @Override
    public String toString() {
        return "\nLavadora: \n"
                + "Precio: " + precio + " USD\n"
                + "Color: " + color + "\n"
                + "Consumo Energético: " + consumoEnergetico + "\n"
                + "Peso: " + peso + " kg\n"
                + "Carga: " + carga + " kg\n";
    }

}
