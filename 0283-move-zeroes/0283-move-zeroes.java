class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        
        for(int num : nums){
            if(num != 0){
                queue.add(num);
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(queue.peek() != null){
                nums[i] = queue.remove();
            } else {
                nums[i] = 0;
            }
        }
    }
}