<%-- 
    Document   : inicio2
    Created on : 29/11/2016, 05:38:10 PM
    Author     : jonas
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Subir archivo</title>
        <script type="text/javascript" src="./codigo2.js"></script>
    </head>
    <body>
        <form name="formulario" method="post" enctype="multipart/form-data" >
            <table>
                <tr>
                    <td>Seleccione Archivo</td><td><input type="file" onchange="cargarArchivo(this)" name="archivo" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" name="proceso" value="Procesar" /></td>
                </tr>
            </table>
            <input type="hidden" name="nombre" value="" />
        </form>
        <iframe name="null" style="display: none;"></iframe>
    </body>
</html>