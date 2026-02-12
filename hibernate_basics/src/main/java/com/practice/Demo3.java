package com.practice;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Demo3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();

//		EntityTransaction
		EntityTransaction et = em.getTransaction();
		
		Student student = em.find(Student.class, 2);
		
		System.out.println(student.getName());
		
		
		if(student!=null) {
			student.setDob("15/07/2004");
			et.begin();
			em.merge(student);
			et.commit();
			emf.close();
		}

	}

}
