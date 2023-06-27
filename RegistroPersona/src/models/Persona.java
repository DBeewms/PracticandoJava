/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Carlos Talavera
 */
public class Persona {

    private String nombre;
    private String apellido;
    private LocalDate fNac;
    private Sexo sex;

    public Persona() {
    }

    public Persona(String nombre, String apellido, LocalDate fNac, Sexo sex) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNac = fNac;
        this.sex = sex;
    }

    public Sexo getSex() {
        return sex;
    }

    public void setSex(Sexo sex) {
        this.sex = sex;
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

    public LocalDate getfNac() {
        return fNac;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }

    public int getAge()

    {
        //return LocalDate.now().getYear()-this.fNac.getYear();
       return (int) ChronoUnit.YEARS.between(this.fNac,LocalDate.now());

    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNac=" + fNac + ", sex=" + sex + '}';
    }

}
