package time;

import java.util.Scanner;

public class Time {
    int hrs, min;
    
    Time(int h, int m){
        this.hrs = h;
        this.min = m;
    }

    
    Time add(Time obj){
        int nhrs = Math.abs(hrstomin() + obj.hrstomin());
        int minn = (int)(nhrs%60);
        int hrss = (int) (nhrs/60);
        return new Time(hrss,minn);
    }
    
    Time sub(Time obj){
        int nhrs = Math.abs(hrstomin() - obj.hrstomin());
        int minn = (int)(nhrs%60);
        int hrss = (int) (nhrs/60);
        return new Time(hrss,minn);
    }
    
    int hrstomin(){
        return hrs*60 + min;
    }
    
    void display(){
        System.out.println("Time =" + hrs +":"+ min);
    }
    public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);
      
      System.out.println("Enter the no. of great clock object to create:");
      int n = myObj.nextInt();
      greatclock[] obj2 = new greatclock[n];
      for(int i=0; i<n; i++){
          System.out.println("Enter the Hrs min sec millsec for object seprated by space" + i );
          int hrs = myObj.nextInt();
          int min = myObj.nextInt();
          int sec = myObj.nextInt();
          int msec = myObj.nextInt();
          obj2[i] = new greatclock(hrs,min,sec,msec);
      }
      System.out.println("Enter the 1 for addition and 2 for subtraction:");
      int x = myObj.nextInt();
      switch(x){
          case 1 : {
              System.out.println("Enter the object no. for addition seprated by space :");
              int i = myObj.nextInt();
              int j = myObj.nextInt();
              greatclock obj = obj2[i-1].add(obj2[j-1]);
              obj.display();
              break;
          }
          
          case 2 : {
              System.out.println("Enter the object no. for subtraction seprated by space :");
              int i = myObj.nextInt();
              int j = myObj.nextInt();
              greatclock obj = obj2[i-1].sub(obj2[j-1]);
              obj.display();
              break;
          }
          default:{
              System.out.println("Invalid input");
              break;
          }
      }
    }
    
}
