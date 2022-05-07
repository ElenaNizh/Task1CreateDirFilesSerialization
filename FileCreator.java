
import java.io.File;
import java.io.IOException;

public class FileCreator {
    private File file;
    private FileNames fileNames;


    public FileCreator(File file, FileNames fileNames) {
        this.file = file;
        this.fileNames = fileNames;
    }


    ////Для создания файла можно использовать метод createNewFile(), который так же возвращает boolean.
    //// Обратите внимание, что этот метод пробрасывает IOException. Необходимо обернуть его в блок try-catch.
    public String addFileInfo() throws IOException {
        if (file.createNewFile()) {
            return "Файл " + fileNames.description + " создан";
        } else {
            return "Ошибка создания файла " + fileNames.description;
        }
    }
}