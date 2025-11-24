

package com.ejn.espe.edu.claabstractas;

import java.util.ArrayList; 
public class ClaAbstractas {

    public static void main(String[] args) {
       ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
       
       figuras.add(new Triangulo(5,3));
       figuras.add(new Rectangulo(4,6));
       figuras.add(new Circulo(3));
       
       System.out.println("---LISTA DE FIGURAS GEOMETRICAS---");
       
       for (FiguraGeometrica figura : figuras)
       {
           System.out.println("Tipo: "+figura.getClass().getSimpleName());
           System.out.println("Area: "+figura.obtenerArea());
           System.out.println("");
       }
       
    }
}
