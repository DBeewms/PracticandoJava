/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introjavapersona;

/**
 *
 * @author Diego
 */
public class Principal {
    public static void main(String[] args) {
        Persona diego=new Persona("Diego","Mora",18,1.62,121);
        Persona carlos=new Persona("Carlos","Talavera",18,1.79,120.5);
        Persona jose=new Persona("Jose","Hernandez",20,1.75,125.7);
                
        System.out.println(diego.toString()+"\n");
        System.out.println(carlos.toString()+"\n");
        System.out.println(jose.toString()+"\n");
    }
}
