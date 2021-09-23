package Atividade3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletTela1Cadastro")
public class ServletTela1Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter resposta = response.getWriter();
		
		resposta.write("<html>");
		resposta.write("<head>");
		resposta.write("<title>Dados Profissionais</title>");
		resposta.write("</head>");
		resposta.write("<body>");
		resposta.write("<Preencha seus dados profissionais:>");
		resposta.write("<form action=\"ServletTela2Cadastro\">");
		
		resposta.write("<Empresa:<input type=\"text\"name=\"empresa\"> <BR>");
		resposta.write("<Endereço profissional:<BR>");
		resposta.write("Rua: <input type=\"text\" name=\"ruaEmpresa\">");
		resposta.write("Complemento: <input type=\"text\" name=\"complementoEmpresa\"><BR>");
		resposta.write("Cidade: <input type=\"text\" name=\"cidadeEmpresa\">");
		resposta.write("Cep: <input type=\"text\" name=\"cepEmpresa\">");
		resposta.write("Estado: <input type=\"text\" name=\"estadpEmpresa\"><BR>");
		resposta.write("<input type=\"submit\" value=\"Confirmar\"><BR>");
		resposta.write("</form>");
		resposta.write("</body></html>");
	}

}
