package com.kl.ep.services;

import java.util.List;

import javax.ejb.Remote;

import com.kl.ep.models.Student1;


@Remote
public interface Student1Service 
{
  public String addStudent(Student1 student);
  public String updateStudent(Student1 student);
  public String updateStudentPass(Student1 student);
  public String deleteStudent(int sid);
  public List<Student1> viewallstuds();
  public Student1 viewstudentbyid(int sid);
  
  public Student1 checkstudlogin(String mail,String password);
}
