
package bankaccount;





class fix_deposit extends bank_account{
    int lockinperiod;
    int close_yrs;

    fix_deposit(String acc_no, double adhaar_no, String name, int roi, 
        int balance, int lip) {
        
        super(acc_no, adhaar_no, name, roi, balance);
        lockinperiod = lip;
    }
    
    @Override
    void update_interest(int yrs){
        int amt=0;
        if(lockinperiod<3 && lockinperiod>0){
           amt = balance*6/100;
        }
        if(lockinperiod<6 && lockinperiod>2){
           amt = balance*13/200;
        }
        if(lockinperiod>5){
           amt = balance*7/100;
        }
       
        System.out.println(" Rate Successfully updated");
        balance= (amt+balance)*yrs;
    }
    
    void setyrs(){
        System.out.println(" Enter Years of clouser:");
        int yrs = myobj.nextInt();
        close_yrs = yrs;
    }
    
    @Override
    void close_account(){
        this.setyrs();
        if(lockinperiod>close_yrs){
            update_interest(close_yrs);
            balance-=balance*5/100;
            System.out.println("You will be charged %5 for closing before lockinperiod");
        }
        else{
            update_interest(lockinperiod);
        }
        System.out.println(" Your balance is " + balance);
        System.out.println(" Account Successfully closed");
    }
}


public class BankAccount {

  
    public static void main(String[] args) {
        
    }
    
}
