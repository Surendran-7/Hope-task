import java.io.*;
public class BufferReader {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Hope_batch_1.txt"));
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
            reader.close();
        }catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}
