import java.io.*;
public class FileReader {
    public static void main(String[] args) {
        try(java.io.FileReader reader = new java.io.FileReader("Hope_batch_1.txt")){
            int character;
            while((character=reader.read())!=-1) {
                System.out.print((char)character);
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}
