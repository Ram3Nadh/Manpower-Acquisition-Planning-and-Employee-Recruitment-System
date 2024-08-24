<%@page import="import com.kl.ep.EPProject.models.Student;" %>
<%@page import="java.util.List"%>
<%@page import="com.kl.ep.services.AdminService"%>
<%@page import="javax.naming.InitialContext"%>

<%
InitialContext context = new InitialContext();
AdminService adminService = (AdminService)context.lookup("java:global/EPProject/AdminServiceImpl!com.kl.ep.services.AdminService");

List<Student1> studlist = adminService.viewallstuds();

%>
<h3 align="center">View All Students</h3>
<table align="center" border="2">
<tr>
<th>ID</th>
<th>Name</th>
<th>Gender</th>
<th>Department</th>
<th>Mail</th>
<th>Contact No</th>
</tr>

<% for(Student1 stud : studlist){ %>
<tr>
<td><%=stud.getId() %></td>
<td><%=stud.getName() %></td>
<td><%=stud.getGender() %></td>
<td><%=stud.getDepartment() %></td>
<td><%=stud.getMail() %></td>
<td><%=stud.getContact()%></td>
</tr>
<%} %>




