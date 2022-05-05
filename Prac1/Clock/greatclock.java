/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;


public class greatclock extends Time {
    int millisec,sec,sign;

    public greatclock(int h, int m, int s, int ms) {
        super(h, m);
        this.millisec = ms;
        this.sec = s;
    }
    
    greatclock add(greatclock obj){
        int nhrs = Math.abs(alltoms() + obj.alltoms());
        int msecc = (int)(nhrs%1000);
        nhrs/=1000;
        int secc = (int) (nhrs%60);
        nhrs/=60;
        int minn = (int)(nhrs%60); 
        int hrss = (int) nhrs/60;
        return new greatclock (hrss,minn,secc,msecc);
    }
    
    greatclock sub(greatclock obj){
        int nhrs = Math.abs(alltoms() - obj.alltoms());
        
        int msecc = (int)(nhrs%1000);
        nhrs/=1000;
        int secc = (int) (nhrs%60);
        nhrs/=60;
        int minn = (int)(nhrs%60); 
        int hrss = (int) nhrs/60;
        if(alltoms() < obj.alltoms()){
            hrs = - hrs;
        }
        return new greatclock (hrss,minn,secc,msecc);
    }
    
    int alltoms(){
        int mils = hrs*60*60*1000 + min*60*1000 + sec*1000 + millisec;
        return mils;
    }
    
    void display(){
        System.out.println("Time = " + hrs +":"+ min+ ":" + sec + ":" + millisec);
    }
}
