package org.soap.service;

import org.soap.dao.StudentDAO;
import org.soap.model.Student;

import java.util.List;

public class ServiceStudent {
    private StudentDAO studentDAO = new StudentDAO();

    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }

    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }
}