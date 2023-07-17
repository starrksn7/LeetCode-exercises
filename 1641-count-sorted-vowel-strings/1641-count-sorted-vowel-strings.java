class Solution {
    public int countVowelStrings(int n) {
        int result = 0;
        for(int i = 0; i <= n + 1; i++){
            int total = 0;
            for(int j = 1; j <= i; j++){
                total += j;
                result += total;
            }
        }
        
        return result;
    }
}