class Solution {
    public String restoreString(String s, int[] indices) {
        String[] splitString = s.split("");
        
        String[] array = new String[indices.length];
        StringBuffer string = new StringBuffer();
        
        for(int i = 0; i < indices.length; i++){
            array[indices[i]] = splitString[i];
        }
        
        for(int j = 0; j < array.length; j++){
            string.append(array[j]);
        }
        
        return string.toString();
    }
}