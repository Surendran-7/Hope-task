interface Test{
    public void show();
}

public class InterfaceImplementation {
    public static void main(String[] args) {
       Test obj=()-> System.out.println("Hello lambda interface");;
        obj.show();
    }
}
