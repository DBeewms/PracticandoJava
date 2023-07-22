/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forms;

import models.Asignatura;
import models.Carrera;

/**
 *
 * @author Diego
 */
public class Principal {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Asignatura español = new Asignatura();
        
        español.setNombre("Español");
        español.setCodigo("ESP001");
        español.setDescripcion("Curso de español");
        español.setCreditos(6);
        
        Asignatura calculo1 = new Asignatura("Cálculo 1","CAL001","Curso de Cálculo 1",6);
        Asignatura fundamentosTIC = new Asignatura("Fundamentos de TIC","TIC001","Curso de Fundamentos de TIC",4);
        Asignatura tecCol = new Asignatura("Tecnologías de Colaboración","TEC030","Curso de tecnologías de colaboración",4);
        Asignatura metPro = new Asignatura("Metodología de la programación","TEC015","Curso de metodología de la programación", 6);
        
        System.out.println("Asignatura: " + español.getNombre());
        System.out.println("Código: " + español.getCodigo());
        System.out.println("Descripción: " + español.getDescripcion());
        System.out.println("Créditos: " + español.getCreditos());
        System.out.println("\n");
        
        System.out.println(calculo1.toString());
        System.out.println(fundamentosTIC.toString());
        System.out.println(tecCol.toString());
        System.out.println(metPro.toString());
        
        //Crear 5 objetos de tipo carrera
        
        Carrera ingSistemas = new Carrera(ISI031,
                "Ingeniería en sistemas de inforamción",
                "Carrera de ingeniería en sistemas de inforamción", 660);
        Carrera arquitectura = new Carrera();
        Carrera ingIndustrial = new Carrera();
        Carrera ingCivil = new Carrera();
        Carrera diseñoGrafico = new Carrera();
        
    }
}