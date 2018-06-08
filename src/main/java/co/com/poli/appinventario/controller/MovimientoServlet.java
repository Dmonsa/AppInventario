/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appinventario.controller;

import co.com.poli.appinventario.dao.implementation.MovimientoDaoImpl;
import co.com.poli.appinventario.model.Movimiento;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dmons
 */
public class MovimientoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        MovimientoDaoImpl movimientoDaoImpl = new MovimientoDaoImpl();
        String idMovimiento = "";
        String producto = "";
        String tipoMovimiento = "";
        String cantidad;
        String precio;
        String mensaje = "";
        Movimiento movimiento;
        String accion = request.getParameter("accion");
        switch (accion) {
            case "crear": 
                idMovimiento = request.getParameter("txtidMovimiento");
                producto = request.getParameter("txtproducto");
                tipoMovimiento = request.getParameter("txttipoMov");
                cantidad = request.getParameter("txtcantidad");
                precio = request.getParameter("txtprecio");
                movimiento = new Movimiento(idMovimiento, producto, tipoMovimiento, Double.parseDouble(cantidad), Double.parseDouble(precio));
                mensaje = movimientoDaoImpl.crearMovimiento(movimiento);
                session.setAttribute("MENSAJE", mensaje);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                break;

            case "eliminar":

                break;
                
            case "modificar":

                break;
                
            case "listar":
                List<Movimiento> listMovimientos = movimientoDaoImpl.obtenerListaMovimientos();
               session.setAttribute("LISTADO", listMovimientos);
                rd = request.getRequestDispatcher("/view/movimientoslista.jsp");
                break;
            default:
                break;
        }
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
