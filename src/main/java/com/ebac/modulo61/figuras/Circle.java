package com.ebac.modulo61.figuras;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("circle")
public class Circle implements Figuras{

    private double radio = 8;

    @Override
    public double calcularArea() {
        return (double) Math.round(Math.PI * Math.pow(radio,2));
    }

}
