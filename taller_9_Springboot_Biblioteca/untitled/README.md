# Biblioteca API (Spring Boot)

Proyecto organizado por capas siguiendo el tutorial de referencia:
- `model`
- `repository`
- `dto`
- `service` + `service.impl`
- `controller`

## Requisitos

- Java 17+
- Maven 3.9+

## Configuracion

1. Edita `src/main/resources/application.properties`.
2. Reemplaza `spring.data.mongodb.uri` por tu URI real de MongoDB Atlas.

## Ejecutar

```bash
mvn spring-boot:run
```

## Probar

```bash
mvn test
```

## Endpoints base

- `GET /api/libros`
- `POST /api/libros`
- `GET /api/libros/{id}`
- `PUT /api/libros/{id}`
- `DELETE /api/libros/{id}`

Tambien se incluyen endpoints de usuarios:
- `GET /api/usuarios`
- `POST /api/usuarios`
- `GET /api/usuarios/{id}`
- `PUT /api/usuarios/{id}`
- `DELETE /api/usuarios/{id}`

