class Solution {
    public int smallestEqual(int[] nums) {
        int lowestIndex = Integer.MAX_VALUE;
        boolean indexFound = false;
        for(int i = 0; i < nums.length; i++){
            if(i % 10 == nums[i]){
                if(i < lowestIndex){
                    lowestIndex = i;
                    indexFound = true;
                }
            }
        }
        
        return indexFound ? lowestIndex : -1;
    }
}