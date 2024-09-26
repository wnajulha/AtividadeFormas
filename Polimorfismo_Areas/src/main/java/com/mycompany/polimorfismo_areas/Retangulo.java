package com.mycompany.polimorfismo_areas;

public class Retangulo extends Forma {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
    
    
}

