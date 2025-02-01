package abstraction_lesson4.homework.file_writer;

import java.io.FileWriter;
import java.io.IOException;

public class TextFile implements FileSaver{
    @Override
    public void save(String fileName, Object data) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write((String) data);
        }
    }
}
