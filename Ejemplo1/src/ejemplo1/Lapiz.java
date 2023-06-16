/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author Diego
 */
public class Lapiz {
    private String color;
    private double tamaño;
    private String marca;

    public Lapiz() {
    }

    public Lapiz(String color, double tamaño, String marca) {
        this.color = color;
        this.tamaño = tamaño;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    
    @Override
    public String toString() {
        return "El color del lapiz es: " + color + "\nEl tamaño del lapiz es: " + tamaño + "\nLa marca del lapiz es: " + marca;
    }
    
    
}
