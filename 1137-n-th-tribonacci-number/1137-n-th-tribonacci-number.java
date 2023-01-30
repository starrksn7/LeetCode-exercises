class Solution {
    public int tribonacci(int n) {
        
        int firstNum = 0;
        int secondNum = 1;
        int thirdNum = 1;
        int runningTotal = 0;
        for(int i = 0; i <= n; i++){
            if(i == 0){
                runningTotal = 0;
            } else if (i == 1 || i == 2) {
                runningTotal = 1;
            } else {
                runningTotal = firstNum + secondNum + thirdNum;
            firstNum = secondNum;
            secondNum = thirdNum;
            thirdNum = runningTotal;
            }
            
            
            
        }
        
        return runningTotal;
    }
}