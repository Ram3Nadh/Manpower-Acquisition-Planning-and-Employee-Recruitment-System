package com.kl.ep.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.kl.ep.models.Admin;
import com.kl.ep.models.Student1;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class AdminServiceImpl implements AdminService {

	@Override
	public Admin checkadminlogin(String username, String password) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		// a is an alias of Admin Class
		Query qry = em.createQuery("select a from Admin a where a.username=? and a.password=? ");
		qry.setParameter(1, username);
		qry.setParameter(2, password);
		
        Admin admin = null;
        
        if(qry.getResultList().size()>0)
        {
        	admin = (Admin) qry.getSingleResult();
        }
		em.close();
		emf.close();
		
		return admin;
	}

	@Override
	public List<Student1> viewallstuds() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		Query qry = em.createQuery("select s from Student1 s");
		// s is an alias of Student1 Class
		List<Student1> studlist = qry.getResultList();
		
	    em.close();
	    emf.close();
	    
	    return studlist;
	}

	@Override
	public long studcount() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
		Query qry=em.createQuery("select count(*) from Student1");
		List list=qry.getResultList();
		
		long count=(long) list.get(0);
		return count;
	}

}
