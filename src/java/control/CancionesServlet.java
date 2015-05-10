/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cancion;
import modelo.PlayList;
import org.orm.PersistentException;

/**
 *
 * @author edisonarango
 */
@WebServlet(name = "CancionesServlet", urlPatterns = {"/CancionesServlet"})
public class CancionesServlet extends HttpServlet {

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
            throws ServletException, IOException, PersistentException {
        
        String tipo = request.getParameter("type");
        if (tipo.equals("addToPlayList")) {
            int idPlaylist = Integer.valueOf(request.getParameter("idPlaylist"));
            int idCancion = Integer.valueOf(request.getParameter("idCancion"));
            Principal.spotify.agregarCancionAPlaylist(idCancion, idPlaylist);
            request.setAttribute("type", "mensaje");
            request.setAttribute("mensaje", "La Cancion se ha agregado a la playlist");
            request.getRequestDispatcher("Principal").forward(request, response);
        }
        else if (tipo.equals("pagina")) {
            request.setAttribute("canciones", Principal.spotify.cargarCanciones());
            request.setAttribute("playlists", Principal.spotify.cargarPlaylist());
            request.getRequestDispatcher("vista/canciones.jsp").forward(request, response);
        }
        
            
            
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
        try {
            processRequest(request, response);
        } catch (PersistentException ex) {
            Logger.getLogger(CancionesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (PersistentException ex) {
            Logger.getLogger(CancionesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
