class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lesser = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        
        for(int num : nums){
            if(num < pivot){
                lesser.add(num);
            } else if(num > pivot){
                greater.add(num);
            } else {
                equal.add(num);
            }
        }
        
       List<Integer> combined = new ArrayList<Integer>(lesser);
        combined.addAll(equal);
        combined.addAll(greater);
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = combined.get(i);
        }
        return nums;
    }
}