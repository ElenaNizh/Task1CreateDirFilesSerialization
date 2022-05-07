
import java.io.*;

public class Main {
    public static void main(String[] args) {
        //  Для сохранения лога используйте экземпляр класса StringBuilder.
        //  Добавляйте в него всю информацию о создании файлов и каталогов.
        // Далее возьмите из него текст и запишите его в файл temp.txt с помощью класса FileWriter.

        StringBuilder sb = new StringBuilder();

        //В папке Games создайте несколько директорий: src, res, savegames, temp.
        Creator creator = new Creator();
        sb.append(creator.addDir("src")).append("\n");
        sb.append(creator.addDir("res")).append("\n");
        sb.append(creator.addDir("savegames")).append("\n");
        sb.append(creator.addDir("temp")).append("\n");

        //В каталоге src создайте две директории: main, test.
        sb.append(creator.addDir("src", "main")).append("\n");
        sb.append(creator.addDir("src", "test")).append("\n");

        //В каталог res создайте три директории: drawables, vectors, icons.
        sb.append(creator.addDir("res", "drawables")).append("\n");
        sb.append(creator.addDir("res", "vectors")).append("\n");
        sb.append(creator.addDir("res", "icons")).append("\n");


        //В подкаталоге main создайте два файла: Main.java, Utils.java.
        //В директории temp создайте файл temp.txt.
        try {
            sb.append(creator.addFile("src/main", "Main.java")).append("\n");
            sb.append(creator.addFile("src/main", "Utils.java")).append("\n");
            sb.append(creator.addFile("temp", "temp.txt")).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
//Для создания файла можно использовать метод createNewFile(), который так же возвращает boolean.
// Обратите внимание, что этот метод пробрасывает IOException. Необходимо обернуть его в блок try-catch.
        // Далее возьмите из него текст и запишите его в файл temp.txt с помощью класса FileWriter.


        // C:\Users\dns\Games
        // try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/maksim/Games/temp/temp.txt"))){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/dns/Games/temp/temp.txt"))) {
            bw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
    }
}