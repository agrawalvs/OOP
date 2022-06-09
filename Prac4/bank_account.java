
package bankaccount;

import java.util.Scanner;

class bank_account{
    String acc_no;
    double adhaar_no;
    String name;
    int roi;
    int balance;
    Scanner myobj = new Scanner(System.in);
    
    bank_account(String acc_no,double adhaar_no,String name,int roi,int balance){
        this.acc_no=acc_no;
        this.adhaar_no=adhaar_no;
        this.name=name;
        this.roi=roi;
        this.balance=balance;
    }
    
    void open_account(){
        System.out.println(" Account Successfully Opened");
    }
    
    void close_account(){
        System.out.println(" Your remaining balance is " + balance);
        System.out.println(" Account Successfully closed");
    }
    
    void deposit(){
        System.out.println(" Enter Amount to add :");
        int am = myobj.nextInt();
        balance += am;
        System.out.println(" Amount Successfully deposited");
    }
    
    void update_interest(int yrs){
        int amt = balance*5/100;
        System.out.println(" Rate Successfully updated");
        balance = amt+balance;
    }
}
