package ProvaAvaliativa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPrimeiroUltimoNome
 */
@WebServlet("/ServletPrimeiroUltimoNome")
public class ServletPrimeiroUltimoNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPrimeiroUltimoNome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
	    saida.write("<HTML><BODY>"); 
	    saida.write("Oi!" + request.getParameter("Nome") + request.getParameter("ultimoNome")+ "!!!");
	    saida.write("<HTML><BODY>");
	    saida.close();
	}

}
