package org.soap.dao;

import org.soap.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

public class StudentDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentPU");

    public StudentDAO() {
        emf = Persistence.createEntityManagerFactory("studentPU");
        if (emf == null) {
            throw new IllegalStateException("EntityManagerFactory not initialized. Check persistence unit name.");
        }
    }

    public void addStudent(Student student) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }

    public void updateStudent(Student student) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(student);
        em.getTransaction().commit();
        em.close();
    }

    public void deleteStudent(int id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Student student = em.find(Student.class, id);
        if (student != null) {
            em.remove(student);
        }
        em.getTransaction().commit();
        em.close();
    }

    public Student getStudent(int id) {
        EntityManager em = emf.createEntityManager();
        Student student = em.find(Student.class, id);
        em.close();
        return student;
    }

    public List<Student> getAllStudents() {
        EntityManager em = emf.createEntityManager();
        List<Student> students = em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
        em.close();
        return students;
    }
}