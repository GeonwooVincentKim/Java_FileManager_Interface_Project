package TypeConverter;

public class TypeConverter {
    public int[] convertToInt(String splitLines[]){
        int []convertSplitLines = new int[splitLines.length];

        for(int i = 0; i < splitLines.length; i++){
            convertSplitLines[i] = Integer.parseInt(splitLines[i]);
        }

        return convertSplitLines;
    }
}
