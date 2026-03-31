class Animal{
    void sound(){
        System.out.println("Animals give diff sounds");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Animal a;
        a=new Cat();
        a.sound();
        a=new Dog();
        a.sound();
    }
}

/*
Types of Polymorphism

1. Method Overloading -> compile time
2. Method Overriding -> run time

*/
