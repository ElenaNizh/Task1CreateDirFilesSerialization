
import java.io.File;

public class DirCreator {
    private File file;
    private DirNames dirNames;

    public DirCreator(File file, DirNames dirNames) {
        this.file = file;
        this.dirNames = dirNames;
    }

    ///public String addDir() {
    public String addDirInfo() {
        if (file.mkdir()) {
            return "Директория " + dirNames.description + " создана";
        } else {
            return "Ошибка создания директории " + dirNames.description;
        }
    }
}