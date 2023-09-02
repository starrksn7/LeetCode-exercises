class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        
        for(String word : word1){
            for(int i = 0; i < word.length(); i++){
                list1.add(word.charAt(i));
            }
        }
        
        for(String word : word2){
            for(int i = 0; i < word.length(); i++){
                list2.add(word.charAt(i));
            }
        }
        
        return list1.equals(list2);
    }
}