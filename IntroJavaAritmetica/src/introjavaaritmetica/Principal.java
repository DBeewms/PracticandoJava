/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introjavaaritmetica;

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
        Scanner respuesta = new Scanner(System.in);
        double num1, num2, resp;
        
        System.out.println("Dime dos numeros: ");
        num1 = respuesta.nextDouble();
        num2 = respuesta.nextDouble();
     
        resp = num1 + num2;
        System.out.println("La suma es: "+resp);
        
        resp = num1 - num2;
        System.out.println("La resta es: "+resp);
        
        resp = num1 * num2;
        System.out.println("La multiplicacion es: "+resp);
        
        resp = num1 / num2;
        System.out.println("La division es: "+resp);
        
        resp = num1 % num2;
        System.out.println("El residuo es: "+resp);
    }
}
