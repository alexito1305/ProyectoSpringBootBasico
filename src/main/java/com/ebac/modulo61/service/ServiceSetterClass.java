package com.ebac.modulo61.service;

import com.ebac.modulo61.model.ModelClass;

public class ServiceSetterClass {
    private ModelClass modelClass;

    public void executeTask() {
        String idUser = modelClass.getUserById(1);
        System.out.println("Inyección de dependencia por Setter:");
        System.out.println(modelClass.DBConnection());
        System.out.println(idUser);
    }

    public void setModelClass(ModelClass modelClass) {
        this.modelClass = modelClass;
    }
}
