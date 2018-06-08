/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appinventario.dao;

import co.com.poli.appinventario.model.Movimiento;
import java.util.List;

/**
 *
 * @author dmons
 */
public interface IMovimientoDao {

    List<Movimiento> obtenerListaMovimientos();

    Movimiento obtenerMovimiento(String idMovimiento);

    String crearMovimiento(Movimiento movimiento);

    String modificarMovimiento(Movimiento movimiento);

    String eliminarMovimiento(String idMovimiento);
}
