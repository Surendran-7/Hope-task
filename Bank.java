class BankAcc{
    private int balance;
    public BankAcc(int balance){
        this.balance=balance;
    }
    void deposit(int n){
        balance+=n;
        System.out.println(n+"Rs is deposited in bank");
    }
    void withdraw(int n){
        if(n>balance) System.out.println("Invalid amount cause request is more than balance in acc");
        else{
            balance-=n;
            System.out.println(n+"Rs is withdrawn from the bank");
        }
    }
    void showBalance(){
        System.out.println("Balance in bank: "+balance);
    }
}

public class Bank{
    public static void main(String[] args) {
        BankAcc acc=new BankAcc(10000);
        acc.deposit(5000);
        acc.showBalance();
        acc.withdraw(14000);
        acc.showBalance();
        acc.deposit(4000);
        acc.showBalance();
        acc.withdraw(10000);
    }
}
