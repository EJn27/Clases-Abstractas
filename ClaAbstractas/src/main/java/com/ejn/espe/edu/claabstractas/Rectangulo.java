
package com.ejn.espe.edu.claabstractas;


public class Rectangulo extends FiguraGeometrica {

    private double base; 
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    @Override
    public double obtenerArea() {
        
        double resultado = base * altura; 
        return resultado; 
    }
    
}
