package br.com.devinhouse.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Tabuada extends HttpServlet {

	protected void service (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
			out.println("<body>");
				out.println("<h1>Tabuada completa!</h1>");
				out.println("<table>");
					out.println("<tr>");
						out.println("<th> Multiplicador </th>");
						for(int x = 1; x < 11; x++) {
							out.println("<th>" + x + "</th>");
						}
						for(int x = 1; x < 11; x++) {
							out.println("<tr>");
							out.println("<th>" + x + "</th>");
							for(int y = 1; y < 11; y++) {
								out.println("<th>" + x * y + "</th>");
							}
							out.println("</tr>");
						}
					out.println("<tr>");
				out.println("</table>");
			out.println("</body>");
		out.println("</html>");
	}
}
