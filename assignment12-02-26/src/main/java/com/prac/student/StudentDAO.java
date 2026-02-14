package com.prac.student;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class StudentDAO {

    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("testPU");

    public void saveStudent(Student student) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(student);
        et.commit();

        em.close();
    }

    public Student findStudentById(int id) {
        EntityManager em = emf.createEntityManager();
        Student student = em.find(Student.class, id);
        em.close();
        return student;
    }

    public List<Student> findAllStudents() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Student> query =
                em.createQuery("from Student", Student.class);
        List<Student> list = query.getResultList();
        em.close();
        return list;
    }

    public void updateStudent(Student student) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.merge(student);
        et.commit();

        em.close();
    }

    /* delete student */
    public void deleteStudent(int id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Student student = em.find(Student.class, id);

        et.begin();
        if (student != null) {
            em.remove(student);
        }
        et.commit();

        em.close();
    }

   
    public long countStudents() {
        EntityManager em = emf.createEntityManager();
        long count = em.createQuery(
                "select count(s) from Student s", Long.class)
                .getSingleResult();
        em.close();
        return count;
    }
}
