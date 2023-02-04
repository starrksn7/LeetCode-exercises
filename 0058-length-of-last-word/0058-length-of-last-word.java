class Solution {
    public int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        
        int output = array[array.length - 1].length();
              
        return output;
    }
}