package SortProgram;

import java.util.Scanner;

import FileManager.AssistantFileManager;
// import SortManager.Sort;
import TypeConverter.TypeConverter;

public class SortMain {
    public static Scanner readFile(AssistantFileManager asFM, String fileName){
        return asFM.readFile(fileName);
    }

    public static void writeFile(AssistantFileManager asFM, String result){
        asFM.writeFile("result1.txt", result);
    }

    // public static int[] bubbleSort(String splitLines[]){
    //     int []convertSplitLines = new int[splitLines.length];
    //     int [] splitNumbers = convertSplitLines;

    //     int temp = 0;
    //     int i = 0, j = 0, k = 0;

    //     for(i = 0; i < splitLines.length; i++){
    //         convertSplitLines[i] = Integer.parseInt(splitLines[i]);
    //     }

    //     for(j = 0; j < splitNumbers.length; j++){
    //         for (k = 0; k < (splitNumbers.length - k) - 1; k++){
    //             if(splitNumbers[k] > splitNumbers[k + 1]){
    //                 temp = splitNumbers[k];
    //                 splitNumbers[k] = splitNumbers[k + 1];
    //                 splitNumbers[k + 1] = temp;
    //             }
    //         }
    //     }

    //     return convertSplitLines;
    // }

    // public static int[] bubbleSort(TypeConverter tCon, String splitLines[]){
    //     int []convertSplitLines = tCon.convertToInt(splitLines);
    //     int temp = 0;

    //     for(int i = 0; i < convertSplitLines.length; i++){
    //         for (int j = 0; j < (convertSplitLines.length - j) - 1; j++){
    //             if(convertSplitLines[j] > convertSplitLines[j + 1]){
    //                 temp = convertSplitLines[j];
    //                 convertSplitLines[j] = convertSplitLines[j + 1];
    //                 convertSplitLines[j + 1] = temp;
    //             }
    //         }
    //     }

    //     return convertSplitLines;
    // }

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
        // Sort mSort = new Sort();

        String getData = getData(mTCon, readFile(mFM, "data1.txt"));
        writeFile(mFM, getData);
    }
}
