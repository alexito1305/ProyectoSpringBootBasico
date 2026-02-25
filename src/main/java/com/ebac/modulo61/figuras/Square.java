package com.ebac.modulo61.figuras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("square")
public class Square implements Figuras{

    private double lado = 5;

    @Override
    public double calcularArea() {
        return (double) Math.pow(lado,2);
    }
}
