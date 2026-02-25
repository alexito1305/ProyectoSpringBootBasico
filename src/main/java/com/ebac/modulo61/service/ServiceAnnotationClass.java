package com.ebac.modulo61.service;

import com.ebac.modulo61.model.ModelClass;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceAnnotationClass {
    @Autowired
    ModelClass modelClass;

    public void executeTask() {
        String idUser = modelClass.getUserById(33);
        System.out.println("Inyección de dependencia por Anotación:");
        System.out.println(modelClass.DBConnection());
        System.out.println(idUser);
    }
}
