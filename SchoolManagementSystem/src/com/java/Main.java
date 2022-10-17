package com.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher b = new Teacher(1,"Bharathi",500);
        Teacher l = new Teacher(2,"Lekha",700);
        Teacher g = new Teacher(3,"Geetha",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(b);
        teacherList.add(l);
        teacherList.add(g);


        Student s = new Student(1,"Subi",4);
        Student d = new Student(2,"Deva",12);
        Student h = new Student(3,"Dharshini",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(s);
        studentList.add(d);
        studentList.add(h);


        School sms = new School(teacherList,studentList);

        Teacher se = new Teacher(6,"Seshu", 900);

        sms.addTeacher(se);


        s.payFees(5000);
        h.payFees(6000);
        System.out.println("SM School has earned "+ sms.getTotalMoneyEarned());
        

        System.out.println("           Making SCHOOL PAY SALARY          ");
        b.receiveSalary(b.getSalary());
        
        System.out.println("SM School has spent for salary to " + b.getName()
        +" and now has " + sms.getTotalMoneyEarned());

        g.receiveSalary(g.getSalary());
        System.out.println("SM School has spent for salary to " + g.getName()
                +" and now has " + sms.getTotalMoneyEarned());


        System.out.println(d);

        l.receiveSalary(l.getSalary());

        System.out.println(l);

    }
}