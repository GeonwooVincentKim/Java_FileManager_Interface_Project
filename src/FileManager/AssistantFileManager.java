package FileManager;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class AssistantFileManager implements FileManager {
    public File file;
    public Scanner fileReader;
    public FileWriter fileWriter;

    @Override
    public Scanner readFile(String fileName){
        file = new File(fileName);

        try{
            fileReader = new Scanner(file);
        } catch (Exception e){
            e.printStackTrace();
        }

        return fileReader;
    }

    @Override
    public void writeFile(String fileName, String result) {
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(result);
            fileWriter.close();
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
