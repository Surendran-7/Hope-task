public class Autoboxing {
    public static void main(String[] args) {
        int i=10;
        Integer obj=i; //autoboxing
        System.out.println(obj);
        System.out.println(i==obj); //true
      //  System.out.println(i.equals(obj)); //error because i is primitive type
        System.out.println(obj.hashCode()); //true
    }
    
}
