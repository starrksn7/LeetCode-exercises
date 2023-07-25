class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak = 0;
        int tallest = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > tallest){
                peak = i;
                tallest = arr[i];
            }
        }
        return peak;
    }
}