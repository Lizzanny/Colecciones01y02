/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Comparadores.Comparadores;
import Perro.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LizzW
 */
public class Servicios {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Perro> perros = new ArrayList();
    
    
    public void crearPerro(){
        perros.add(new Perro());//otra forma de instanciar
    }
    
    public void buscarPerro(){
        Iterator<Perro> buscar = perros.iterator();
        String perro;
        boolean aux=false;
        mostrarLista();
        System.out.println("¿Que raza busca?");
        perro = sc.next();
        while (buscar.hasNext()) {
            if (buscar.next().getRaza().equals(perro)) {
                buscar.remove();
                aux = true;
                System.out.println("Raza eliminada de la lista");
            }
        }
        if(!aux){
            System.out.println("La raza no esta en la lista");
        }
        ordenarAlfabeticamente();
        mostrarLista();

        
    }
    
    public void ordenarAlfabeticamente(){
        Collections.sort(perros, Comparadores.ordenarDesc);
    }
    
    public void mostrarLista(){
        System.out.println("Mostrando razas");
        for (Perro perro : perros) {
            System.out.println(perro.getRaza());
        }
    }
    
    
    public void menu(){
        int opc;
        boolean salir=false;
        do{
            System.out.println("Elija opción:");
            System.out.println("1. Agregar perro");
            System.out.println("2. Eliminar perro");
            System.out.println("3. Salir");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    crearPerro();
                break;
                case 2:
                    buscarPerro();
                break;
                case 3:
                    System.out.println(perros);
                    salir=true;
                break;
                default:
                    System.out.println("Opción invalida");
            }
        }while(!salir);
    }

    @Override
    public String toString() {
        return "Servicios{" + "sc=" + sc + ", perros=" + perros + '}';
    }
    
}
