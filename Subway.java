import java.util.*;
public class Subway{
    public static void main(String[] args) {
        System.out.println("Enter '1' to start the game:");
        System.out.println("Enter '2' to change track left:");
        System.out.println("Enter '3' to change track right:");
        System.out.println("Enter '4' for wooden high barriers:");
        System.out.println("Enter '5' for low metal barriers/Trains:");

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 1:
                System.out.print("Running");
                break;
            case 2:
                System.out.println("Track changed to left");
                break;
            case 3:
                System.out.println("Track changed to right");
                break;
            case 4:
                System.out.println("Dodging");
                break;
            case 5:
                System.out.println("Jumping");
                break;
            default:
                System.out.println("Running");
                break;
        
        }
        
    }
}