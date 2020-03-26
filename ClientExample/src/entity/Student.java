package entity;

import java.util.Objects;

public class Student
{
    private String studentID;
    private String name;
    private String classID;
    private String phone;
    private String email;
    private String address;

    public Student(String studentID, String name, String classID, String phone, String email, String address)
    {
        this.studentID = studentID;
        this.name = name;
        this.classID = classID;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Student(String studentID)
    {
        this.studentID = studentID;
    }

    public String getStudentID()
    {
        return studentID;
    }

    public void setStudentID(String studentID)
    {
        this.studentID = studentID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getClassID()
    {
        return classID;
    }

    public void setClassID(String classID)
    {
        this.classID = classID;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getStudentID(), student.getStudentID());
    }

    @Override
    public String toString()
    {
        return "entity.Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", classID='" + classID + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
