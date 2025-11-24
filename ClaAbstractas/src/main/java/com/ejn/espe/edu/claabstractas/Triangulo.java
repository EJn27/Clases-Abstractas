
package com.ejn.espe.edu.claabstractas;

public class Triangulo extends FiguraGeometrica {
    
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

   
    @Override
    public double obtenerArea() {
       double resultado = 0.5*(base*altura);
       return resultado; 
    }
    
    
    
}
