class Encapsulation{
    int a;
    Encapsulation(int a) 
    {
        this.a = a;
    }
    void display()
    {
        System.out.println("Value of a is: "+a);
    }
}
public class EncapsulationImplementation {
    public static void main(String[] args) {
        Encapsulation en =new Encapsulation(10);
        en.display();
    }
}
