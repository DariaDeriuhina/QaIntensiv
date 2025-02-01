package abstraction_lesson4.homework.file_writer;

import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile implements FileSaver{
    @Override
    public void save(String fileName, Object data) throws IOException {
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName)){
            fileOutputStream.write((byte[]) data);
        }
    }
}
