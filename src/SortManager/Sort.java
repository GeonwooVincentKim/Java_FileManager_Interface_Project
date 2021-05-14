package SortManager;

import TypeConverter.TypeConverter;

public class Sort extends TypeConverter{
    @Override
    public int[] convertToInt(String splitLines[]){
        int []convertSplitLines = new int[splitLines.length];

        for(int i = 0; i < splitLines.length; i++){
            convertSplitLines[i] = Integer.parseInt(splitLines[i]);
        }

        return convertSplitLines;
    }

    public int[] bubbleSort(String splitLines[]){
        int []convertSplitLines = convertToInt(splitLines);
        int temp = 0;

        for(int i = 0; i < convertSplitLines.length; i++){
            for (int j = 0; j < (convertSplitLines.length - j) - 1; j++){
                if(convertSplitLines[j] > convertSplitLines[j + 1]){
                    temp = convertSplitLines[j];
                    convertSplitLines[j] = convertSplitLines[j + 1];
                    convertSplitLines[j + 1] = temp;
                }
            }
        }

        return convertSplitLines;
    }
}
