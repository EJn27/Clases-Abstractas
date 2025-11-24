
package com.ejn.espe.edu.claabstractas;

public class Circulo extends FiguraGeometrica {

    private double radio; 

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
   
    @Override
    public double obtenerArea() {
        
        double pi = 3.1416;
        double resultado = pi*radio*radio;
        return resultado; 
    }
}
