package org.soap.server;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.soap.model.Student;
import org.soap.service.ServiceStudent;

@WebService
public class ServerSoap {
    private ServiceStudent serviceStudent;

    public ServerSoap() {
        serviceStudent = new ServiceStudent();
    }

    @WebMethod(operationName = "getAllStudents")
    public String getAllStudents() {
        return serviceStudent.getAllStudents().toString();
    }

    @WebMethod(operationName = "addStudent")
    public void addStudent(Student student) {
        serviceStudent.addStudent(student);
    }

    @WebMethod(operationName = "updateStudent")
    public void updateStudent(Student student) {
        serviceStudent.updateStudent(student);
    }

    @WebMethod(operationName = "deleteStudent")
    public void deleteStudent(int id) {
        serviceStudent.deleteStudent(id);
    }

    @WebMethod(operationName = "getStudent")
    public Student getStudent(int id) {
        return serviceStudent.getStudent(id);
    }
}