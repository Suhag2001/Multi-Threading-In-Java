package org.example.bank_atm_app;
public class AccountHolder implements  Runnable{
    private static Account account;
    private  static  int amount ;
    public AccountHolder(Account account, int amount){
        this.account= account;
        this.amount= amount;
    }
   @Override
    public void run() {
         for (int i = 1; i<=2 ; i++){
             if(account.getBalance()<0){
                 System.out.println("Account is overdrawn !");
             }
             makeWithdrawal(amount);
         }
    }
    private synchronized static void makeWithdrawal(int withdrawAmount)  {
        if(account.getBalance()>=withdrawAmount){
               System.out.println(Thread.currentThread().getName()+" is going to withdraw Rs : " + withdrawAmount );
               try {
                   Thread.sleep(3000);
               }catch (Exception e) {
                   e.printStackTrace();
               }
               account.withdraw(withdrawAmount);
               System.out.println(Thread.currentThread().getName()+" completes the withrawal of Rs : " + withdrawAmount );
        }else {
            System.out.println("Not enough amount in account for "+Thread.currentThread().getName()+" to withdraw");
            System.out.println("Balance is : " + account.getBalance());
        }

    }
}
