<%-- 
    Document   : index
    Created on : 6-may-2015, 11:50:53
    Author     : edisonarango
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Cancion" language="java"%>
<%@page import="modelo.PlayList" language="java"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/styles.css"/>
        <link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css"/>
        <!--<link rel="stylesheet" href="lib/bootstrap/css/bootstrap-theme.min.css"/>-->
        <script src="lib/jquery1.11.2.js"></script>
        <script src="lib/bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/funciones.js"></script>
        <title>Spotofy</title>
    </head>
    <body>

        <header class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
              <!-- Brand and toggle get grouped for better mobile display -->
              <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                  <span class="sr-only">Toggle navigation</span>
                </button>
              </div>
              
              <a class="col-md-3 navbar-brand" href="/Spotofy">Spotofy</a>
              <!-- Collect the nav links, forms, and other content for toggling -->
              <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <form class="navbar-form">
                    <div class="form-group" style="display:inline;">
                      <div class="input-group" style="display:table;">
                        <span class="input-group-addon" style="width:1%;"><span class="glyphicon glyphicon-search"></span></span>
                        <input class="form-control" id="busqueda" name="busqueda" placeholder="Buscar canción" type="text">
                        <!--<button class="input-group-addon glyphicon glyphicon-search" type="submit"></button>-->
                      </div>
                    </div>
                </form>
              </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
          </header>
        <div style="height:55px;" id="spacer"></div>
         <% 
                String mensaje = (String)request.getAttribute("mensaje");
                if(mensaje!=null&&mensaje!=""){ %>
                <div style="padding-left: 26%;" class="alert alert-success alert-dismissable mensaje">
                      <button type="button" class="close" data-dismiss="alert">&times;</button>
                      <strong>¡Bien!</strong> ${mensaje}
                </div>
                 <% } %>
          <% 
                String mensajeWar = (String)request.getAttribute("mensajeWar");
                if(mensajeWar!=null&&mensajeWar!=""){ %>
                <div style="padding-left: 26%;" class="alert alert-warning alert-dismissable mensaje">
                      <button type="button" class="close" data-dismiss="alert">&times;</button>
                      <strong>¡Bien!</strong> ${mensajeWar}
                </div>
                 <% } %>
                 
        <div class="content">
        <div class="left border_right sidebar1">
            <ul class="nav">
                 <li>
                     <a style='color:black;' class='glyphicon glyphicon-music' href='/Spotofy' >&nbsp;<b>Todas las canciones</b></a>
            </li>
            </ul>
           
            <h4 style="color: #555"><u>PLAYLISTS</u></h4>
                    <div>
                        <ul class="nav">
                            <%
                            ArrayList<PlayList> playlist = (ArrayList<PlayList>)request.getAttribute("playlists");
                            for  (int i=0; i<playlist.size();i++){
                                String nombre = playlist.get(i).getNombre();
                                int id = playlist.get(i).getId();
                                
                                String url = "'PlayListServlet?type=pagina&idPlaylist="+id+"'";
                                out.print("<li><a style='color:black;' class='glyphicon glyphicon-music' href='#' onclick=cargarPlayList("+url+") >&nbsp;<b>"+nombre+"</b></a></li>");
                            }
                            %>
                            
                        </ul>
                    </div>
               
            </div>
            <div id="contenido" class="scrollable2">
             </div>
     
        </div>   
         <footer class="footer">
               <div style="display: inline-block;margin-left: 10px;margin-right: 10px;">
                   <span style="margin-top: 7px;" class="glyphicon glyphicon-plus"></span>
                   <button style="color: black" type="button" class='btn btn-link' onclick="agregarPlayList()"> <h4 style="margin-top: 8px;" ><u>Crear Playlist</u></h4></button>
               </div>
                <div style="display: inline-block" id="agregarPlayList"></div>
        </footer>
    </body>
</html>
