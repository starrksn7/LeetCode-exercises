class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = nums.length - 1; i >= 0; i--){
            stack.push(nums[i]);
        }
        
        int[] results = new int[nums.length];
        
        for(int i = nums.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= nums[i]){
                stack.pop();
            }
            
            if(stack.empty()){
                results[i] = -1;
            } else {
                results[i] = stack.peek();
            }
            
            stack.push(nums[i]);
        }
        
        return results;
    }
}

