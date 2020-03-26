package service;

import entity.Student;
import java.rmi.Remote;
import java.rmi.RemoteException;



public interface StudentService extends Remote {

    /**
     *  get student information by studentID
     * @param studentID studentID
     * @return
     * @throws RemoteException
     */
    public Student getByStudentID(String studentID)
            throws RemoteException;
}