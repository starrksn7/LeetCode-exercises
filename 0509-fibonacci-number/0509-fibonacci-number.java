class Solution {
    public int fib(int n) {
        int fibOne = 0;
        int fibTwo = 1;
        int fibThree = 1;
        
        if(n <= 1){
            return n;
        }
        
        for(int i = 0; i < n - 1; i++){
            fibThree = fibOne + fibTwo;
            fibOne = fibTwo;
            fibTwo = fibThree;
        }
        
        return fibThree;
    }
}