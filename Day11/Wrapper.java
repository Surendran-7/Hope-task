public class Wrapper {

    public static void main(String[] args) {
        int i=10;
        System.out.println(i);
        Integer obj=Integer.valueOf(i); //boxing
        System.out.println(obj);
        System.out.println(i==obj); //true
        System.out.println(obj.hashCode()); //true
      //  System.out.println(i.hashCode()); //error because i is primitive type
        int j=obj.intValue(); //unboxing
        System.out.println(j);
        Character ch='a';
        System.out.println(ch);
        System.out.println(ch.hashCode());
        char b=ch.charValue();
        System.out.println(b);
    }
}
