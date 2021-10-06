<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apresenta a quantidade de acessos a esta pagina</title>
</head>
<body>
<% Aula08.Contador.novoAcesso(); %>

Quantidade de acessos a esta página:
<b><%= Aula08.Contador.getQuantidadeAcessos() %></b>
</body>
</html>