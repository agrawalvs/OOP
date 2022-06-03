package employee_attendance;
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
        
    }
    void attendanceinp(){
        Scanner myobj = new Scanner(System.in);
        System.out.println(String.format("Enter Attendance detail informat:"));
        System.out.println("Date,Timein[hh.mm],Timeout[hh.mm]:-");
        for(int i=1; i<=3; i++){
            
             String str = myobj.nextLine();
             String[] strArr = str.split(",");
             double tinn = Double.parseDouble(strArr[1]);
             double toutt = Double.parseDouble(strArr[2]);
            d[i-1] = new attendance(strArr[0],tinn,toutt);
        }
    
    }
    
    void displyattendance(){
        int j=0,W=0;
        System.out.println(String.format("Name: %s, Id: %s, Designation: %s, Salary: %s, Age:%s",Name,id,designation,salary,age));
        System.out.println(Name +"'s Attendance:" );
        for(attendance i: d){
            String p = (i.workinghrs()>0 ? "Present" : "Absent");
            if(p.equals("Present")){
                j+=1;
                W+=i.workinghrs();
            }
            System.out.println("Date:" + i.date +"\t"+ p + "\t Worked hrs: "+ i.workinghrs());
        }
        System.out.println("Days present: "+j+"\tTotal Workin hrs: "+W);
    }
    
}
public class Employee_attendance {
    public static void main(String[] args) {
        
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter number of employes:");
        int n = myobj.nextInt();
        employee [] e = new employee[n];
        myobj.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter details in Format:");
            System.out.println("[Name,ID,Designation,Salary,age]-");
            
             String str = myobj.nextLine();
             String[] strArr = str.split(",");
             e[i]= new employee(strArr[0],strArr[1],strArr[2],strArr[3],strArr[4]);
             e[i].attendanceinp();
        }
        
        for(int i=0;i<n;i++){
            System.out.println("=================================================");
            e[i].displyattendance();
            System.out.println("=================================================");
        }
        
        
    }
}
