package br.com.devinhouse.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Tabuada extends HttpServlet{

	private int numero = 5;
	protected void service (HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        // escreve o texto
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Tabuada do numero " + numero + "</h1>");
        for (int x = 1; x < 11; x++) {
        	 out.println("<h2>" + numero + " + " + x + " = " + numero * x + "</h2>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
