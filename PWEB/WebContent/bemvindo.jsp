<%@ page import="login.login" import="login.Dao" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Dao d=new Dao();
	String usuario=request.getParameter("login");
	String senha=request.getParameter("password");
%>
</body>
<%	
	boolean isAcertou=false;
	for(int i=0;i<d.l.size();i++){
		login l=d.l.get(i);
		if(l.login.equals(usuario) && l.senha.equals(senha)){
			isAcertou=true;
			%>
					<p>
					bem vindo <%=l.login%>
					</p>
			<%
		}
	}
	
	if(isAcertou==false){
		%>
		<p>Senha ou Login Invalido!!!!!!!!!</p>
s		<% 
	}
%>
</html>