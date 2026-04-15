package DAY_17.problems_solved;
import java.util.*;
public interface IteratorImplementation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(20);
        list.add(26);
        list.add(30);   
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            if(iter.next()%2==0){
                iter.remove();
            }
            else{
            System.out.println(iter.next());
            }
        }
    }
}
