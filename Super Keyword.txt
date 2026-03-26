public class SuperKeyword {
    public static void main(String [] args) {
        ChildAnimal ca = new ChildAnimal();
        ca.display();
    }
}

class MotherAnimal {
    public void display() {
        System.out.println("This is the Mother Animal");
    }
}

class ChildAnimal extends MotherAnimal {
    public void display() {
        super.display(); 
        System.out.println("This is the Child Animal");
    }
}
