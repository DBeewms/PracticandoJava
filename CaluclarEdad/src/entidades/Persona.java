/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Diego
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int anio;
    private String sexo;

    Calendar fecha = new GregorianCalendar();
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, int dia, int mes, int anio, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.sexo = sexo;
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

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public int calcularEdad(){
//        int anioActual = fecha.get(Calendar.YEAR);
//        int edad = 0;
//        edad = anioActual - anio;
        return fecha.get(Calendar.YEAR)-this.anio;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + "\nFecha de nacimiento: " + dia + "/" + mes + "/" + anio + ", sexo=" + sexo + "\nEdad: " + calcularEdad();
        
        
    }
}
