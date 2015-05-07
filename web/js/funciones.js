/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {
    setTimeout(function() {
        $(".mensaje").fadeOut(1500);
    },2000);
    
    $("#contenido").load("CancionesServlet?type=pagina");
});

function agregarPlayList (){
    var insert = "<form class='form-inline' method='post' action='PlayListServlet' >\n\
                   <div class='form-group'> <b>Nombre: </b><input type='text' class='form-control' name='nombre'>\n\
    <input type='hidden' name='type' value='nuevo'>\n\
        <input type='submit' class='form-control' value='Crear'> </div>\n\
<form>";
    document.getElementById("agregarPlayList").innerHTML = insert;
}

function cargarPlayList (url){
    $("#contenido").load(url);
}
/**
 * Comment
 */
function eliminarUsuario(usuario) {
    if (confirm("Estas seguro que deseas eliminar al usuario: "+usuario) == true) {
        document.getElementById("frame").src = window.location.protocol + "//" +window.location.host + "/Login-MVC-JSP/Modificar?usuario="+usuario+"&tipomodificacion=eliminar";
    } else {
        return;
    }
}

