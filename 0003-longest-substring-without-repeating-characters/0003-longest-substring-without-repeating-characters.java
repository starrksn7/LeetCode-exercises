class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s.length() == 1){
            return s.length() == 1 ? 1 : 0;
        }
        
        int result = 0;
        
        for(int i = 0; i < s.length() - 1; i++){
            
            List<Character> list = new ArrayList<>();
            list.add(s.charAt(i));
            
            for(int j = i + 1; j < s.length(); j++){
                if(!list.contains(s.charAt(j))){
                    list.add(s.charAt(j));
                } else {
                    break;
                }
            }
           
            
            if(list.size() > result){
                result = list.size();
            }
        }
        return result;
    }
}
