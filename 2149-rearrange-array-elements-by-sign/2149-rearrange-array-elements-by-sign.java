class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positives = new int[nums.length / 2];
        int[] negatives = new int[nums.length / 2];
        int negativeCounter = 0;
        int positiveCounter = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                negatives[negativeCounter] = nums[i];
                negativeCounter++;
            } else {
                positives[positiveCounter] = nums[i];
                positiveCounter++;
                }
        }
        System.out.println(Arrays.toString(positives));
                    System.out.println(Arrays.toString(negatives));

        int[] reorderedArray = new int[nums.length];
        int smallArrayCounter = 0;
        for(int j = 0; j < nums.length - 1; j += 2){
            reorderedArray[j] = positives[smallArrayCounter];
            reorderedArray[j + 1] = negatives[smallArrayCounter];
            smallArrayCounter++;
        }
        
        return reorderedArray;
    }
}