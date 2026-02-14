package com.prac.student;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StudentDAOTest {

    private static StudentDAO dao;
    private static int studentId;

    @BeforeAll
    public static void setup() {
        dao = new StudentDAO();
    }

    @Test
    public void testSaveStudent() {
        Student s = new Student();
        s.setName("Rohit");
        s.setEmail("rohit@gmail.com");
        s.setMarks(78);

        dao.saveStudent(s);
        studentId = s.getId();

        assertTrue(studentId > 0);
    }

    @Test
    public void testFindStudentById() {
        Student student = dao.findStudentById(studentId);
        assertNotNull(student);
    }

    @Test
    public void testFindAllStudents() {
        List<Student> list = dao.findAllStudents();
        assertTrue(list.size() > 0);
    }

    @Test
    public void testUpdateStudent() {
        Student student = dao.findStudentById(studentId);
        student.setMarks(85);

        dao.updateStudent(student);

        Student updated = dao.findStudentById(studentId);
        assertEquals(85, updated.getMarks());
    }

    @Test
    public void testStudentCount() {
        long count = dao.countStudents();
        assertTrue(count > 0);
    }

    @Test
    public void testDeleteStudent() {
        dao.deleteStudent(studentId);
        Student student = dao.findStudentById(studentId);
        assertNull(student);
    }

    @AfterAll
    public static void cleanup() {
    }
}
