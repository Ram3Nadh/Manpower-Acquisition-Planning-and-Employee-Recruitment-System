
<%@page import="com.kl.ep.models.Student1" %>

<%
Student1 stud=(Student1) session.getAttribute("stud");
%>

<!DOCTYPE html>
<html>
<head>
<title>Student Home</title>
</head>
<body bgcolor="grey">
<h3 align='center'>Student Profile </h3>
<a href="studhome.jsp">Student Home</a>&nbsp;&nbsp;&nbsp;
<a href="studprofile.jsp">Student Profile</a>&nbsp;&nbsp;&nbsp;
<a href="updatestudprofile.jsp">Update Profile</a>&nbsp;&nbsp;&nbsp;
<a href="studlogout.jsp">Logout</a>&nbsp;&nbsp;&nbsp;
<br/><br/>
<center>
<h3><u>Student Profile</u></h3>
ID:<%=stud.getId()%><br/>
Name:<%=stud.getName() %><br/>
Gender:<%=stud.getGender() %><br/>
Department:<%=stud.getDepartment() %><br/>
MailId<%=stud.getMail() %><br/>
Contact:<%=stud.getContact() %><br/>
</center>
</body>
</html>