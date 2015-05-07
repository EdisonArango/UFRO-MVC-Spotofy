<%-- 
    Document   : canciones
    Created on : 07-may-2015, 2:24:30
    Author     : edisonarango
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Cancion" language="java"%>
<%@page import="modelo.PlayList" language="java"%>
<!DOCTYPE html>
    <% PlayList playlist = (PlayList)request.getAttribute("playlist"); %>
        <div class="featurette">
            <span style="font-size: 7em;float: left;padding: 40px;" class="glyphicon glyphicon-music"></span>
            <h2 style="padding-top: 45px" class="featurette-heading"><% out.print(playlist.getNombre()); %>  <span style="font-size: 0.5em;" class="text-muted">PLAYLIST</span></h2>
            <button style="display: inline-block;" class="btn btn-default"><i class="glyphicon glyphicon-play"></i>Reproducir</button>
            <button onclick="location.href = 'PlayListServlet?type=deletePlaylist&idPlaylist=<%= playlist.getId() %>';" style="display: inline-block;" class="btn btn-dark"><i class="glyphicon glyphicon-remove"></i>Eliminar</button>
        </div>
                <table class="table table-striped">
                <thead>
                  <tr>
                    <th>#</th>
                    <th>Nombre</th>
                    <th>Artista</th>
                    <th>Género</th>
                    <th></th>
                  </tr>
                </thead>
                <tbody>
         <%
                ArrayList<Cancion> canciones = playlist.getCanciones();
                String listaDropDown = "";
                for  (int i=0; i<canciones.size();i++){
                    listaDropDown = "";
                    String nombre = canciones.get(i).getNombre();
                    int id = canciones.get(i).getId();
                    String artista = canciones.get(i).getArtista();
                    String genero = canciones.get(i).getGenero();
                    String url = "'/CancionServlet?id="+id+"'";
                    out.print("<tr>");
                    out.print("<th scope='row'>"+(i+1)+"</th>");
                    out.print("<td>"+nombre+"</td>");
                    out.print("<td>"+artista+"</td>");
                    out.print("<td>"+genero+"</td>");
                    %>
                <td>
                    <button onclick="location.href = 'PlayListServlet?type=delete&idPlaylist=<%= playlist.getId() %>&idCancion=<%= id %>';" style="display: inline-block;padding-top: 2px;padding-bottom: 2px;" class="btn btn-default">
                         <i class="glyphicon glyphicon-remove"></i>
                         Eliminar
                     </button>
                </td>
                    <%
                    out.print("<td></td>");
                    out.print("</tr>");
                }
         %>
      </tbody>
    </table>
