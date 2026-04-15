package DAY_17.problems_solved;

import java.util.ArrayList;
import java.util.List;

public class RemoveImplementation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(20);
        list.add(26);
        list.add(30);   
        System.out.println(list);
        for(Integer i: list){
            if(i%2==0)
                list.remove(i);
        }
        System.out.println(list);
    }
}
