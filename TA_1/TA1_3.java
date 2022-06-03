package com.mycompany.ta1_3;

import java.util.Scanner;


class Product{
    String code,name;
    double cost;
    int quantity;

    Product(String code,String name){
        this.code = code;
        this.name = name;
        cost = 0;
        quantity = 0;
    }
    
    public String getName(){
        return(name);
    }

    public void Editcost(double cost){
        this.cost = cost;
    }

    void Editstock(int n){
        quantity += n;
    }

    boolean outOfStock(){
        if(quantity == 0){
            return(true);
        }
        return(false);
    }

    void display(){
        System.out.println("Name of the product : " + name);
        System.out.println("Product Code        : " + code);
        System.out.println("Product Cost(in Rs) : " + cost);
        System.out.println("Product stock       : " + quantity);

    }

}


public class TA1_3 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name,code;
        double cost;
        int quantity;
        System.out.println("Enter name of the product : ");
        name = obj.nextLine();
        System.out.println("Enter the product Code : ");
        code = obj.next();
        Product obj1 = new Product(code,name);
        obj1.display();

        int c=1;
        while(c!=0){
            System.out.println("Enter 1 for adding stock:");
            System.out.println("Enter 2 for checking stock:");
            System.out.println("Enter 3 for editing product price:");
            System.out.println("Enter 0 for exit:");
            c = obj.nextInt();
            switch(c){
                case 1:
                    System.out.println("How much Stock to be added? : ");
                    quantity = obj.nextInt();
                    obj1.Editstock(quantity);
                    break;
                
                case 2:
                    if(obj1.outOfStock()){
                        System.out.println("Out of Stock");
                    }else{
                        System.out.println("Available in Stocks");
                    }
                    break;
                case 3:
                    System.out.println("Enter the cost of the product : ");
                    cost = obj.nextDouble();
                    obj1.Editcost(cost);
            }
        }
        obj1.display();

        System.out.println("Program ended");
    }
}
