public class functions {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("StringBuilder Initial: " + sb);

        sb.append(" World");
        System.out.println("append(): " + sb);

        sb.insert(5, " Java");
        System.out.println("insert(): " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("replace(): " + sb);

        sb.delete(2, 7);
        System.out.println("delete(): " + sb);

        sb.reverse();
        System.out.println("reverse(): " + sb);

        System.out.println("capacity(): " + sb.capacity());

        System.out.println("length(): " + sb.length());

        System.out.println("charAt(2): " + sb.charAt(2));

        sb.setCharAt(2, 'X');
        System.out.println("setCharAt(): " + sb);

        StringBuffer sbf = new StringBuffer("Hello");

        System.out.println("\nStringBuffer Initial: " + sbf);

        sbf.append(" World");
        System.out.println("append(): " + sbf);

        sbf.insert(5, " Java");
        System.out.println("insert(): " + sbf);

        sbf.replace(0, 5, "Hi");
        System.out.println("replace(): " + sbf);

        sbf.delete(2, 7);
        System.out.println("delete(): " + sbf);

        sbf.reverse();
        System.out.println("reverse(): " + sbf);

        System.out.println("capacity(): " + sbf.capacity());

        System.out.println("length(): " + sbf.length());

        System.out.println("charAt(2): " + sbf.charAt(2));

        sbf.setCharAt(2, 'Y');
        System.out.println("setCharAt(): " + sbf);
    }
}