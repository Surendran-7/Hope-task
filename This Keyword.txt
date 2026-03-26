class Student{
    String name;
    int rollno;
    String dept;
    Student(String name,int rollno,String dept){
        this.name=name;
        this.rollno=rollno;
        this.dept=dept;
    }
    void display(){
        System.out.println("Name : "+name +" Rool no : "+rollno +" Dept "+ dept);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Student s=new Student("DIYA", 143, "cse");
        s.display();
    }
}
