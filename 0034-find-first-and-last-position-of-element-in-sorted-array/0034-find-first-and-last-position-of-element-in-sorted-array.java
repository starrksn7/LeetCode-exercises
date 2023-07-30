
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        
        List<Integer> list = new ArrayList<>();
        
        for(int num : nums){
            list.add(Integer.valueOf(num));
        }
        
        result[0] = list.indexOf(target);
        result[1] = list.lastIndexOf(target);
        
        return result;
    }
}