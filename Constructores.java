/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.constructores;

/**
 *
 * @author labesp
 */
public class Constructores {

    public static void main(String[] args) {
        Empleado exp= new Empleado("Jose Luis");
        System.out.println(exp.getNombre());
        
        //Rectangulo
        
        Rectangulo rec = new Rectangulo(10,20);
        System.out.println(rec.getAncho() * rec.getAltura());
        
        Rectangulo sqr = new Rectangulo(10);
        System.out.println(sqr.getAncho()*sqr.getAltura());
        
        //Vehiculo
        
        Vehiculo auto = new Vehiculo();
        System.out.println(auto.getMarca());
        Vehiculo auto1 = new Vehiculo ("Mazda");
        System.out.println(auto1.getMarca());
        
        //Estudiante
        
        Estudiante estu1 = new Estudiante("Juanito");
        Estudiante estu2 = new Estudiante(estu1);
        System.out.println(estu1.getNombre());
        System.out.println(estu2.getNombre());
    }
}
