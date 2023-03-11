class Solution {
    public int countDigits(int num) {
        int divisors = 0;
        int numDuplicate = num;
        
        while(numDuplicate > 0) {
            int lastDigit = numDuplicate % 10;
            
            if(num % lastDigit == 0){
                divisors++;
            }
            
            numDuplicate /= 10;
        }
        return divisors;
    }
}