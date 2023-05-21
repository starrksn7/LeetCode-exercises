class Solution {
    public boolean wordPattern(String pattern, String s) {
       Map<Character, String> map = new HashMap<>();
        
        String[] splitS = s.split(" ");
        
        if(splitS.length != pattern.length()){
            return false;
        }
        
        for(int i = 0; i < pattern.length(); i++){
           char character = pattern.charAt(i);
            if(map.containsKey(character)){
                if(!map.get(character).equals(splitS[i])){
                    return false;
                }
            } else {
                if(map.containsValue(splitS[i])){
                    return false;
                }
                map.put(character, splitS[i]);
            }
        }
        return true;  
    }
         
}
               