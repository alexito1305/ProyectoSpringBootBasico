package com.ebac.modulo61.figuras;

public interface Figuras {
    double calcularArea();

    default void getName(String name){
        System.out.println("La figura es: " + name);
    }
}
