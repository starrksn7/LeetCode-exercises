class Solution {
    public boolean isPerfectSquare(int num) {
      
        int digit = 1;
        
        while (num > 0){
            num -= digit;
            digit += 2;
        }
        
        return num == 0;
    }
}