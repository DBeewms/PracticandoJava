/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

import javax.xml.transform.Source;

/**
 *
 * @author Diego
 */

//hola, comentario

public class Principal {
    public static void main(String []args){
        /*int edad = 18;
        float precio = (float) 18.5; //buena practica
        float cambio = 20.2f;
        double vuelto = 18.5;
        String nombre = "Diego Mora";
        System.out.println("Hola mundo, desde java");
        System.out.println("Mi nombre es: "+nombre);
        System.out.println("Mi edad es: "+edad);
        System.out.println("El precio es: "+precio+" \nEl cambio es: "+cambio+" \nEl vuelto es: "+vuelto);
        */
        
        /*Lapiz milan=new Lapiz();
        milan.setMarca("Milan");
        milan.setTamaño(12);
        milan.setColor("Amarillo");
        
        System.out.println("La marca del lapiz es: "+milan.getMarca());
        System.out.println("El tamaño del lapiz es: "+milan.getTamaño());
        System.out.println("El color del lapiz es: "+milan.getColor());
        */
        
        
        Lapiz miLapiz=new Lapiz("Negro",12,"Mongol");
        
        System.out.println(miLapiz.toString());
    }       
}
