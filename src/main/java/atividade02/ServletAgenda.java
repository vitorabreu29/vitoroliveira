package atividade02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
	    saida.write("<HTML><BODY>Nome:</BODY></HTML>"); 
	    saida.write("<HTML><BODY>Telefone:</BODY></HTML>");
	    saida.write("<HTML><BODY>Data de Nascimento:</BODY></HTML>");
	    saida.write("Resposta do metodo GET");
	    saida.close(); 
	   
	}

}
