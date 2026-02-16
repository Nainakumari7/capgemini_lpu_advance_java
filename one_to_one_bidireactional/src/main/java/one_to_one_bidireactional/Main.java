package one_to_one_bidireactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("postgres");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Passport passport = new Passport();
        passport.setId(101);
        passport.setName("Indian Passport");
        passport.setDob(1999);

        Person person = new Person();
        person.setId(1);
        person.setName("Rahul");
        person.setPhone_no(987654321);
        person.setEmail("rahul@gmail.com");

        person.setPassport(passport);
        passport.setPerson(person);

        et.begin();
        em.persist(passport);
        em.persist(person);
        et.commit();
    }
}
