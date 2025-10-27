/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.constructores;

/**
 *
 * @author labesp
 */
public class Estudiante {
    
    private String nombre; 
    
    public Estudiante(String nombre)
    {
        this.nombre=nombre;
    }
    public Estudiante(Estudiante otro)
    {
        this.nombre=otro.nombre;
    }
    public String getNombre()
    {
        return nombre; 
    }
}
