/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LizzW
 */
public class Perro implements Comparable<Perro> {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private String raza;

    public Perro() {
        System.out.println("Ingrese la raza:");
        this.raza = sc.next();
    }

    
    public Perro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public int compareTo(Perro o) {
        return this.raza.compareTo(o.raza);
    }

    @Override
    public String toString() {
        return "Perro{" + "sc=" + sc + ", raza=" + raza + '}';
    }
    
}
