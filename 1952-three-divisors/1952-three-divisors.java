class Solution {
    public boolean isThree(int n) {
        int result = 2;
        
        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0){
                result++;
            }
        }
        
        return result == 3;
    }
}