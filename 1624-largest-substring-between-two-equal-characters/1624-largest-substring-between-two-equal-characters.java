class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int result = -1;
        
        for(int i = 0; i < s.length() - 1; i++){
            int high = -1;
            
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    if(j - i - 1 > high){
                        high = j - i - 1;
                    }
                }
            }
            if(high > result){
                result = high;
            }
        }
        
        return result;
    }
}