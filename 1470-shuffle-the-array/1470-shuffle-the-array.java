class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        
        for(int i = 0; i < n; i++){
            array1[i] = nums[i];
        }
        
        for(int j = n; j < nums.length; j++){
            array2[j - n] = nums[j];
        }
        
        int[] output = new int[nums.length];
        int oddIndex = 1;
        int evenIndex = 0;
        
        for(int k = 0; k < array1.length; k++){
            output[evenIndex] = array1[k];
            output[oddIndex] = array2[k];
            evenIndex += 2;
            oddIndex += 2;
        }
        
        return output;
    }
}