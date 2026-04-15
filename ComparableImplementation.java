package DAY_17.problems_solved;
import java.util.*;;
class Student implements Comparable<Student>{
    int rollno;
    String name;
    Student(int rollno, String name){
        this.name=name;
        this.rollno=rollno;
    }
    public int compareTo(Student s){
    return s.rollno - this.rollno;
    }
}
public class ComparableImplementation {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student(123, "kaz"));
        s.add(new Student(45, "inej"));
        Collections.sort(s);
        for(Student student:s){
            System.out.println(student.rollno+" "+student.name);
        }
        
    }
}
