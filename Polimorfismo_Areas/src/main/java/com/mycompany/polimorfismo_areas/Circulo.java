package com.mycompany.polimorfismo_areas;

public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }    
    
    
}
