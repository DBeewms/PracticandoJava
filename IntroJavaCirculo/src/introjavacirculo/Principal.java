/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introjavacirculo;
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
        Scanner temp=new Scanner(System.in);
        final double PI = 3.1416;
        double radio, cuadrado, total, exponente = 2;
        
        System.out.println("Dime el radio del circulo: ");
        radio = temp.nextDouble();
        
        cuadrado = Math.pow(radio, exponente);
        total = PI*cuadrado;
        
        System.out.println("El area del circulo es: "+total);
    }
}
