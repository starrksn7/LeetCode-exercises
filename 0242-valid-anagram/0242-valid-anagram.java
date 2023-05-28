class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        String[] array1 = s.split("");
        String[] array2 = t.split("");
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        for(int i = 0; i < array1.length; i++){
            if(!array1[i].equals(array2[i])){
                return false;
            }
        }
        return true;
    }
}