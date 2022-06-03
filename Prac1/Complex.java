package com.mycompany.complex;

import java.util.Scanner;


public class Complex {
    int r, i;

    Complex(int r,int i){
        this.r = r;
        this.i = i;
    } 
    static Complex add(Complex x, Complex y){
        int real = x.r + y.r;
        int img  = x.i + y.i;
        return new Complex(real,img);
    }
    static Complex multipy(Complex x,Complex y){
        int real = (x.r * y.r) + (x.i * y.i);
        int img  = (x.r * y.i) + (x.i * y.r);
        return new Complex(real,img); 
    }
    
    static void display(Complex x){
        System.out.println("the complex number is :"+x.r+" + i"+x.i+"\n");
    }
    public static void main(String[] args) {
        int real, img;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first complex number format[rr ii] ");
        real = myObj.nextInt();
        img = myObj.nextInt();
        Complex obj1 = new Complex(real,img);
        System.out.println("Enter second complex number format[rr ii]");
        real = myObj.nextInt();
        img = myObj.nextInt();
        Complex obj2 = new Complex(real,img);
        Complex z = multipy(obj1,obj2);
        System.out.println("multiplication of complex number:");
        display(z);
        z = add(obj1, obj2);
        System.out.println("Addition of complex number:");
        display(z);
    }
}