class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character, Integer> map = new HashMap<>();
       char[] ransomChars = ransomNote.toCharArray();
       char[] magChars = magazine.toCharArray();
        
       for(char character : magChars){
           if(map.containsKey(character)){
               map.put(character, map.get(character) + 1);
           } else {
               map.put(character, 1);
           }
       } 
        
       for(char character : ransomChars){
           if(!map.containsKey(character) || map.get(character) < 1){
               return false;
           } else {
               map.put(character, map.get(character) - 1);
           }
       }
        
        return true;
    }
}