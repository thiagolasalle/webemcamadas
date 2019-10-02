<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.*, model.Pessoa, model.Endereco" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
		<title>Listagem de Pessoas</title>
	</head>
	<body>
		<div align="center">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>E-mail</th>
					<th>Telefone</th>
					<th>Endere�os</th>
					<th>...</th>
				</tr>
				<%
					List<Pessoa> pessoas = (List<Pessoa>)request.getAttribute("listaPessoas");
					//for(Iterator i = pessoas.iterator(); i.hasNext();) {
						//Pessoa p = (Pessoa)i.next();
					for (Pessoa p : pessoas) {
				%>
						<tr>
							<td>
								<%= p.getId() %>
							</td>
							<td>
								<%= p.getNome() %>
							</td>
							<td>
								<%= p.getEmail() %>
							</td>
							<td>
								<%= p.getTelefone() %>
							</td>
							<td>
								<%
								for (Endereco end : p.getEnderecos())
								{
								%>
								
								<%= end.toString() %>
								<br />
								
								<%
								}
								%>
							</td>
							<td>
								<a href="ExcluirPessoaServlet?id=<%= p.getId() %>">Excluir</a>
							</td>
						</tr>
				<%
					}
				%>
			</table>
		</div>
		<div id="msg">
			<%
				if(request.getAttribute("msg") != null)	{
			%>
				<p><%= request.getAttribute("msg") %></p>
			<%
				}
			%>
		</div>
		<a href="index.jsp">Home Page</a>
	</body>
</html>