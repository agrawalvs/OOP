package com.mycompany.ta1_1;

import java.util.Scanner;

class user_exception extends Exception {
    int count;
    user_exception(int a){
        count = a;
    }
    
    @Override
    public String toString(){
        return "User Exception found. Vowels count="+count;
    }
}

class strobj{
    Scanner obj = new Scanner(System.in);
    String str;
    int vcount,ncount;
    strobj(){
        System.out.println("Enter the String :");
        str = obj.nextLine();
        vcount = this.vowel();
        ncount = this.number_count();
    }
    
    int vowel(){
        int count=0;
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'
                || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
    
    int number_count(){
        int digits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                digits++;
        }
        return digits;
    }
}

public class TA1_1 {

    static void compute(strobj obj)throws 
        user_exception , UnsupportedOperationException , NullPointerException{
        try{
            if(obj.vcount<11)
                throw new user_exception(obj.vcount);
        }catch(user_exception e){
            System.out.println(e);
        }
        
        try{
            if(obj.ncount>0)
                throw new UnsupportedOperationException("Demo");
        }catch(UnsupportedOperationException e){
            System.out.println(e);
        }
        
        try{
            if(obj.str.length()==0)
                throw new NullPointerException("demo");
        }catch(NullPointerException e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String[] args) 
    throws UnsupportedOperationException, user_exception {
    
        strobj obj1 = new strobj();
        compute(obj1);
        System.out.println("Program Succesfully Executed");
    }
}
