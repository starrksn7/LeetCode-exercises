class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        
        while(columnNumber != 0){
            char letter = (char)((columnNumber - 1) % 26 + 'A');
            columnNumber = (columnNumber - 1) / 26;
            result = letter + result;
        }
        
        return result;
    }
}