package com.prueba;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class ProcesoArchivo
 */
@WebServlet("/ProcesoArchivo")
@MultipartConfig
public class ProcesoArchivo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcesoArchivo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("Bienvenido");
		String nomb = request.getParameter("nombre");
		Part arch = request.getPart("archivo");
		InputStream is = arch.getInputStream();
		File f = new File("/home/jonas/Documentos/jars/WebSubidaArchivo/build/web/claves/"+nomb);
		FileOutputStream ous = new FileOutputStream(f);
		int dato = is.read();
		while(dato != -1){
			ous.write(dato);
			dato = is.read();
		}
		
		ous.close();
		is.close();
	}
}
