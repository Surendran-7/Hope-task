package DAY_9.VsCode;
//different types of payment method
interface payment{
    void transfer();
}
class Cash implements payment{
    int amount;
    Cash(int amount){
        this.amount=amount;
    }
    public void transfer(){
        System.out.println("Amount to be transfered:"+amount);
    }
}
class  UPI implements payment{
    int amount;
    UPI(int amount){
        this.amount=amount;
    }
    public void transfer(){
        if(amount<100000){
            System.out.println("Amount to be transfered:"+amount);
        }
        else{
            System.out.println("UPI limit Exceded");
        }
    }
}
class Card implements payment{
    int amount;
    Card(int amount){
        this.amount=amount;
    }
    public void transfer(){
        if(amount<10000){
            System.out.println("Amount to be transfered:"+amount);
        }
        else{
            System.out.println("Amount Exceeded");
        }
    }
}
public class Scenario2 {
    public static void main(String[] args) {
        Cash c=new Cash(1000);
        c.transfer();
        UPI upi=new UPI(1948440);
        upi.transfer();
        Card card=new Card(3640);
        card.transfer();
    }
}
