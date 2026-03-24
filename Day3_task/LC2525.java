import java.util.*;
public class LC2525{
    public static String categorizeBox(int length, int width, int height, int mass) {
        long volume =1L*length*width*height;
        boolean bulky=false;
        boolean heavy=false;
        if (length >= 10000 || width >= 10000 || height>=10000||volume >= 1000000000) {
            bulky = true;
        }
        if (mass>=100) {
            heavy=true;
        }
if (bulky && heavy) return "Both";
        if (!bulky && !heavy) return "Neither";
        if (bulky) return "Bulky";
        return "Heavy";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int width=sc.nextInt();
        int height=sc.nextInt();
        int mass=sc.nextInt();
        String result=categorizeBox(length, width, height, mass);
        System.out.println(result);
    }
}
