package com.mycompany.ta1_4;

import java.util.Scanner;

class Person {
    String AadharID,FirstName,LastName,DOB;
    String date,month,year;
    Person(String id,String Firstname,String Lastname,String DOB){
        AadharID = id;
        FirstName = Firstname;
        LastName = Lastname;
        this.DOB = DOB;
        date = DOB.substring(0,2);
        month = DOB.substring(2,4);
        year = DOB.substring(4,8);
    }

    Person(){}
    void display(){
        System.out.println("Name of the person : " + FirstName + " " +     
                                                              LastName);
        System.out.println("AadharID : " + AadharID);
        System.out.println("DOB : " + date + "/" + month + "/" + year);
    }
}

class doctor extends Person{

    String Specialization,DateOfRegistration;
    String Regdate,Regmonth,Regyear;

    doctor(String sp,String DOR,String Aid,String Fname,String 
                                                Lname,String DOB){
        super(Aid,Fname,Lname,DOB);
        Specialization = sp;
        DateOfRegistration = DOR;
        Regdate = DOR.substring(0,2);
        Regmonth = DOR.substring(2,4);
        Regyear = DOR.substring(4,8);
    }

    @Override
    void display() {
        FirstName = "Dr " + FirstName;
        super.display();
        System.out.println("Date of Registration : " + Regdate + "/" + 
                                               Regmonth + "/" + Regyear);
        System.out.println("Age : " + (2022 - Integer.parseInt(year)) + 
                                                                "years");
        System.out.println("Experience : " + (2022 - 
                                   Integer.parseInt(Regyear)) + "years");
    }
}


public class TA1_4 {

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        String AadharID,FirstName,LastName,Specialization;
        String DateOfRegistration,DOB;
        System.out.println("Enter FirstName : ");
        FirstName = myobj.nextLine();
        System.out.println("Enter LastName  : ");
        LastName = myobj.nextLine();
        System.out.println("Enter Date of Birth(DDMMYYYY) : ");
        DOB = myobj.nextLine();
        System.out.println("Enter AadharID : ");
        AadharID = myobj.nextLine();
        System.out.println("Enter Specialization : ");
        Specialization = myobj.nextLine();
        System.out.println("Enter Date of Registration(DDMMYYYY): ");
        DateOfRegistration = myobj.nextLine();
        doctor obj1 = new doctor(Specialization,DateOfRegistration,AadharID,FirstName,LastName,DOB);
        obj1.display();
    }
}
