class Solution {
    public boolean checkRecord(String s) {
        int totalAbsent = 0;
        int consecutiveLate = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A') {
                totalAbsent++;
                consecutiveLate = 0;
            } else if(s.charAt(i) == 'L') {
                consecutiveLate++;
                if(consecutiveLate == 3){
                    return false;
                }
            } else {
                consecutiveLate = 0;
            }
        }
        
        return totalAbsent < 2;
    }
}