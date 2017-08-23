package classes.nestedtypes;

public class BankAccount {
    private long number;    // account number
    private long balance;   // current balance (in cents)
    private Action lastAct; // last action performed
    
    public static class Permissions {
        public boolean canDeposit,
                       canWithdraw,
                       canClose;
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
    
    public void deposit(long amount){
        balance += amount;
        lastAct = new Action("deposit",amount);
    }
    
    public void withdraw(long amount){
        balance -= amount;
        lastAct = new Action("withdraw",amount);
    }
    
    public void transfer(BankAccount other, long amount){
        other.withdraw(amount);
        deposit(amount);
        lastAct = this.new Action("transer",amount);
        other.lastAct = other.new Action("transfer",amount);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
