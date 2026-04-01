public class Main {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};

            // This will cause ArrayIndexOutOfBoundsException
            System.out.println(arr[5]);

        } 
        catch (ArrayIndexOutOfBoundsException e) {  // Specific exception
            System.out.println("Specific Catch Block Executed");
        } 
        catch (Exception e) {  // General exception
            System.out.println("General Catch Block Executed");
        }
    }
}
