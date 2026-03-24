import java .util.*;
public class Perimeter {
    public static void main(String[] args) {
        int length, breadth;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextInt();  
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextInt();
        System.out.println("Perimeter of the rectangle is: " + 2 * (length + breadth));
        System.out.println("Area of the rectangle is: " + (length * breadth));

    }
    
}
