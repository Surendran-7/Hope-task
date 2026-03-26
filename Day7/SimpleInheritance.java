
class Parent{
    public void display(){
        System.out.println("Inside parent method of Parent class but called from child class");
    }
}

class Child extends Parent{
    public void display1(){
        System.out.println("Inside child method of Child class but called from ");
    }
}
public class SimpleInheritance {

    public static void main(String[] args) {
        System.out.println("Inside main method of SimpleInheritance class");
        Child c = new Child();
        c.display();
    }
}
