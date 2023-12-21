class Solution {
    public int getMaximumGenerated(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        int max = Integer.MIN_VALUE;
            
        for(int i = 2; i <= n; i++){
            if(i % 2 == 0){
                array[i] = array[i / 2];
            } else {
                array[i] = array[i / 2] + array[i / 2 + 1];
            }
            
            max = Math.max(max, array[i]);
        }
        
        return max;
    }
}