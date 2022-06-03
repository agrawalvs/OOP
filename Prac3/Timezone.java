package com.mycompany.time;

import java.util.Scanner;


class Timezone extends Clock {
    double Tzone;
    
    Timezone(int h, int m, double Tzone ){
        super(h,m);
        this.Tzone = Tzone;
    }
    
    Clock zonetoclock(double Tzone){
        int h, m;
        m = (int) ((Tzone*100)%100);
        h = (int) (Tzone%24);
        return new Clock(h,m);
    }
    
    Timezone timechange(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter time Zone to Change :");
        double Tzone2 = obj.nextDouble();
        Clock obj1 = zonetoclock(Tzone);
        Clock obj2 = zonetoclock(Tzone2);
        Clock obj3 = obj2.sub(obj1);
        Clock obj4 = new Clock(this.hrs,this.min);
        Clock obj5 = obj4.add(obj3);
        if(obj5.hrs<0){
            Clock obj6 = new Clock(24,0);
            obj5 = obj6.add(obj5);
        }
        else if(obj5.hrs>24){
            Clock obj6 = new Clock(24,0);
            obj5 = obj5.sub(obj6);
        }
        return new Timezone(obj5.hrs,obj5.min,Tzone2);
    }
    
    @Override
    void display(){
        System.out.println("[Time = "+this.hrs+":"+this.min+"\tTimeZone : "+this.Tzone+"]");
    }
}
