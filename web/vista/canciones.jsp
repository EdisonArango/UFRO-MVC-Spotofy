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
                <table  id="tabla" class="table table-striped">
                <thead>
                  <tr>
                    <th>#</th>
                    <th>Nombre</th>
                    <th>Artista</th>
                    <th>Género</th>
                    <th></th>
                    <th></th>
                  </tr>
                </thead>
                <tbody>
         <%
                ArrayList<PlayList> playlist = (ArrayList<PlayList>)request.getAttribute("playlists");
                ArrayList<Cancion> canciones = (ArrayList<Cancion>)request.getAttribute("canciones");
                String listaDropDown = "";
                for  (int i=0; i<canciones.size();i++){
                    listaDropDown = "";
                    String nombre = canciones.get(i).getNombre();
                    int id = canciones.get(i).getId();
                    String artista = canciones.get(i).getArtista();
                    String genero = canciones.get(i).getGenero();
                    String url = "'/CancionServlet?id="+id+"'";
                    out.print("<tr class='tablacancion'>");
                    out.print("<th scope='row'>"+(i+1)+"</th>");
                    out.print("<td>"+nombre+"</td>");
                    out.print("<td>"+artista+"</td>");
                    out.print("<td>"+genero+"</td>");
                    out.print("<td>");
                    
                    for (int j=0; j<playlist.size();j++){
                        PlayList list = playlist.get(j);
                        if (!list.cancionEsta(canciones.get(i))) {
                                listaDropDown+= "<li role='presentation'><a role='menuitem' href='/Spotofy/CancionesServlet?type=addToPlayList&idPlaylist="+list.getId()+"&idCancion="+id+"'>"+list.getNombre()+"</a></li>";
                            }
                    }
                    
                    %>
                    <div  class="dropdown clearfix">
                        <button style="padding-top:0;padding-bottom: 0;" class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu4" data-toggle="dropdown" aria-expanded="false">
                          Agregar a Playlist
                          <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu4">
                            <% out.print(listaDropDown); %>
                        </ul>
                    </div>
                    <%
                    out.print("</td>");
                    out.print("<td></td>");
                    out.print("</tr>");
                }
         %>
      </tbody>
    </table>
      