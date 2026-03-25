public class constructorOverloading {
    public static void main(String[] args) {
        System.out.println("This is the concept of runtime polymorphism.................................................................................");
        System.err.println("Constructor overloading is a feature in java where we can have multiple constructors with different parameters in a class");
        croverloading cr=new croverloading(5);
        croverloading cr2=new croverloading("Hope");


    
}
}
class croverloading{
    croverloading(){
        System.out.println("Default constructor");
    }
    croverloading(int i){
        System.out.println("parameterized constructor and overloading is "+i);

    }
    croverloading(String i){
        System.out.print("parameterized constructor and overloading is "+i);
    }

}