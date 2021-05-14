package SortProgram;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import FileManager.AssistantFileManager;
import FileManager.FileManager;

public class Sort {
    public static Scanner readFile(AssistantFileManager asFM, String fileName){
        return asFM.readFile(fileName);
    }

    public static void writeFile(AssistantFileManager asFM, String result){
        asFM.writeFile("result1.txt", result);
    }

    public static String getData(Scanner readFile){
        int readLine = Integer.parseInt(readFile.nextLine());
        
        String getLine = "";
        String splitLine[] = null;
        int []convertSplitLine = null;

        for (int i = 1; i <= readLine; i++){
            if(!readFile.hasNextLine()){
                System.out.println("No more readable lines!!!");
                break;
            }

            getLine = readFile.nextLine();
            splitLine = getLine.split(" ");
            
        }

        String result = "";
        return result;
    }

    public static void main(String[] args) {
        File file = null;
        
        Scanner fileReader = null;
        FileWriter fileWriter = null;

        AssistantFileManager mFM = new AssistantFileManager();

        fileReader = readFile(mFM, "data1.txt");
        String getData = getData(readFile(mFM, "data1.txt"));
        writeFile(mFM, getData);
    }
}
