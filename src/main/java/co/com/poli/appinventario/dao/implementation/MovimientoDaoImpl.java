/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appinventario.dao.implementation;

import co.com.poli.appinventario.dao.IMovimientoDao;
import co.com.poli.appinventario.data.MovimientoData;
import co.com.poli.appinventario.model.Movimiento;
import java.util.List;

/**
 *
 * @author dmons
 */
public class MovimientoDaoImpl implements IMovimientoDao {

    @Override
    public List<Movimiento> obtenerListaMovimientos() {
        return MovimientoData.getListaMovimientos();
    }

    @Override
    public Movimiento obtenerMovimiento(String idMovimiento) {
        Movimiento movimiento = null;
        List<Movimiento> listaMovimiento = MovimientoData.getListaMovimientos();
        for (Movimiento movimientoLista : listaMovimiento) {
            if (movimientoLista.getIdMovimiento().equals(idMovimiento)) {
                movimiento = movimientoLista;
            }
        }
        return movimiento;
    }

    @Override
    public String crearMovimiento(Movimiento movimiento) {
        List<Movimiento> listaMovimiento = MovimientoData.getListaMovimientos();
        listaMovimiento.add(movimiento);
        MovimientoData.setListaMovimientos(listaMovimiento);
        return "Movimiento Creado";
    }

    @Override
    public String modificarMovimiento(Movimiento movimiento) {
        List<Movimiento> listaMovimiento = MovimientoData.getListaMovimientos();
        listaMovimiento.set(listaMovimiento.indexOf(movimiento), movimiento);
        MovimientoData.setListaMovimientos(listaMovimiento);
        return "Movimiento Modificado";
    }

    @Override
    public String eliminarMovimiento(String idMovimiento) {
        List<Movimiento> listaMovimiento = MovimientoData.getListaMovimientos();
        listaMovimiento.remove(obtenerMovimiento(idMovimiento));
        MovimientoData.setListaMovimientos(listaMovimiento);
        return "Movimiento Eliminado";
    }

}
