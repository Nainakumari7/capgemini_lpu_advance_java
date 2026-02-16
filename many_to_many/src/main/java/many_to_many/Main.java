package many_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Subject sub1 = new Subject();
		sub1.setId(101);
		sub1.setName("Java");
		sub1.setNo_of_days(10);
		
		Subject sub2 = new Subject();
		sub2.setId(102);
		sub2.setName("SQL");
		sub2.setNo_of_days(20);
		
		Subject sub3 = new Subject();
		sub3.setId(103);
		sub3.setName("Python");
		sub3.setNo_of_days(30);
		
		List<Subject> sub = new ArrayList();
		sub.add(sub1);
		sub.add(sub2);
		sub.add(sub3);
		
		Student s1 = new Student();
		s1.setName("Bob");
		s1.setGender("Male");
		s1.setBranch("CSE");
		
		Student s2 = new Student();
		s2.setName("Taylor");
		s2.setGender("Female");
		s2.setBranch("ECE");
		
		et.begin();
        em.persist(sub1);
        em.persist(sub2);
        em.persist(sub3);
        em.persist(s1);
        em.persist(s2);
        et.commit();

        
	}

}
