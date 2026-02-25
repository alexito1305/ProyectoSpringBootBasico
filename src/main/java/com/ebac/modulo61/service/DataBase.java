package com.ebac.modulo61.service;

import org.springframework.beans.factory.annotation.Value;

public class DataBase {
    @Value("${spring.datasource.url}")
    String dbUrl;

    @Value("${spring.datasource.username}")
    String user;

    @Value("${ENVIRONMENT VARIABLE}")
    String environmentVariable;

    public String getUser(String name) {
        System.out.println("Url hacia la base de datos: " + dbUrl);
        System.out.println("Usuario por default: " + user);
        System.out.println("Valor de mi variable de ambiente: " + environmentVariable);
        return "Nombre del usuario: " + name;
    }
}
