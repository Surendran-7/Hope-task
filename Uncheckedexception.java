public class Uncheckedexception {
    public static void main(String[] args) {
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
        try{
            int a=10/0;
            System.out.println(a);  
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
