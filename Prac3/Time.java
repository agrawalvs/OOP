package com.mycompany.time;
import java.util.Scanner;

public class Time {
    
    static void Clock_main(){
        Scanner myObj = new Scanner(System.in);
      
        System.out.println("Enter the no. of clock object to create:");
        int n = myObj.nextInt();
        Clock[] obj2 = new Clock[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the Hrs min for object seprated by space" + i );
            int hrs = myObj.nextInt();
            int min = myObj.nextInt();
            obj2[i] = new Clock(hrs,min);
        }
        System.out.println("Enter the 1 for addition and 2 for subtraction:");
        int x = myObj.nextInt();
        switch(x){
            case 1 : {
                System.out.println("Enter the object no. for addition seprated by space :");
                int i = myObj.nextInt();
                int j = myObj.nextInt();
                Clock obj = obj2[i-1].add(obj2[j-1]);
                obj.display();
                break;
            }

            case 2 : {
                System.out.println("Enter the object no. for subtraction seprated by space :");
                int i = myObj.nextInt();
                int j = myObj.nextInt();
                Clock obj = obj2[i-1].sub(obj2[j-1]);
                obj.display();
                break;
            }
            default:{
                System.out.println("Invalid input");
                break;
            }
        }
    }
    
    static void greatclock_main(){
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
    
    static void Timezone_main(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Time in [hrs min timezone]format seprated by space:");
        int hrs = myObj.nextInt();
        int min = myObj.nextInt();
        double Timez = myObj.nextDouble();
        Timezone obj1 = new Timezone(hrs,min,Timez);
        Timezone obj2 = obj1.timechange();
        System.out.print("Time before : ");
        obj1.display();
        System.out.print("Time After : ");
        obj2.display();
    }
    
    
    
    
    public static void main(String[] args) {
     /**/
        Scanner myObj = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("1. Clock object ");
        System.out.println("2. Great Clock Object");
        System.out.println("3. Timezone Change Object");
        System.out.println("-------------------------------------------------");
        int x = myObj.nextInt();
        switch(x){
            case 1 :
                Clock_main();
                break;
            case 2 :
                greatclock_main();
                break;
            case 3 :
                Timezone_main();
                break;
            default:{
                System.out.println("Invalid input");
                break;
            }
        }
    }
    
}
