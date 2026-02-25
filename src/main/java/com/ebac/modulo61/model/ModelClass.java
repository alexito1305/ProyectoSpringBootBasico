package com.ebac.modulo61.model;

public class ModelClass {
    public String DBConnection(){
        return "Conexión exitosa con la DB.";
    }

    public String getUserById(int id) {
        //Simular una llamada a la DB
        return "El id del usuario es: " + id;
    }
}
