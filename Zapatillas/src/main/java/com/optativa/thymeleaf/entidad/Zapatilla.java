package com.optativa.thymeleaf.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class Zapatilla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera automáticamente en la base de datos
    private int id;

    @NotBlank(message = "La marca no puede estar en blanco")
    private String marca;

    @NotBlank(message = "El modelo no puede estar en blanco")
    private String modelo;

    @Positive(message = "El precio debe ser positivo")
    private double precio;

    @NotBlank(message = "La categoría no puede estar vacía")
    private String categoria;

    @Min(value = 1, message = "La talla debe ser un número positivo")
    private int talla;

    public Zapatilla() {
    }

    public Zapatilla(int id, String marca, String modelo, double precio, String categoria, int talla) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.categoria = categoria;
        this.talla = talla;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Zapatilla [id=" + id +
               ", marca=" + marca +
               ", modelo=" + modelo +
               ", precio=" + precio +
               ", categoria=" + categoria +
               ", talla=" + talla + "]";
    }
}
