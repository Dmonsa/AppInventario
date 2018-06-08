/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appinventario.controller;

import co.com.poli.appinventario.business.implementation.ProductoBusinessImpl;
import co.com.poli.appinventario.dao.implementation.ProductoDaoImpl;
import co.com.poli.appinventario.model.Producto;
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
public class ProductoServlet extends HttpServlet {

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
        ProductoBusinessImpl pbusinessImpl = new ProductoBusinessImpl();
        String idProducto = "";
        String nombre = "";
        String stock;
        String existencia;
        String accion = request.getParameter("accion");
        Producto producto;
        String mensaje = "";
        switch (accion) {
            case "crear":
                idProducto = request.getParameter("txtidProducto");
                nombre = request.getParameter("txtnombre");
                stock = request.getParameter("txtstock");
                existencia = request.getParameter("txtexistencia");
                producto = new Producto(idProducto, nombre,Double.parseDouble(stock), Double.parseDouble(existencia));
                mensaje = pbusinessImpl.crearProducto(producto);
                session.setAttribute("MENSAJE", mensaje);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                break;

            case "eliminar":

                break;
            case "modificar":

                break;
            case "listar":
                List<Producto> listaProductos = pbusinessImpl.obtenerListaProductos();
                session.setAttribute("LISTADO", listaProductos);
                rd = request.getRequestDispatcher("/view/productoslista.jsp");
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
