class Solution {
    public int xorOperation(int n, int start) {
        int[] array = new int[n];
            
        for(int i = 0; i < n; i++){
            array[i] = start + 2 * i;
        }
        
        int result = array[0];
        
        for(int j = 1; j < array.length; j++){
            result ^= array[j];
        }
        
        return result;
    }
}