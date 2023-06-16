/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjavapersona;

/**
 *
 * @author Diego
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private double tamaño;
    private double peso;

    public Persona(String nombre, String apellido, int edad, double tamaño, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tamaño = tamaño;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "El nombre es: " + nombre + "\nEl apellido es: " + apellido + "\nLa edad es: " + edad + "\nEl tama\u00f1o es: " + tamaño + "\nEl peso es: " + peso;
    }
    
}
