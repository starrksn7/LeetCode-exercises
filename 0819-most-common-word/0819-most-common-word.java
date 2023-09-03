class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] array = paragraph.toLowerCase().split("[ !?',;.]+");
            
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String word : array){               
            map.put(word, map.getOrDefault(word, 0) + 1);            
        }
  
        for(String string : banned){
           if(map.containsKey(string)){
               map.remove(string);
           }
        }
        
        String result = null;
        
        for(String entry : map.keySet()){
            if(result == null || map.get(entry) > map.get(result)){
                result = entry;
            }
        }
        
        return result;
    }
}