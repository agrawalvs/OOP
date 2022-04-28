/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_attendance;
import java.lang.Math;
/**
 *
 * @author SRCOEM
 */
public class Employee_attendance {

    class attendance{
     String date;
     double tin;
     double tout;
     attendance (String date, double tin, double tout){
         this.date = date;
         this.tin = tin;
         this.tout = tout;
     }
     double workinghrs(double tin, double tout){
         int tinmin = hrstomin(tin);
         int toutmin = hrstomin(tout);
         return mintohrs(toutmin-tinmin);
     }
     
     int hrstomin(double  t){
         t = t*100;
         int min = (int) (t%100);
         t = (int)t/100;
         min = (int) (min + t*60);
         return min;
     }
     
     double mintohrs(int m){
         double min = (m%60)/100;
         double hrs = (int)(m/60);
         return hrs+min;
     }
    }
    
    class employee_data{
        String id;
        String name;
        int age;
        String Designation,salary;
        attendance[] d = new attendance [3];
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
