/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appinventario.dao.implementation;

import co.com.poli.appinventario.dao.IProductoDao;
import co.com.poli.appinventario.data.ProductoData;
import co.com.poli.appinventario.model.Producto;
import java.util.List;

/**
 *
 * @author dmons
 */
public class ProductoDaoImpl implements IProductoDao {

    @Override
    public List<Producto> obtenerListaProductos() {
        return ProductoData.getListaProductos();
    }

    @Override
    public Producto obtenerProducto(String idProducto) {
        Producto producto = null;
        List<Producto> listaProductos = ProductoData.getListaProductos();
        for (Producto productoLista : listaProductos) {
            if (productoLista.getIdProducto().equals(producto)) {
                producto = productoLista;
            }
        }
        return producto;
    }

    @Override
    public String crearProducto(Producto producto) {
        List<Producto> listaProductos = ProductoData.getListaProductos();
        listaProductos.add(producto);
        ProductoData.setListaProductos(listaProductos);
        return "Producto Creado";
    }

    @Override
    public String modificarProducto(Producto producto) {
        List<Producto> listaProductos = ProductoData.getListaProductos();
        listaProductos.set(listaProductos.indexOf(producto), producto);
        ProductoData.setListaProductos(listaProductos);
        return "Prodcuto Modificado";
    }

    @Override
    public String eliminarProducto(String idProducto) {
        List<Producto> listaProductos = ProductoData.getListaProductos();
        listaProductos.remove(obtenerProducto(idProducto));
        ProductoData.setListaProductos(listaProductos);
        return "Producto Eliminado";
    }
}
