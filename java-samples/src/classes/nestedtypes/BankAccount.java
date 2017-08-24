package classes.nestedtypes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankAccount {
private long number;              // account number
    private long balance;         // current balance (in cents)
    private History actHistory;   // account history       
    
    public static class Permissions {
        public boolean canDeposit,
                       canWithdraw,
                       canClose;
    }
    
    public BankAccount(long number, long balance) {
        super();
        this.number = number;
        this.balance = balance;
        actHistory = new History();
    }
    
    public class Action {
        private String act;
        private long amount;
        Action(String act, long amount){
            this.act = act;
            this.amount = amount;
        }
        public String toString(){
            // identify our enclosing account
            return number + ":" + act + " " + amount;
        }
    }
    
    public class History implements Iterable<Action>{
        List<Action> actHistory = new ArrayList<>();   // action history
        void addAct(Action newAct){
            if(actHistory.size() > 10){
                actHistory.clear(); // we keep only 10 previous records
             } 
             actHistory.add(newAct);
        }
    
        @Override
        public Iterator<Action> iterator() {
            return actHistory.iterator();
        }
    }
    
    public History history(){
        return this.actHistory;
    }
    
    public void deposit(long amount){
        balance += amount;
        actHistory.addAct(new Action("deposit",amount));
    }
    
    public void withdraw(long amount){
        balance -= amount;
        actHistory.addAct(new Action("withdraw",amount));
    }
    
    public void transfer(BankAccount other, long amount){
        other.withdraw(amount);
        deposit(amount);
        actHistory.addAct(this.new Action("transer",amount));
        other.actHistory.addAct(other.new Action("transfer",amount));
    }
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(123456, 100);
        
        //We do some deposits and withdrawals on bankAccount1
        bankAccount1.deposit(100);
        bankAccount1.deposit(50);
        bankAccount1.withdraw(10);
        
        
        BankAccount bankAccount2 = new BankAccount(789,200);
        
        //Transfer some funds from bankAccount1 to bankAccount2
        bankAccount1.transfer(bankAccount2, 50);
        
        Iterator<Action> histIter1 = bankAccount1.history().iterator();
        while(histIter1.hasNext()){
            System.out.println(histIter1.next());
        }
        
        Iterator<Action> histIter2 = bankAccount2.history().iterator();
        while(histIter2.hasNext()){
            System.out.println(histIter2.next());
        }
    }
}