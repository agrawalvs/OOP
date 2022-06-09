
package bankaccount;

class saving_account extends bank_account implements debitable{
    int close_yrs;
    saving_account(String acc_no, double adhaar_no, String name, int roi, 
        int balance){
        super(acc_no, adhaar_no, name, roi, balance);
    }
    
    void setyrs(){
        System.out.println(" Enter Years of clouser:");
        int yrs = myobj.nextInt();
        close_yrs = yrs;
    }
    
    @Override
    void close_account(){
        setyrs();
        update_interest(close_yrs);
        System.out.println(" Your remaining balance is " + balance);
        System.out.println(" Account Successfully closed");
    }
    
    
    @Override
    void update_interest(int yrs){
        int amt = balance*4/100;
        System.out.println(" Rate Successfully updated");
        balance = yrs*(amt+balance);
    }
    
    @Override
    public void withdraw(){
        System.out.println(" Enter Amount to Withdraw :");
        int am = myobj.nextInt();
        balance -= am;
        System.out.println(" Amount Successfully withdrawaled");
    }
}