/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introjavanombre;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nom=new Scanner(System.in);
        String nombre;
        
        
        System.out.println("Dime tu nombre: ");
        nombre = nom.next();
        System.out.println("Bienvenido "+nombre);
    }
}
