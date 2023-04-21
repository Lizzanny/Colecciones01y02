/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparadores;

import Perro.Perro;
import Servicios.Servicios;
import java.util.Comparator;

/**
 *
 * @author LizzW
 */
public class Comparadores {
    
    public static Comparator<Perro> ordenarDesc = new  Comparator<Perro>(){
        @Override
        public int compare(Perro o1, Perro o2) {
            return o1.getRaza().compareTo(o2.getRaza());
        }
        
    };
        
}
