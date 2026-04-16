import java.io.*;
import java.io.IOException;
public class FileWriter {
    public static void main(String[] args) {
        try(java.io.FileWriter myWriter = new java.io.FileWriter("Hope_batch_1.txt")){
            myWriter.write("Welcome to filehandling\n this is Hope Batch 1");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
