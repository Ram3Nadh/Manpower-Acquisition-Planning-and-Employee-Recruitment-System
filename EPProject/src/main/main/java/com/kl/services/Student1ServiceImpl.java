package com.kl.ep.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.kl.ep.models.Student1;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class Student1ServiceImpl implements Student1Service{

	@Override
	public String addStudent(Student1 student) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");		
		 EntityManager em=emf.createEntityManager();
		 
		 em.getTransaction().begin();
		 em.persist(student);
		 em.getTransaction().commit();
		 
		 em.close();
		 emf.close();
			return "Student Registered Successfully";
	}

	@Override
	public String updateStudent(Student1 student) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");		
		 EntityManager em=emf.createEntityManager();
		 
		 em.getTransaction().begin();
		 Student1 s=em.find(Student1.class, student.getId());
		 s.setContact(student.getContact());
		 s.setName(student.getName());
		 s.setPassword(student.getPassword());
		 em.getTransaction().commit();
		 em.close();
		 emf.close();
		return "Student Updated Successfully";
	}

	@Override
	public String deleteStudent(int sid) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");		
		 EntityManager em=emf.createEntityManager();
		 
		 em.getTransaction().begin();
		 Student1 s=em.find(Student1.class, sid);
		 em.remove(s);
		 em.getTransaction().commit();
		 em.close();
		 emf.close();
		return "Student Deleted Successfully";
	}

	@Override
	public List<Student1> viewallstuds() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");		
		 EntityManager em=emf.createEntityManager();
		 
		 Query qry=em.createQuery("select s from Student1 s");
		List<Student1> studlist=qry.getResultList();
		em.close();
		 emf.close();
		 
		return studlist;
	}

	@Override
	public Student1 viewstudentbyid(int sid) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");		
		 EntityManager em=emf.createEntityManager();
		 Student1 s=em.find(Student1.class, sid);
		 em.close();
		 emf.close();
		return s;
	}

	@Override
	public Student1 checkstudlogin(String mail, String password) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		
	
		Query qry = em.createQuery("select s from Student1 s where s.mail=? and s.password=?  ");
		qry.setParameter(1, mail);
		qry.setParameter(2, password);
		
        Student1 stud = null;
        
        if(qry.getResultList().size()>0)
        {
        	stud = (Student1) qry.getSingleResult();
        }
		em.close();
		emf.close();
		
		return stud;
	}

	@Override
	public String updateStudentPass(Student1 student) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");		
		 EntityManager em=emf.createEntityManager();
		 
		 em.getTransaction().begin();
		 Student1 s=em.find(Student1.class, student.getId());
		 s.setPassword(student.getPassword());
		 em.getTransaction().commit();
		 em.close();
		 emf.close();
		return "Student Password Updated Successfully";
	}

}
