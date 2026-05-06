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

## Tecnologías Utilizadas

- **Spring Boot 3.1.5**
- **Spring Data JPA**
- **H2 Database** (H2 console y BD en archivo)
- **Mockito** (para pruebas unitarias)
- **JUnit 5** (framework de pruebas)

El objetivo del proyecto  demuestra cómo integrar:

✅ Consumo de APIs REST externas

✅ Renderizado de vistas dinámicas

✅ Arquitectura MVC

✅ Serialización y deserialización JSON

La aplicación actúa como cliente consumidor, no como proveedor principal del servicio.

🛠 **Tecnologías utilizadas**

🔹 Backend

- Java 17

- Spring Boot 3.5.10

- Spring MVC (incluido en spring-boot-starter-web)

- Thymeleaf (renderizado de vistas HTML)

- OpenFeign (cliente HTTP declarativo)

- Jackson (serialización/deserialización JSON)

- Lombok (reducción de código repetitivo)

🔹 **Build & Gestión**

- Apache Maven

- Spring Boot Maven Plugin

 **Arquitectura aplicada**

El proyecto sigue el patrón MVC (Model–View–Controller):

Model → DTOs que representan la estructura de los datos recibidos del servicio REST.

Controller → Controladores que reciben peticiones HTTP y llaman al cliente REST.

View → Plantillas Thymeleaf que renderizan los datos en HTML.

Estructura compatible con arquitectura en capas:

Controller → Service → REST Client

🔄 **Funcionamiento técnico**

El usuario accede a una ruta web (ej. /usuarios).

El controlador invoca un cliente REST construido con OpenFeign.

Se realiza una petición HTTP a un servicio externo.

La respuesta JSON se convierte en objetos Java mediante Jackson.

Los datos se envían al modelo de la vista.

Thymeleaf genera el HTML dinámico.

El navegador recibe una página completamente renderizada.

📌 **Detalles relevantes**

Implementa consumo de servicios REST usando OpenFeign, en lugar de RestTemplate.

Utiliza renderizado del lado del servidor (SSR – Server Side Rendering).

Se apoya en la configuración automática de Spring Boot.

Estructura adecuada para aplicaciones empresariales MVC tradicionales.

Separación clara de responsabilidades siguiendo buenas prácticas de arquitectura.

🚀 **Objetivo del proyecto**

Demostrar la integración entre:

Consumo de APIs REST

Renderizado dinámico en servidor

Arquitectura MVC en entorno Spring

Manejo de DTOs y serialización JSON
