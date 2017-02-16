package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 *
 * Servlet para almacenar información
 */
@WebServlet("/Save")
public class Save extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = null;
		out = response.getWriter();
		String cedula;
		String nombre;
		String apellido;
		String correo;
		String contrasena;
		
		cedula = request.getParameter("cod");
		nombre = request.getParameter("name");
		apellido = request.getParameter("last");
		correo = request.getParameter("email");
		contrasena = request.getParameter("password");
		
		//Valido que ningún campo este vacio
		if(cedula == null || cedula.trim().equalsIgnoreCase("")
				|| nombre == null || nombre.trim().equalsIgnoreCase("")
				|| apellido == null || apellido.trim().equalsIgnoreCase("")
				|| correo == null || correo.trim().equalsIgnoreCase("")
				|| correo == null || correo.trim().equalsIgnoreCase("")) {
			
			out.println("Vuelva a intentar, tienes campos vacios");
			return;
			
		}
		
		out.println("<!DOCTYPE html>");
		out.println("<head>");
		
		out.println("<meta charset=\"UTF-8\" />");
		out.println("<title>Formulario WEB</title>");
		out.println("<link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">");
		out.println("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>");
		
		out.println("</head>");
		
		
		out.println("<div class=\"container row\">");

		out.println("<h3>Formulario WEB</h3>");
		out.println("<p>Gracias por diligenciar nuestro formulario, por favor"
				+ " revise que todos los campos diligenciados sean correctos:</p>");
		out.println("<table class=\"striped responsive-table col s10 offset-s1\">");
		out.println("<tbody>");
		out.println("<tr>");
		out.println("<td><b>Cedula</b></td>");
		out.println("<td>" + cedula + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><b>Nombre</b></td>");
		out.println("<td>" + nombre + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><b>Apellido</b></td>");
		out.println("<td>"+apellido+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><b>Correo</b></td>");
		out.println("<td>"+correo+"</td>");
		out.println("</tr>");
		out.println("</tbody>");
		out.println("</table>");		
		out.println("</div>");
		out.println("<div class=\"container row\">");

		out.println("<br>Gracias por confiarnos sus datos <b>"+nombre+"</b>");
		out.println("<br>Proyecto desarrollado por Juan Pablo Ospina Herrera cc.1152707477");
		
		out.println("</div>");
		
		
		out.println("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>");
		out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/js/materialize.min.js\"></script>");
		out.close();
	}

}
