package atividade02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SrvletMeuNome")
	public class SrvletMeuNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
	    saida.write("<HTML><BODY>Vitor Hugo Oliveira de Abreu</BODY></HTML>");
	    saida.close();
	}

}
