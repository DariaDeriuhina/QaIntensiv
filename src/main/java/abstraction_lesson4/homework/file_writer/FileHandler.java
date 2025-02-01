package abstraction_lesson4.homework.file_writer;

import java.io.IOException;

public class FileHandler {
    private FileSaver fileSaver;

    public FileHandler(FileSaver fileSaver){
        this.fileSaver = fileSaver;
    }

    public void save(String fileName, byte[] data) throws IOException {
        fileSaver.save(fileName, data);
    }
}
