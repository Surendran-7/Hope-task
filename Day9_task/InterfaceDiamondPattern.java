class A{
    void display(){
        System.out.println("I am in class A");
    }
}
interface B{
    void display();
}
interface C{
    void display();
}
class D extends A implements B,C{
    public void display(){
        System.out.println("I am in class D");
    }
    public void displayA(){
        super.display();
    }
}
public class InterfaceDiamondPattern {
    public static void main(String[] args) {
        D d=new D();
        d.displayA();
        d.display();
    }
    
}
 
