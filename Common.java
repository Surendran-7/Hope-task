public class Common {
    public static void main(String[] args) {
        Apartment1 apartment1=new Apartment1(1);
        Apartment2 apartment2=new Apartment2(2);
        Apartment3 apartment3=new Apartment3(3);
        
    }
    
}
class bedroom{
    bedroom(int x){
        System.out.print("it has"+x+" bedroom");
    }
}
class kitchen{
    kitchen(){
        System.out.print(", it has 1 kitchen");
    }
}
class bathroom{
    bathroom(int x){
        System.out.print("no.of bathroom is "+x);
    }
}
class hall{
    hall(int x){
        System.out.print(", It has "+x+" hall");
    }
}
class dinning{
    dinning(){
        System.out.println(", it has 1 dinning ");
    }
}
class playground {
    public playground() {
        System.out.println(" and 1 common playground for all apartments");
        
        
    }
    
}
class Apartment1{

    Apartment1(int x){
        System.out.println("I am inside apartment"+x);
        bedroom bedroom=new bedroom(x);
        kitchen kitchen=new kitchen();
        bathroom bathroom=new bathroom(x);
        hall hall=new hall(x);
        dinning dinning=new dinning();
        playground playground=new playground();

    }
}
class Apartment2{
    Apartment2(int x){
        System.out.println("I am inside apartment"+x);
        bedroom bedroom=new bedroom(2);
        kitchen kitchen=new kitchen();
        bathroom bathroom=new bathroom(x);
        hall hall=new hall(1);
        dinning dinning=new dinning();
        playground playground=new playground();
    }
}                               
class Apartment3{
    Apartment3(int x){
        System.out.println("I am inside apartment"+x);
        bedroom bedroom=new bedroom(4);
        kitchen kitchen=new kitchen();
        bathroom bathroom=new bathroom(4);
        hall hall=new hall(2);
        dinning dinning=new dinning();
        playground playground=new playground();

    }
}   