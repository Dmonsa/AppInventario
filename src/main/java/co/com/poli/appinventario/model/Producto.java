/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appinventario.model;

import java.util.Objects;

/**
 *
 * @author dmons
 */
public class Producto {
    private String idProducto;
    private String nombre;
    private Double stock;
    private Double exitencia;

    public Producto(String idProducto, String nombre, Double stock, Double exitencia) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.stock = stock;
        this.exitencia = exitencia;
    }

    public Double getExitencia() {
        return exitencia;
    }

    public void setExitencia(Double exitencia) {
        this.exitencia = exitencia;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.idProducto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.idProducto, other.idProducto)) {
            return false;
        }
        return true;
    }
}
