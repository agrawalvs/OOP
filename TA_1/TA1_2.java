package com.mycompany.ta1_2;

import java.util.Scanner;

class Student {
    int roll;
    String name;

    Student(String name,int roll){
        this.name = name;
        this.roll = roll;
    }

    Student(){}
}
interface Assignment{
    void getAssignment1Marks(int m1);
    void getAssignment2Marks(int m2);
}

interface test{
    void getTest1Marks(int t1);
    void getTest2Marks(int t2);
}



class internal extends Student implements test,Assignment{
    int m1,m2,t1,t2;
    internal(String name,int roll,int t1,int t2,int m1,int m2){
       super(name,roll);
       this.m1=m1;
       this.m2=m2;
       this.t1=t1;
       this.t2=t2;

    }

    internal(){}

    @Override
    public void getAssignment1Marks(int m1) {
        System.out.println("Assignment 1 marks =" + m1);
    }
    
    @Override
    public void getAssignment2Marks(int m2) {
        System.out.println("Assignment 2 marks = " + m2);
    }
    
    @Override
    public void getTest1Marks(int t1) {
        System.out.println("Test 1 marks =" + t1);
    }

    @Override
    public void getTest2Marks(int t2) {
        System.out.println("Test 2 marks =" + t2);
    }

    

    void display(){
        int internalm = t1 + t2 + m1 + m2;
        System.out.println("Name of the Student : " + super.name);
        System.out.println("Student Roll Number : " + super.roll);
        getAssignment1Marks(m1);
        getAssignment2Marks(m2);
        getTest1Marks(t1);
        getTest2Marks(t2);
        System.out.println("Total internal marks =" +internalm);

    }
}

public class TA1_2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name;
        int roll,t1,t2,m1,m2;
        System.out.println("Enter name of the student : ");
        name = obj.nextLine();
        System.out.println("Enter student Roll number : ");
        roll = obj.nextInt();
        System.out.println("Enter marks of Assignment and tests : ");
        m1 = obj.nextInt();
        m2 = obj.nextInt();
        t1 = obj.nextInt();
        t2 = obj.nextInt();
        
        internal obj1 = new internal(name,roll,t1,t2,m1,m2);
        obj1.display();
    }
}
