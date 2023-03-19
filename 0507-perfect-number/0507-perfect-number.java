class Solution {
    public boolean checkPerfectNumber(int num) {
        int divisorSum = 1;
        int squareRoot =(int)Math.sqrt(num);
        
        if(num == 1){
            return false;
        }
        
        for(int i = 2; i <= squareRoot; i++){
            if(num % i == 0){
                divisorSum += i;
                divisorSum += num / i;
            }
        }
       
        return divisorSum == num;
    }
}