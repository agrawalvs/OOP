package com.mycompany.time;

public class Clock {
    int hrs, min;
    
    Clock(int h, int m){
        this.hrs = h;
        this.min = m;
    }

    
    Clock add(Clock obj){
        int nhrs =(hrstomin() + obj.hrstomin());
        int minn = (int)(nhrs%60);
        int hrss = (int) (nhrs/60);
        return new Clock(hrss,minn);
    }
    
    Clock sub(Clock obj){
        int nhrs = (hrstomin() - obj.hrstomin());
        int minn = (int)(nhrs%60);
        int hrss = (int) (nhrs/60);
        return new Clock(hrss,minn);
        
    }
    
    int hrstomin(){
        return hrs*60 + min;
    }
    
    void display(){
        Clock Obj1;
        if(this.hrs<0){
            Clock obj6 = new Clock(24,0);
            Obj1 = obj6.add(this);
        }
        else if(this.hrs>24){
            Clock obj6 = new Clock(24,0);
            Obj1 = this.sub(obj6);
        }
        else{
            Obj1 = this;
        }
        System.out.println("Clock =" + Obj1.hrs +":"+ Obj1.min);
    }
}
