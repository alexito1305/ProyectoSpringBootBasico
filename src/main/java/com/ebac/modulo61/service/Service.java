package com.ebac.modulo61.service;

import com.ebac.modulo61.figuras.Figuras;
import com.ebac.modulo61.figuras.Square;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class Service {
    @Autowired
    DataBase dataBase;

    public String getUser(String name) {
        if (name != null) {
           return dataBase.getUser(name);
        }
        return "No existe el usuario";
    }

    @Autowired
    Figuras square;

    @Autowired
    Figuras circle;

    public void imprimirFigura1(){
        square.getName("Cuadrado");
        double result = square.calcularArea();
        System.out.println("Area: " + result);
    }

    public void imprimirFigura2(){
        circle.getName("Círculo");
        double result = circle.calcularArea();
        System.out.println("Area: " + result);
    }
}
