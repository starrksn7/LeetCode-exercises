class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        
        int times = 0;
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(times == 0){
                times = entry.getValue();
            } else if (entry.getValue() != times){
                return false;
            }   
        }
        
        return true;
    }
}