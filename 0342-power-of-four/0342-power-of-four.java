class Solution {
    public boolean isPowerOfFour(int n) {
        int power = 0;
        
        while(Math.pow(4, power) <= n){
            if(n == Math.pow(4, power)){
                return true;
            }
            power++;
        }
        
        return false;
    }
}