package com.mycompany.employee_attendence;

import java.util.Scanner;


class attendance{
     String date;
     double tin;
     double tout;
     attendance (String date, double tin, double tout){
         this.date = date;
         this.tin = tin;
         this.tout = tout;
     }
    double workinghrs(){
         int tinmin = hrstomin(tin);
         int toutmin = hrstomin(tout);
         return mintohrs((toutmin-tinmin));
     }
     
    int hrstomin(double  t){
         t = t*100;
         int min = (int) (t%100);
         t = (int)(t/100);
         min = (int) ((min + t*60));
         return min;
     }
     
     double mintohrs(int m){
         double min = (m%60);
         double hrs = ((m - min)/60);
         return hrs + min/100;
     }
}

class employee{
    String Name, id, designation, salary, age;
    attendance[] d = new attendance [3];
    employee(String Name, String id, String designation, String salary, String age){
        this.Name = Name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        this.id = id;
        attendanceinp(d);
    }
    void attendanceinp(attendance[] d){
        Scanner myobj = new Scanner(System.in);
        for(int i=1; i<=3; i++){
            System.out.println(String.format("Enter Date %d:",i));
            if(i>=2){
                myobj.nextLine();
            }
            String date = myobj.nextLine();
            System.out.println(String.format("Enter time in %d:",i));
            double tin = myobj.nextDouble();
            System.out.println(String.format("Enter time out %d:",i));
            double tout = myobj.nextDouble();
            d[i] = new attendance(date, tin, tout);
        }
    
    }
    
}

public class Employee_Attendence {

    public static void main(String[] args) {
        employee e1 = new employee("ved", "111", "CEO", "24,00,000","21");
        
    }
}
