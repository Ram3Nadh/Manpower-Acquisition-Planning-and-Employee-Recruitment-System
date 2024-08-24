<%@page import="com.kl.ep.models.Admin" %>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.util.List"%>
<%@page import="javax.ejb.EJB"%>
<%
Admin admin = (Admin) session.getAttribute("admin");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
</head>
<body bgcolor="lightgrey">
<h3 align='center'>Admin Page</h3>
<a href="adminhome.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<a href="displaystuds.jsp">View All Students</a>&nbsp;&nbsp;&nbsp;
<a href="adminlogin.jsf">Logout</a>&nbsp;&nbsp;&nbsp;
<br/><br/>
Welcome <%=admin.getUsername()%>
</body>
</html>