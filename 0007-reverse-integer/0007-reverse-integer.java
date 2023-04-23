class Solution {
    public int reverse(int x) {
        int total = 0;
        
        while (x != 0){
            
            int number = x % 10;
            int newTotal = total * 10 + number;         
            x /= 10;
            if((newTotal - number) / 10 != total) {
                return 0;
            }
            total = newTotal; 
        }
        return total;
    }
}