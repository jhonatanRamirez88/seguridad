<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
HttpSession objeto=request.getSession(false);
String usuario=(String) objeto.getAttribute("usuario");
if(usuario.equals("")){
 response.sendRedirect("index.jsp");
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido <% out.println(usuario);%></h1>
        <a href="Inicio.jsp">Subir archivos</a>
    </body>
</html>
