## 📌 Proyecto SpringBoot Básico, Servicios Web y pruebas unitarias.

🧩 **Descripción general**

Este proyecto es una aplicación Spring Boot que utiliza servicios web y utiliza un modelo MVC. Además se incluyen pruebas unitarias con
Mockito.

El proyecto se compone de:
- Rest Controller (`UsuarioController`)
- Clase de configuración (`AppConfiguration`)
- Clase de servicio (`UsuarioService`)
- Clase repositorio (`UsuarioRepository`)
- Clase Modelo (`ModelClass`)
- Clase de pruebas unitarias (`UsuarioControllerTest`)

## 🧠 Estructura del Proyecto
```
src/
├── main/
│   ├── java/com/ebac/modulo61/
│   │   ├── configuration/
│   │   │   └── AppConfiguration.java
│   │   ├── controller/
│   │   │   └── UsuarioController.java
│   │   ├── dto/
│   │   │   └── Usuario.java
│   │   ├── model/
│   │   │   └── ModelClass.java
│   │   ├── service/
│   │   |   └──DataBase.java
|   |   |   └──Service.java  
|   |   |   └──UsuarioRepository.java
|   |   |   └──UsuarioService.java
│   │   └── EbacApplication.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/java/com/ebac/modulo61/
        └── Modulo39ApplicationTest.java
```

## 🔹 Tecnologías Utilizadas

- **Spring Boot 3.1.5**
- **Maven**
- **Spring Data JPA**
- **H2 Database** (H2 console y BD en archivo)
- **Mockito** (para pruebas unitarias)
- **JUnit 5** (framework de pruebas)


## 🚀 Objetivo del proyecto

✅ Usar una arquitectura MVC.

✅ Realizar operaciones CRUD usando JPA.

✅ Segmentar el proyecto en controlador, dto, servicios y repositorio.

## 🔄 Detalles destacados

Implementa operaciones CRUD mediante JPA.
Utilizar dtos para generar los pojos con las entidades que se usaran en la BD
Integración de H2 como base de datos en memoria.
Utilización de perfilamiento para pruebas y prod.
Uso de maven en un proyecto springboot.
Implementación de starters.
Estructura adecuada para aplicaciones del modelo MVC.

🚀 
