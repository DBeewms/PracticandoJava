/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import static java.lang.System.out;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Asignatura {

    private String nombre;
    private String codigo;
    private String descripcion;
    private int creditos;

    public Asignatura() {
    }

    public Asignatura(String nombre, String codigo, String descripcion, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.creditos = creditos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        if (creditos < 0) {
            JOptionPane.showMessageDialog(null,
                    "Valor invalido de creditos",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        } this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Asignatura " + nombre + "\tCódigo: " + codigo
                + "\nDescripción: " + descripcion
                + "\nCréditos: " + creditos
                + "\n";
    }
}
