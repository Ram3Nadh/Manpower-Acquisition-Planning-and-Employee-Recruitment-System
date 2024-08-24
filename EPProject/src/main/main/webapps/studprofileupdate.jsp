<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="javax.naming.InitialContext"%>
<%@page import="com.kl.ep.models.Student1" %>
<%@page import="com.kl.ep.services.Student1Service" %>

<%
int id = Integer.parseInt(request.getParameter("id"));
String name = request.getParameter("name");
String password = request.getParameter("password");
String contact = request.getParameter("contact");

InitialContext context = new InitialContext();

Student1Service studentService=(Student1Service) context.lookup("java:global/EPProject/Student1ServiceImpl!com.kl.ep.services.Student1Service");

Student1 s=studentService.viewstudentbyid(id);

if(s!=null)
{
	Student1 stud=new Student1();
	stud.setId(id);
	stud.setName(name);
	stud.setPassword(password);
	stud.setContact(contact);
	
	studentService.updateStudent(stud);

	Student1 student=studentService.viewstudentbyid(id);
	session.setAttribute("stud",student );
    out.println("Student Profile Updated Successfully");
}
else
{
	out.println("Id not found");
}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile update</title>
</head>
<body>

</body>
</html>