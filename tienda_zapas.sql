CREATE DATABASE IF NOT EXISTS tienda_zapas;
USE tienda_zapas;

CREATE TABLE zapatillas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(255),
    modelo VARCHAR(255),
    talla INT,
    precio DOUBLE
);