/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Diego
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPub;
    private double precio;

    public Libro() {
    }
    
    public Libro(String titulo, String autor, int añoPub, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPub = añoPub;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPub() {
        return añoPub;
    }

    public void setAñoPub(int añoPub) {
        this.añoPub = añoPub;
    }

    @Override
    public String toString() {
        return "El titulo es: " + titulo + "\nEl autor es: " + autor + "\nEl año de publicacion es: " + añoPub + "\nEl precio es: " + precio;
    }
}
