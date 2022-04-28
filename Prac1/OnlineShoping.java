package javaapplication2;
import java.util.Scanner; 
/**
 *
 * @author PET5
 */
public class JavaApplication2 {
    
    
    void Checkout(int Amount){
        int dAmount;
        if(Amount<1000){
            dAmount = (int)0.2*Amount;
        }
        else{
            dAmount = (int)0.3*Amount;
        }
        System.out.println("Discount Amount = " + dAmount);
        System.out.println("Amount to pay = " + (Amount - dAmount));
    }
    
    void Checkout(int Amount, String P){
        int dAmount=0;
        if(P == "GET10"){
            if(Amount<500){
                dAmount = 10;
            }else{
                dAmount =(int) 0.1*Amount;
            }
        }else{
            System.out.println("No Discount");
            System.out.println("Amount to pay = " + Amount);
        }
        System.out.println("Discount Amount = " + dAmount);
        System.out.println("Amount to pay = " + (Amount - dAmount));
        
    }
    
    public static void main(String[] args) {
        int famount;
        JavaApplication2 o1 = new JavaApplication2();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Customer Type:[Prime:1,Regular:0]");
        int Customer_type = myObj.nextInt();
        System.out.println("Enter The Amount:");
        int Amount = myObj.nextInt();
        if(Customer_type == 1){
            o1.Checkout(Amount);
        }
        else{
            System.out.println("Enter promo code[if not Enter NO:");
            String Promo_code   = myObj.nextLine();
            o1.Checkout(Amount, Promo_code);
            
        }
        
        
        
        
    }

    
}
