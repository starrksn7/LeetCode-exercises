class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        List<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        int total = 0;
        
        for(int i = left; i <= right; i++){
            if(vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length() - 1))){
                total++;
            }
        }
        
        return total;
    }
}