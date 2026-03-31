import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("Hope class");
            System.out.println(fr);
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
        try{
            int arr[]=new int[5];
            arr[0]=2;
            arr[1]=3;
            arr[2]=4;
            arr[3]=5;
            arr[4]=6;
            arr[5]=7;
            System.out.println(arr);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
