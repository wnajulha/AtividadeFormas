
package com.mycompany.polimorfismo_areas;

public class Polimorfismo_Areas {

    public static void main(String[] args) {
        
        Forma[] F = new Forma[3];
        
        F[0] = new Circulo(5.0);
        F[1] = new Retangulo(4.0, 6.0);
        F[2] = new Triangulo(3.0,8.0);
        
        System.out.println("Area dao circulo: " + F[0].calcularArea());
        System.out.println("Area do retangulo: " + F[1].calcularArea());
        System.out.println("Area do triangulo||: " + F[2].calcularArea());
    
    }
}



       

        
        
    

