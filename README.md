# ForoHub

Proyecto ForoHub hecho para el challenge de Alura Latam ONE.

Este proyecto fue creado usando Java y IntelliJ como editor. Como herramientas adicionales se uso Spring Boot, Spring Data JPA y Flyway con MySQL como base de datos.

Este programa es un API que te permite Realizar diferentes solicitudes REST:
* Iniciar Sesion
* Registrar un topico
* Mostrar los topicos
* Actualizar un Topico
* Eliminar un topico

La API se despliega localmente en:
* Base URL: http://localhost:8080


La API requiere autorización mediante tokens JWT para acceder a ciertas funciones.


## Endpoints
### Tópicos

- **Crear un tópico**
    - `POST /topicos`
    - Body: `DatosRegistroTopico`


- **Mostrar todos los tópicos**
    - `GET /topicos`
    - Respuesta: `List<PageDatosListadoTopico>`


- **Detallar un tópico**
  - `GET /topico/{id}`


- **Actualizar un tópico**
    - `PUT /topicos`
    - Body: `DatosActualizarTopico`


- **Eliminar un tópico (lógico)**
    - `DELETE /topico/{id}`


### Autenticación

- **Iniciar sesión (login)**
    - `POST /login`
    - Body: `DatosAutenticacionUsuario`
    - Respuesta: `DatosJWTtoken`


----

*Andres Casillas @ 2024*