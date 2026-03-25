public class Defaultconstructor {
    
    public static void main(String[] args) {
        System.out.println("See your class file default con structor is automatically created by compiler");
        dConstructor dc = new dConstructor(10);
        System.out.println(dc);
    }
}
class dConstructor{
    dConstructor(int x){
       // this.x=x;
        System.out.println("I am inside default constructor");
        System.out.println("I am inside parametrized constructor with value: " + x);
    }   
}
    //default constructor is automatically created by compiler
    //it is used to create object of class
    //it is
