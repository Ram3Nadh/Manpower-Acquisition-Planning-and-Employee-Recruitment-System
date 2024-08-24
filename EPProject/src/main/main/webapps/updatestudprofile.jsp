<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.kl.ep.models.Student1" %>
<%@page import="com.kl.ep.services.Student1Service" %>
<%
Student1 stud=(Student1)session.getAttribute("stud");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Profile</title>
</head>
<body bgcolor="maroon">
<h3 align='center'>Update Profile</h3>
<a href="studhome.jsp">Student Home</a>&nbsp;&nbsp;&nbsp;
<a href="studprofile.jsp">Student Profile</a>&nbsp;&nbsp;&nbsp;
<a href="updatestudprofile.jsp">Update Profile</a>&nbsp;&nbsp;&nbsp;
<a href="studlogout.jsp">Logout</a>&nbsp;&nbsp;&nbsp;
<br/><br/>
<h3 align="center"><u>Update Student Profile</u></h3>
<center>
<form method="post"  action="studprofileupdate.jsp">
<table align="center">
<tr>
    <td><b>ID</b></td>
    <td>
        <input type="number" name="id"  value="<%=stud.getId()%>"  required>
    </td>
</tr>
<tr><td></td></tr>
<tr>
    <td><b>Enter Name</b></td>
    <td>
        <input type="text" name="name" value="<%=stud.getName()%>" required>
    </td>
</tr>
<tr><td></td></tr>

<tr>
    <td><b>Enter Password</b></td>
    <td>
        <input type="password" name="password" value="<%=stud.getPassword()%>" required>
    </td>
</tr>
<tr><td></td></tr>
<tr>
    <td><b>Enter Contact</b></td>
    <td>
        <input type="number" name="contact" value="<%=stud.getContact()%>" required>
    </td>
</tr>
<tr><td></td></tr>
<tr><td></td></tr>
<tr align="center">
    <td>
        <input type="submit" value="Update" required>
    </td>
    <td>
        <input type="reset" value="Clear" required>
    </td>
</tr>
</table>
</form>
</center>
</body>
</html>