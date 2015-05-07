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
                PlayList playlist = (PlayList)request.getAttribute("playlist");
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
                    out.print("<td></td>");
                    out.print("</tr>");
                }
         %>
      </tbody>
    </table>
