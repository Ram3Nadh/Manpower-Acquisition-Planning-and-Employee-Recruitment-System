<%@page import="com.kl.ep.models.Student1" %>
<%
Student1 stud=(Student1)session.getAttribute("stud");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body bgcolor="lightgrey" >

<h3 align='center'>Student Home</h3>
<a href="studhome.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<a href="viewevents.jsf">Events</a>&nbsp;&nbsp;&nbsp;
<a href="viewallstuds.jsf">Student List</a>&nbsp;&nbsp;&nbsp;
<a href="studprofile.jsp">Student Profile</a>&nbsp;&nbsp;&nbsp;
<a href="studlogout.jsp">Logout</a>&nbsp;&nbsp;&nbsp;
<center>
<img src="images/event.jpeg" alt="Project Image"/>
</center>
<br/>
<h3>I am in Student Home</h3>
</body>
</body>
</html>