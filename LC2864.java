import java.util.*;
public class LC2864{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int width=sc.nextInt();
        int height=sc.nextInt();
        int mass =sc.nextInt();
        Solution obj=new Solution();
        String result=obj.categorizeBox(length, width, height, mass);
        System.out.println(result);
    }
}
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        String box="";
        String box1="";
        long volume=1L * length*width*height;
        if (length>=10000 || width >= 10000 || height >= 10000 || volume >= 1000000000) {
            box="Bulky";
        }
        if (mass=100) {
            box1 ="Heavy";
        }
        if (box.equals("Bulky") && box1.equals("Heavy")) {
            return "Both";
        }
        if (!box.equals("Bulky") && !box1.equals("Heavy")) {
            return "Neither";
        }
        if (box.equals("Bulky")) {
            return "Bulky";
        }
        return "Heavy";
    }
}
