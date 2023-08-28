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
public abstract class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        
        
        if (letra == 'A'
            || letra == 'B'
            || letra == 'C'
            || letra == 'D'
            || letra == 'E') {
            
            return letra;
            
        } else {
            return 'F';
        }
    }
    
    public String comprobarColor(String color) {
        color = color.toLowerCase();
        
        if (color.equals("negro")
            || color.equals("rojo")
            || color.equals("azul")
            || color.equals("gris")) {
            
            return color;
            
        } else {
            return "blanco";
        }
    }
    
    public void crearElectrodomestico() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresa el precio del electrodomestico");
        this.precio = 1000d;
        scan.nextLine();
        
        System.out.println("Ingresa el color del electrodomestico");
        this.color = comprobarColor(scan.nextLine());
       
        System.out.println("Ingresa el consumo energético (A - F) del electrodomestico");
        this.consumoEnergetico = comprobarConsumoEnergetico(scan.next().charAt(0));
        
        System.out.println("Ingresa el peso del electrodomestico");
        this.peso = scan.nextDouble();
        scan.nextLine();
        
    }
    
    public void precioFinal() {
        
        switch(this.consumoEnergetico) {
            case 'A':
                this.precio += 1000d;
                break;
            case 'B':
                this.precio += 800d;
                break;
            case 'C':
                this.precio += 600d;
                break;
            case 'D':
                this.precio += 500d;
                break;
            case 'E':
                this.precio += 300d;
                break;
            case 'F':
                this.precio += 100d;
                break;
        }
        
        if (this.peso >= 1 && this.peso <= 19) {
            this.precio += 100d;
            
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.precio += 500d;
            
        } else if (this.peso >= 50 && this.peso <= 79) {
            this.precio += 800d;
            
        } else if (this.peso >= 80 ) {
            this.precio += 1000d;
            
        } else {
            System.out.println("El peso no puede ser menor a 1 kg");
        }
    }
    
}
