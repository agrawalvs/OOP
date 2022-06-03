package com.mycompany.time;


public class greatclock extends Clock {
    int millisec,sec,sign;

    public greatclock(int h, int m, int s, int ms) {
        super(h, m);
        this.millisec = ms;
        this.sec = s;
    }
    
    greatclock add(greatclock obj){
        int nhrs = alltoms() + obj.alltoms();
        int msecc = (int)(nhrs%1000);
        nhrs/=1000;
        int secc = (int) (nhrs%60);
        nhrs/=60;
        int minn = (int)(nhrs%60); 
        int hrss = (int) nhrs/60;
        return new greatclock (hrss,minn,secc,msecc);
    }
    
    greatclock sub(greatclock obj){
        int nhrs = (alltoms() - obj.alltoms());
        
        int msecc = (int)(nhrs%1000);
        nhrs/=1000;
        int secc = (int) (nhrs%60);
        nhrs/=60;
        int minn = (int)(nhrs%60); 
        int hrss = (int) nhrs/60;
        return new greatclock (hrss,minn,secc,msecc);
    }
    
    int alltoms(){
        int mils = hrs*60*60*1000 + min*60*1000 + sec*1000 + millisec;
        return mils;
    }
    
    @Override
    void display(){
        greatclock Obj1;
        if(this.hrs<0){
            greatclock obj6 = new greatclock(24,0,0,0);
            Obj1 = obj6.add(this);
        }
        else if(this.hrs>24){
            greatclock obj6 = new greatclock(24,0,0,0);
            Obj1 = this.sub(obj6);
        }
        else{
            Obj1 = this;
        }
        System.out.println("Time = " + Obj1.hrs +":"+ Obj1.min+ ":" + Obj1.sec + ":" + Obj1.millisec);
    }
}
