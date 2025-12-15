package edu.icet.demo.service;

import edu.icet.demo.Student;

import java.rmi.StubNotFoundException;

public class StudentService {

    public Student getStudent(){

        Student std = new Student();
        std.setName("venuri");
        std.setAge("20");

        Student std2 = new Student("Venuri","20");
        return std;
    };
}
