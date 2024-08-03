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

##### 1.  Java SDK 8 or later
For more details please visit [Download Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html).
```shell
$ java -version
java version "1.8.0_131"
Java(TM) SE Runtime Environment (build 1.8.0_131-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.131-b11, mixed mode)
```

##### 2.  Maven 3.0 or later
For more details please visit [Download Maven](http://maven.apache.org/download.cgi).
```shell
$ mvn --version
Apache Maven 3.5.0 (...)
Maven home: ...
Java version: 1.8.0_131, vendor: Oracle Corporation
Java home: ...
Default locale: ...
OS name: ...
```

## Configurations

##### bootstrap.yml
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

## Testing

To run the chat model unit tests you need execute the command:

$ mvn test

To run the chat model fusion integration tests you need:

- Update the integration-test profile into the application.yml configuration file, it is located in folder 'chat-model/src/test/resources/'

- run the next command:

$ mvn test -P integration-test


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
http://localhost:9595/example/users
```

The request will make use of the __userId__ parameter required and obtained from the social-identity service, also a request body that will be sent in json content type as follows:
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

