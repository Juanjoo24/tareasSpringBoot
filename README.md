# CRUD MVC con Thymeleaf — RA3

## 1) Datos del alumno/a
- Entidad elegida: zapatilla

## 2) Repositorio (fork) y gestión de versiones
- Repositorio base: https://github.com/profeInformatica101/tareasSpringBoot
- Enlace a MI fork: https://github.com/Juanjoo24/tareasSpringBoot
- Nº de commits realizados: (mínimo 5)

## 3) Arquitectura
Explica brevemente cómo has organizado:
- Controller:
- Service:
- Repository:
- Entity:

## 4) Base de datos elegida (marca una)
- [ ] H2
- [x] MySQL
- [ ] PostgreSQL

## 5) Configuración de la base de datos
### 5.1 Dependencias añadidas
<dependency>
  <groupId>com.mysql</groupId>
  <artifactId>mysql-connector-j</artifactId>
  <scope>runtime</scope>
</dependency>
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
### 5.2 application.properties / application.yml
spring.datasource.url=jdbc:mysql://localhost:3306/tienda_zapatilla
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

### 5.3 Pasos para crear la BD (si aplica)
- MySQL:CREATE DATABASE tienda_zapatilla;
## 6) Cómo ejecutar el proyecto
1. Requisitos (Java versión, Maven/Gradle, DB instalada si aplica)
2. Comando de arranque:
   - ./mvnw spring-boot:run   (o equivalente)
3. URL de acceso:
   - http://localhost:8080/zapatillas

## 7) Pantallas / Rutas MVC
- GET /zapatillas (listar)
- GET /zapatillas/formulario (formulario alta)
- POST /zapatillas (crear)
- GET /entidad/{id}/editar (editar)
- POST /entidad/{id} (actualizar)
- POST /entidad/{id}/borrar (eliminar)


## 8) Mejoras extra (opcional)
- Validaciones
- Estilos Bootstrap
- Búsqueda
- Pruebas
- Paginación
