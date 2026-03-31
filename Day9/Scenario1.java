import java.util.*;
interface Salary{
    void salaray();
}
class PartTimeEmployee implements Salary{
    String name;
    int empId;
    PartTimeEmployee(String name,int empId){
        this.name=name;
        this.empId=empId;
    }
    //Hourly payment
    Scanner sc=new Scanner(System.in);
    public void salaray(){
        System.out.println("Total Number of hours worked in the month :");
        int total=sc.nextInt();
        System.out.println("Salary for your part time job :"+(total*300));
    }
}
class FullTimeEmployee implements Salary{
    String name;
    int empId;
    FullTimeEmployee(String name,int empId){
        this.name=name;
        this.empId=empId;
    }
    //Fixed payment
    public void salaray(){
        System.out.println("Salary for your fulltime job is:"+(8*30*300));
    }
}
public class Scenario1 {
    public static void main(String[] args) {
        PartTimeEmployee pEmployee=new PartTimeEmployee("Alice",75458);
        pEmployee.salaray();
        FullTimeEmployee fEmployee=new FullTimeEmployee("Bob",48475);
        fEmployee.salaray();
    }
}

