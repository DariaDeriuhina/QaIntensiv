package abstraction_lesson4.homework.file_writer;

import java.io.IOException;

public interface FileSaver {
    void save(String fileName, Object data) throws IOException;
}
