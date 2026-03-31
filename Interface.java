package DAY_9.VsCode;

interface A{
    void show();
}
interface B{
    void display();
}
class C implements A,B{
    public void show(){
        System.out.println("This is show method from interface A");
    }
    public void display(){
        System.out.println("This is display method from interface B");
    }
}
public class Interface {
    public static void main(String[] args) {
        C c=new C();
        c.show();
        c.display();
    }
}
