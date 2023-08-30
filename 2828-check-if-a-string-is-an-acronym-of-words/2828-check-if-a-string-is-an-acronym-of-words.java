class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size() != s.length()){
            return false;
        }
        
        int index = 0;
        
        for(String word : words){
            if(word.charAt(0) != s.charAt(index)){
                return false;
            }
            index++;
        }
        return true;
    }
}