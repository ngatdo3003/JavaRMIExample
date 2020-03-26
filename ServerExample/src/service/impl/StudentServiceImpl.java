package service.impl;

import entity.Student;
import service.StudentService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class StudentServiceImpl extends UnicastRemoteObject implements StudentService
{
    private static final long serialVersionUID = 1L;
    public static ArrayList studentList = new ArrayList();
    public StudentServiceImpl() throws RemoteException
    {
        super();
        studentList.add(new Student("17020001","Do Thi Hong Ngat", "K62-CA-CLC1", "0123456787","dthn@gmail.com","address test"));
        studentList.add(new Student("17020002","Hoang Son Tung", "K62-CA-CLC1", "0123456788","hst@gmail.com","address test"));
        studentList.add(new Student("17020003","Le Cao Tung Lam", "K62-CA-CLC1", "0123456789","lctl@gmail.com","address test"));

    }

    @Override
    public Student getByStudentID(String studentID) throws RemoteException
    {
        System.out.println("get " + studentID);
        int index = studentList.indexOf(new Student(studentID));
        if (index!=-1) {
            return  (Student) studentList.get(index);
        }
        return null;
    }
}
