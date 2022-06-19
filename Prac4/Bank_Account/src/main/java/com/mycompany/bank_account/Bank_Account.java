package com.mycompany.bank_account;

import java.util.Scanner;

public class Bank_Account{
    String acc_no;
    double adhaar_no;
    String name;
    int roi;
    int balance;
    Scanner myobj = new Scanner(System.in);
    
    Bank_Account(String acc_no,double adhaar_no,String name,int roi,int balance){
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
    
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter 1 for savings account and 2 for Fix deposit");
        n=in.nextInt();
        
        System.out.println("Enter Account number:");
        in.nextLine();
        String an=in.nextLine();
        System.out.println("Enter Aadhar number:");
        double uid=in.nextDouble();
        System.out.println("Enter Account holders name:");
        in.nextLine();
        String name=in.nextLine();
        System.out.println("Enter Rate of intrest:");
        int r = in.nextInt();
        System.out.println("Enter amount :");
        int b = in.nextInt();
        
        if (n==1){
            saving_account obj1 = new saving_account(an,uid,name,r,b);
            obj1.display();
        }
        if (n==2){
            System.out.println("Enter Lock in Period:");
            int l = in.nextInt();
            fix_deposit obj1 = new fix_deposit (an,uid,name,r,b,l);
            obj1.close_account();
        }
    }
}
