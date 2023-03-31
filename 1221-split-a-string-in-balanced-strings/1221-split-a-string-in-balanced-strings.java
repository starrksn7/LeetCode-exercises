class Solution {
    public int balancedStringSplit(String s) {
        int balanceCounter = 0;
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L'){
                balanceCounter++;
            } else if(s.charAt(i) == 'R'){
                balanceCounter--;
            }
            
            if(balanceCounter == 0){
                answer++;
            }
        }
        
        return answer;
    }
}