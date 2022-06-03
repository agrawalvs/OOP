package com.mycompany.ta1_5;

class box{
    static double l,b,h,vol;
    static int num=0;
    
    box(double l,double b,double h) {
        num++;
        this.l = l;
        this.b = b;
        this.h = h;
    }

    static void volume(){
        vol = l*b*h;
        System.out.println("Volume of the box : " + vol + " units");
    }

    void objects(){
        System.out.println("Number of box objects created : " + num);
    }
}

public class TA1_5 {

    public static void main(String[] args) {
        box obj1 = new box(1,1,1);
        obj1.volume();
        box obj2 = new box(1,2,3);
        obj2.volume();
        box obj3 = new box(4,9,5);
        obj3.volume();
        obj3.objects();
    }
}
