package FileManager;

import java.util.Scanner;

public interface FileManager {
    Scanner readFile(String fileName);
    void writeFile(String fileName, String result);
}
