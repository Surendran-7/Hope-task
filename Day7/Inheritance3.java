public class Inheritance3 {
    public static void main(String[] args) {
        Dog sound = new Dog();
        sound.bark();
        System.out.println(sound.hashCode());


    }
    
}
class Animal {
    public void display(){
        System.out.println("There are many types of animals in the world");
    }

    
}
class Dog {
    void bark(){
        System.out.println("The dog barks");
    }

}
