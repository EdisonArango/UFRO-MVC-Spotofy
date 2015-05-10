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
import org.orm.PersistentException;

/**
 *
 * @author edisonarango
 */
@WebServlet(name = "PlayListServlet", urlPatterns = {"/PlayListServlet"})
public class PlayListServlet extends HttpServlet {

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
        int idPlaylist;
        String mensaje;
        switch (tipo) {
            case "nuevo":
                String nombre = request.getParameter("nombre");
                Principal.spotify.crearPlayList(nombre);
                request.setAttribute("type", "mensaje");
                request.setAttribute("mensaje", "La Playlist '"+nombre+"' se ha agregado con éxito");
                request.getRequestDispatcher("Principal").forward(request, response);
                break;
            case "pagina":
                idPlaylist = Integer.valueOf(request.getParameter("idPlaylist"));
                request.setAttribute("playlist", Principal.spotify.obtenerPlayList(idPlaylist));
                request.getRequestDispatcher("vista/playlist.jsp").forward(request, response);
                break;
            case "delete":
                idPlaylist = Integer.valueOf(request.getParameter("idPlaylist"));
                int idCancion = Integer.valueOf(request.getParameter("idCancion"));
                mensaje = Principal.spotify.eliminarCancionDePlayList(idCancion, idPlaylist);
                request.setAttribute("type", "mensajeWar");
                request.setAttribute("mensajeWar", mensaje);
                request.getRequestDispatcher("Principal").forward(request, response);
                break;
            case "deletePlaylist":
                idPlaylist = Integer.valueOf(request.getParameter("idPlaylist"));
                mensaje = Principal.spotify.eliminarPlayList(idPlaylist);
                request.setAttribute("type", "mensajeWar");
                request.setAttribute("mensajeWar", mensaje);
                request.getRequestDispatcher("Principal").forward(request, response);
                break;
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
            System.out.println("Maldito Error puta vida");
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
            Logger.getLogger(PlayListServlet.class.getName()).log(Level.SEVERE, null, ex);
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
