package com.tienda.servicioproducto.model;


import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre_producto", unique = true)
    private String nombre;

    @Column(name = "precio")
    private Double precio;

    //Constructor vacío
    public Producto() {
    }

    //Constructor lleno
    public Producto(long id, String nombre, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getter & Setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
