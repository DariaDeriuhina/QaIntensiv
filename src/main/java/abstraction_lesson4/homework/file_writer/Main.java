package abstraction_lesson4.homework.file_writer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            FileHandler textFileHandler = new FileHandler(new TextFile());
            textFileHandler.save("example.txt", "Hello, SOLID!".getBytes());

            FileHandler binaryFileHandler = new FileHandler(new BinaryFile());
            binaryFileHandler.save("example.bin", new byte[]{1, 2, 3, 4, 5});

            System.out.println("Files are saved");
        } catch (IOException e) {
            System.err.println("Files are not saved: " + e.getMessage());
        }
    }
}
