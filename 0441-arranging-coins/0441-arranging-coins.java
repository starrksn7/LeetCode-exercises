class Solution {
    public int arrangeCoins(int n) {
        List<Integer> stairs = new ArrayList<>();
        
        if(n == 1){
            return 1;
        }
        
        for(int i = 1; n > 0; i++){
            
            if(n < i || n - i < 0){
                stairs.add(n);
                n = 0;
            } else {
                stairs.add(i);
                n -= i;
            }
        }
        
        if(stairs.get(stairs.size() - 1) <= stairs.get(stairs.size() - 2)){
            return stairs.size() - 1;
        }
        
        return stairs.size();
    }
}