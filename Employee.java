abstract class Employee {
    abstract void work();
    abstract void salary();

}
class fulltime extends Employee
{
    fulltime(){
        System.out.println("I am a full time employee");
    }

    @Override
    void work() {
        System.out.println("I work full time");
    }

    @Override
    void salary() {
        System.out.println("My salary is high");
    }

}
