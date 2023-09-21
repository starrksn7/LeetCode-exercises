class Solution {
    public boolean detectCapitalUse(String word) {
        int capital = 0;
        
        for(int i = 0; i < word.length(); i++){
            Character letter = Character.valueOf(word.charAt(i));
            
            if(Character.isUpperCase(letter)){
                capital++;
            }
        }
        Character first = Character.valueOf(word.charAt(0));
        
        return (capital == 1 && Character.isUpperCase(first)) || capital == word.length() || capital == 0;
    }
}