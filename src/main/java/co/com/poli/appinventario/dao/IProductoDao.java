/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appinventario.dao;

import co.com.poli.appinventario.model.Producto;
import java.util.List;

/**
 *
 * @author dmons
 */
public interface IProductoDao {

    List<Producto> obtenerListaProductos();

    Producto obtenerProducto(String idProducto);

    String crearProducto(Producto producto);

    String modificarProducto(Producto producto);

    String eliminarProducto(String idProducto);
}
