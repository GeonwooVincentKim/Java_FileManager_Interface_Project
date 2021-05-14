package SortProgram;

import java.util.Scanner;

import FileManager.AssistantFileManager;
import TypeConverter.TypeConverter;

public class SortMain {
    public static Scanner readFile(AssistantFileManager asFM, String fileName){
        return asFM.readFile(fileName);
    }

    public static void writeFile(AssistantFileManager asFM, String result){
        asFM.writeFile("result1.txt", result);
    }

    public static String getData(TypeConverter tCon, Scanner readFile){
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
            convertSplitLine = tCon.convertToInt(splitLine);

            for (int j = 0; j < convertSplitLine.length; j++){
                System.out.print(convertSplitLine[j] + " ");
                
            }
            System.out.println();
        }

        String result = "";
        return result;
    }

    public static void main(String[] args) {
        AssistantFileManager mFM = new AssistantFileManager();
        TypeConverter mTCon = new TypeConverter();

        String getData = getData(mTCon, readFile(mFM, "data1.txt"));
        writeFile(mFM, getData);
    }
}
