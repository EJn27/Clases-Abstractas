/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.constructores;

/**
 *
 * @author labesp
 */
public class Vehiculo {
    
    private String marca; 
    public Vehiculo (String marca)
    {
        this.marca=marca;
    }
    public Vehiculo()
    {
        this("Ford");
    }
    public String getMarca()
    {
        return marca; 
    }
    
}
