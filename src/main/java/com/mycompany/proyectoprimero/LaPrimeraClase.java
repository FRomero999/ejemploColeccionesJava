/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoprimero;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author FranciscoRomeroGuill
 */
public class LaPrimeraClase implements Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<String,Alumno> clase = new HashMap<String,Alumno>();
        
        long start = System.currentTimeMillis();
        
        Alumno marco = new Alumno(1,"Marco");
        clase.put("Cabessa", marco);
        
        Alumno canario = new Alumno(2,"David");
        clase.put("Canario",canario);
        
        if(clase.containsKey("Canario")){
            System.out.println(clase.get("Canario"));
        }
        
        
        
        System.out.println("--------------");
        Iterator<String> ite = clase.keySet().iterator();
        while(ite.hasNext()){
            System.out.println( clase.get(ite.next()));
        }
        
        
        System.out.println(clase);
        
        long duracion = System.currentTimeMillis()-start;
        System.out.println("Duración del programa: "+duracion);
    }
    
}
