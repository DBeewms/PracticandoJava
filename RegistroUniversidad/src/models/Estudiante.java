/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Estudiante {

    private String ID;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private Sexo sexo;
    private String correo;
    private LocalDate fechaNac;
    private Carrera carrera;
    private LocalDate fechaIngreso;

    public Estudiante() {
    }

    public Estudiante(String ID, String nombre1, String nombre2, String apellido1, String apellido2, Sexo sexo, String correo, LocalDate fechaNac, Carrera carrera, LocalDate fechaIngreso) {
        this.ID = ID;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.sexo = sexo;
        this.correo = correo;
        this.fechaNac = fechaNac;
        this.carrera = carrera;
        this.fechaIngreso = fechaIngreso;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        if (LocalDate.now().getYear() - fechaNac.getYear() < 15) {
            JOptionPane.showMessageDialog(null,
                    "La edad minima de registro es 15 años",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        } this.fechaNac = fechaNac;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        if (ChronoUnit.DAYS.between(LocalDate.now(), fechaIngreso) > 0) {
            JOptionPane.showMessageDialog(null,
                    "Fecha de ingreso invalida", 
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        } this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Estudiante: "
                + "\nID: " + ID
                + "\nPrimer nombre: " + nombre1
                + "\nSegunda nombre: " + nombre2
                + "\nPrimer apellido: " + apellido1
                + "\nSegundo apellido: " + apellido2
                + "\nSexo: " + sexo
                + "\nFecha de nacimiento: " + fechaNac
                + "\nCorreo: " + correo
                + "\nCarrera: " + carrera
                + "\nfechaIngreso: " + fechaIngreso
                + "\n";
    }
}
