/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appinventario.business.implementation;

import co.com.poli.appinventario.business.IProductoBusiness;
import co.com.poli.appinventario.dao.implementation.ProductoDaoImpl;
import co.com.poli.appinventario.model.Producto;
import java.util.List;

/**
 *
 * @author dmons
 */
public class ProductoBusinessImpl implements IProductoBusiness {

    private ProductoDaoImpl productoDaoImpl = new ProductoDaoImpl();

    @Override
    public List<Producto> obtenerListaProductos() {
        return productoDaoImpl.obtenerListaProductos();
    }

    @Override
    public Producto obtenerProducto(String idProducto) {
        return productoDaoImpl.obtenerProducto(idProducto);
    }

    @Override
    public String crearProducto(Producto producto) {
        String respuesta = "El producto ya existe";
        Producto product = obtenerProducto(producto.getIdProducto());
        if (product == null) {
            respuesta = productoDaoImpl.crearProducto(producto);
        }
        return respuesta;
    }

    @Override
    public String modificarProducto(Producto producto) {
        String respuesta = "El producto no existe";
        Producto product = obtenerProducto(producto.getIdProducto());
        if (product != null) {
            respuesta = productoDaoImpl.modificarProducto(producto);
        }
        return respuesta;
    }

    @Override
    public String eliminarProducto(String idProducto) {
        String respuesta = "El producto no existe";
        Producto product = obtenerProducto(idProducto);
        if (product == null) {
            respuesta = productoDaoImpl.eliminarProducto(idProducto);
        }
        return respuesta;
    }

}
