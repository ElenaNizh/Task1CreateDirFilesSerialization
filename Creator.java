
import java.io.File;
import java.io.IOException;


 //C:\Users\dns\Games
public class Creator {
     private static final String separator = File.separator;
    private final static String DEFAULTPATH = separator + "Users" + separator + "dns" + separator + "Games";
    private DirCreator dirCreator;
    private FileCreator fileCreator;
    private File file;
    private DirNames dirName;
    private FileNames fileName;

     //Для работы с файлом или директорией необходимо создать для них свой экземпляр класса File,
     // передав в конструктор адрес к файлу или директории. Создать директорию можно с помощью метода mkdir(),
     // который возвращает true или false в зависимости от того, была ли директория создана успешно.
    public String addDir(String dirPath) {
        this.file = new File(DEFAULTPATH + separator + dirPath);
        findDirType(dirPath);
        this.dirCreator = new DirCreator(file, dirName);
        return dirCreator.addDirInfo();
    }

    public String addDir(String intoDir, String dirPath) {
        this.file = new File(DEFAULTPATH + separator + intoDir + separator + dirPath);
        findDirType(dirPath);
        this.dirCreator = new DirCreator(file, dirName);
        return dirCreator.addDirInfo();
    }

    public String addFile(String targetDir, String filePath) throws IOException {
        file = new File(DEFAULTPATH + separator + targetDir + separator + filePath);
        findFileType(filePath);
        this.fileCreator = new FileCreator(file, fileName);
        return fileCreator.addFileInfo();
    }

    private void findDirType(String dirPath) {
        DirNames[] dirNames = DirNames.values();
        for (DirNames dirName : dirNames) {
            if (dirName.description.equals(dirPath)) {
                this.dirName = dirName;
                break;
            }
        }
    }

    private void findFileType(String filePath) {
        FileNames[] fileNames = FileNames.values();
        for (FileNames name : fileNames) {
            if (name.description.equals(filePath)) {
                fileName = name;
                break;
            }
        }
    }
}