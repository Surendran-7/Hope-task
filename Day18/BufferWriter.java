import java.io.*;
public class BufferWriter {
    public static void main(String[] args) {
        File file = new File("Hope_batch_1.txt");

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Hope_batch_1.txt"))){
            writer.write("Welcome to filehandling\n this is Hope Batch 1");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        writer.close();
    }
}
