public class Nonprimitive {
    public static void main(String[] args) {
        String s = "Hello World!\n";
        System.out.print(s);
        String s1 = new String("Welcome to Java Programming");
        String s2 = new String("Welcome to Java Programming");

        System.out.print(s1==s2 + "because s1 has different address from s2");
    }
}
