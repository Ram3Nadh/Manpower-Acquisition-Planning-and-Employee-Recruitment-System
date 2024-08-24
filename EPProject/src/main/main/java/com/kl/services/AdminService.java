package com.kl.ep.services;

import java.util.List;

import javax.ejb.Remote;

import com.kl.ep.models.Admin;
import com.kl.ep.models.Student1;
 
@Remote
public interface AdminService 
{
	public Admin checkadminlogin(String username,String password);
	public List<Student1> viewallstuds();
	public long studcount();


}
