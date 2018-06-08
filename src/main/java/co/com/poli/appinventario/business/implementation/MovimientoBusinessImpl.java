/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appinventario.business.implementation;

import co.com.poli.appinventario.business.IMovimientoBusiness;
import co.com.poli.appinventario.dao.implementation.MovimientoDaoImpl;
import co.com.poli.appinventario.model.Movimiento;
import java.util.List;

/**
 *
 * @author dmons
 */
public class MovimientoBusinessImpl implements IMovimientoBusiness {

    private MovimientoDaoImpl movimientoDaoImpl = new MovimientoDaoImpl();

    @Override
    public List<Movimiento> obtenerListaMovimientos() {
        return movimientoDaoImpl.obtenerListaMovimientos();
    }

    @Override
    public Movimiento obtenerMovimiento(String idMovimiento) {
        return movimientoDaoImpl.obtenerMovimiento(idMovimiento);
    }

    @Override
    public String crearMovimiento(Movimiento movimiento) {
        String respuesta = "El movimiento ya existe";
        Movimiento movimient = obtenerMovimiento(movimiento.getIdMovimiento());
        if (movimient == null) {
            respuesta = movimientoDaoImpl.crearMovimiento(movimiento);
        }
        return respuesta;
    }

    @Override
    public String modificarMovimiento(Movimiento movimiento) {
        String respuesta = "El movimiento no existe";
        Movimiento movimient = obtenerMovimiento(movimiento.getIdMovimiento());
        if (movimient != null) {
            respuesta = movimientoDaoImpl.modificarMovimiento(movimiento);
        }
        return respuesta;
    }

    @Override
    public String eliminarMovimiento(String idMovimiento) {
        String respuesta = "El producto no existe";
        Movimiento movimient = obtenerMovimiento(idMovimiento);
        if (movimient == null) {
            respuesta = movimientoDaoImpl.eliminarMovimiento(idMovimiento);
        }
        return respuesta;
    }

}
