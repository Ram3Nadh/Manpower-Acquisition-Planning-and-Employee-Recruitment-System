package com.kl.ep.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_records")
public class Student1 implements Serializable 
{
  @Id
  @Column(name="std_id",nullable=false,length=30)
  private int id;
  @Column(name="std_name",nullable=false,length=50)
  private String name;
  @Column(name="std_gender",nullable=false,length=10)
  private String gender;
  @Column(name="std_department",nullable=false,length=50)
  private String department;
  @Column(name="std_mail",nullable=false,length=50,unique=true)
  private String mail;
  @Column(name="std_password",nullable=false,length=50)
  private String password;
  @Column(name="std_contact",nullable=false,length=20,unique=true)
  private String contact;
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
@Override
public String toString() {
	return "Student1 [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department + ", mail="
			+ mail + ", password=" + password + ", contact=" + contact + "]";
}
}
