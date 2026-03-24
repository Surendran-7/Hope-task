
import java.util.*;
public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number 'a': ");
        int a = sc.nextInt();
        System.out.print("Enter a number 'b': ");
        int b = sc.nextInt();
        System.out.println("Sum of a and b is: " + (a + b));
        System.out.println("Difference of a and b is: " + (a - b));
        System.out.println("Product of a and b is: " + (a * b));
        if (b != 0) {
            System.out.println("Quotient of a and b is: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Remainder of a and b is: " + (a % b));

    }
    
}
