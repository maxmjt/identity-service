# Identity users Project
El proyecto tiene los siguientes modules:

## Identity Persistence
Este modulo es responsable de hacer operaciones con la base de datos.

## Identity Client
Este modulo es responsable de conectarse con la perssitencia y tambien esta pensado para que pueda interactuar con otros servicios.

## Identity Parent
Este módulo sirve para implementar los artefactos que crea en la fase de paquete de la compilación.
Necesita definir la información del repositorio donde se implementarán los artefactos empaquetados.

## Identity Modules
Este modulo contiene los frameworks o grandes librerias.

## Identity Service
Este modulo es responsable de ejecutar la logica del negocio de cada requrimiento.

## Project Dependencies

##### 1.  Java SDK 11 or later
For more details please visit [Download Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html).

##### 2.  Maven 3.0 or later
For more details please visit [Download Maven](http://maven.apache.org/download.cgi).

## Configurations

##### application.yml
La localizacion de la configuracion esta en:  
`identity\identity-service\src\main\resources\application.yml`

## Build Project

Para hacer correr el programa primero ejecute el siguiente comando en la raiz del projecto:

```
   $  mvn clean compile package install
   ```

Luego ejecute el sguiente comando:

```
   $  java -jar .\identity-service\target\identity-service-0.0.1.jar 
   ```

## Project Browser Url
The project browser is available on:

```
http://localhost:9595/
```

## Swagger Url

+ __Identity Swagger Url__: 

```
http://localhost:9595/swagger-ui/index.html#
```

## End-point Examples

### Creacion de usuario

Para la creacion de un usuario, usted puede user swagger UI, posteriormente detallamos.

Para la creacion de usuario nosotros hacemos una peticion al siguiente path:

```
http://localhost:9595/identity/v1/public/users
```

La peticion hace uso de un request body que se enviara en json content tipo como se muestra a continuacion.

~~~~{.json}
{
  "name": "Max",
  "email": "maxmjt@gmail.com",
  "password": "Password123!",
  "phones": [
    {
      "number": 1,
      "citycode": 5,
      "contrycode": 9
    }
  ]
}
~~~~

La respuesta sera tambien un json content, en caso de que la respuesta sea exitosa sera: 

~~~~{.json}
{
  "id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
  "created": "2024-08-01T20:48:33.260Z",
  "modified": "2024-08-01T20:48:33.260Z",
  "last_login": "2024-08-01T20:48:33.260Z",
  "token": "string",
  "isactive": true
}
~~~~

