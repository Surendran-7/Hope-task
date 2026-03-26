
public class SimpleInheritance2 {
    public static void main(String[] args) {
        Parent p = new child();
        p.display();
    //    p.display1();// This will cause a compile-time error because the reference type is Parent, which does not have the display1() method.
    }
    
}
class child extends Parent{
    public void display1(){
        System.out.println(" Child class  ");
    }
}
class Parent{
    public void display(){
        System.out.println(" Parent class ");
    }
}
