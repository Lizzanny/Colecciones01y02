/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.colecciones01;

import Servicios.Servicios;

/**
 *
 * @author LizzW 
 * Diseñar un programa que lea y guarde razas de perros en un
 * ArrayList de tipo String. El programa pedirá una raza de perro en un bucle,
 * el mismo se guardará en la lista y después se le preguntará al usuario si
 * quiere guardar otro perro o si quiere salir. Si decide salir, se mostrará
 * todos los perros guardados en el ArrayList.
 *
 * 
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
public class Colecciones01 {

    public static void main(String[] args) {
        Servicios ser = new Servicios();
        ser.menu();
    }
}
