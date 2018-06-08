/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appinventario.data;

import co.com.poli.appinventario.model.Movimiento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dmons
 */
public class MovimientoData {

    private static List<Movimiento> listaMovimientos;

    static {
        listaMovimientos = new ArrayList<Movimiento>() {
            {
                add(new Movimiento("10", "IphoneX", "Entrada", 500000D, 40000D));
                add(new Movimiento("20", "S9Plus", "Salida", 600000D, 40000D));
            }
        };
    }

    public static List<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }

    public static void setListaMovimientos(List<Movimiento> aListaMovimientos) {
        listaMovimientos = aListaMovimientos;
    }
}
