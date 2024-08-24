package com.kl.ep.managedbeans;


import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kl.ep.models.Student1;
import com.kl.ep.services.Student1Service;


@ManagedBean(name="student1bean",eager=true)
public class StudentBean 
{
	
@EJB(lookup = "java:global/EPProject/Student1ServiceImpl!com.kl.ep.services.Student1Service")
Student1Service service;
	
  private int id;
  private String name;
  private String gender;
  private String department;
  private String mail;
  private String password;
  private String contact;
  
  private List<Student1> studlist;
public List<Student1> getStudlist() {
	return service.viewallstuds();
}
public void setStudlist(List<Student1> studlist) {
	this.studlist = studlist;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String add()
{
	Student1 s=new Student1();
    s.setId(id);
    s.setName(name);
   s.setGender(gender);
    s.setDepartment(department);
    s.setMail(mail);
    s.setPassword(password);
    s.setContact(contact);
    
    service.addStudent(s); 
    // This will reset the form submission
    return "studreg.jsf?faces-redirect=true"; 
}
public String delete(int sid)
{
	service.deleteStudent(sid);
	return "viewallstuds.jsf";
}
public void validatelogin() throws IOException
{
	 FacesContext facesContext = FacesContext.getCurrentInstance();
	 ExternalContext externalContext = facesContext.getExternalContext();
	 HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
	 HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
	  
	 Student1 s=service.checkstudlogin(mail, password);
	 
	 if(s!=null)
	 {
		 //return "studhome.jsp";
		 
	   // explicit object
	   HttpSession session = request.getSession();
	  session.setAttribute("stud", s); 
		
	   response.sendRedirect("studhome.jsp");
	 }
	 else
	 {
		 //return "loginfail.jsf";
		 response.sendRedirect("loginfail.jsf");
	 }
}
}
