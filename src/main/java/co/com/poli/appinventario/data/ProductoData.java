/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appinventario.data;

import co.com.poli.appinventario.model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dmons
 */
public class ProductoData {

    private static List<Producto> listaProductos;

    static {

        listaProductos = new ArrayList<Producto>() {
            {
                add(new Producto("10X", "Iphone7", 100D, 200D));
                add(new Producto("20Y", "S9Plus", 300D, 400D));
            }
        };
    }

    public static List<Producto> getListaProductos() {
        return listaProductos;
    }

    public static void setListaProductos(List<Producto> aListaProductos) {
        listaProductos = aListaProductos;
    }
}
