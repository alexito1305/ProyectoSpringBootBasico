package com.ebac.modulo61.service;

import com.ebac.modulo61.model.ModelClass;

public class ServiceConstructorClass {
    private final ModelClass modelClass;

    public ServiceConstructorClass(ModelClass modelClass) {
        this.modelClass = modelClass;
    }

    public void executeTask() {
        String idUser = modelClass.getUserById(13);
        System.out.println("Inyección de dependencia por Constructor:");
        System.out.println(modelClass.DBConnection());
        System.out.println(idUser);
    }
}
